/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lbs.paaskickstart.others.dto;

import com.lbs.oauthclient.common.Token;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("neverFailSession")
public class LoggedInUserImpl implements LoggedInUser {


	private String id;
	private String firstName;
	private String lastName;
	private boolean isAdmin;
	private Token token;
	private String tenantId;


	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return firstName;
	}

	@Override
	public String getFullName() {
		return firstName + " " + lastName;
	}

	@Override
	public boolean isAdmin() {
		return isAdmin;
	}

	@Override
	public Token getToken() {
		return token;
	}

	@Override
	public String getTenantId() {
		return tenantId;
	}

	@Override
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void setToken(Token token) {
		this.token = token;
	}
}
