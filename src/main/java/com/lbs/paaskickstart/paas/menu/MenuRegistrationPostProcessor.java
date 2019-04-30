package com.lbs.paaskickstart.paas.menu;

import com.lbs.base.config.proxy.LbsBaseInvocationHandler;
import com.lbs.oauthclient.idm.menu.ApiClient;
import com.vaadin.spring.annotation.SpringUI;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MenuRegistrationPostProcessor implements BeanPostProcessor
{
	@Autowired
	SynchTaskRunnerManager synchTaskRunnerManager;
	@Autowired
	private MenuRegistrationService menuRegistrationService;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("vaadinUiForwardingHandlerMapping".equals(beanName))
		{
			Set<String> keys = ((SimpleUrlHandlerMapping)bean).getUrlMap().keySet();
			List<String> values = keys.stream().filter(e-> !e.endsWith("/")).collect(Collectors.toList());
			menuRegistrationService.registerMenu(values);
			return bean;
//			return addSynchTaskRunnerCapabilityToRepositoryBean(bean, SimpleUrlHandlerMapping.class);
		}

		return bean;
	}

	Object addSynchTaskRunnerCapabilityToRepositoryBean(Object repositoryBean, Class<?> ... interfaces)
	{
		final InvocationHandler invocationHandler = new RepositoryMethodInvocationHandler(repositoryBean);
		final Object proxy = Proxy.newProxyInstance(getClass().getClassLoader(), interfaces, invocationHandler);
		return proxy;
	}	

	class RepositoryMethodInvocationHandler extends LbsBaseInvocationHandler
	{
		public RepositoryMethodInvocationHandler(Object wrappedObject) {
			super(wrappedObject);
		}

		@Override
		protected Object internalInvoke(Object proxy, Method method, Object[] args) throws Throwable {
        	// Always save NotificationCatchEvent events into system tenant db regardless of the current tenant.
			final Object result = synchTaskRunnerManager.getSynchTaskRunner().run(() -> {
				System.out.println(args);
				return new Object();
        	});

			return result;
		}
	}
}