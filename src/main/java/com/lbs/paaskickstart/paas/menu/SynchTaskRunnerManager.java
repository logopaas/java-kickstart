package com.lbs.paaskickstart.paas.menu;

import com.lbs.base.config.thread.LbsSynchTaskRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SynchTaskRunnerManager
{
    private int threads=50;

    private int queueSize=1000;

	LbsSynchTaskRunner lbsSynchTaskRunner;

	public LbsSynchTaskRunner getSynchTaskRunner()
	{
		return lbsSynchTaskRunner;
	}

	@PostConstruct
	void init()
	{
		lbsSynchTaskRunner = new LbsSynchTaskRunner("CommonTaskRunner", threads, queueSize);
	}
}