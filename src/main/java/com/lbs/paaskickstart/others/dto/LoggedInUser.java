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

import java.io.Serializable;


public interface LoggedInUser extends Serializable {

  String getId();

  String getFirstName();

  String getLastName();

  String getFullName();

  boolean isAdmin();

  Token getToken();

  String getTenantId();

  void setTenantId(String tenantId);

  void setAdmin(boolean isAdmin);

  void setId(String id);

  void setFirstName(String firstName);

  void setLastName(String lastName);

  void setToken(Token token);

}
