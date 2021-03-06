/**
 * Copyright (C) 2012-2014 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.service;

import net.gtaun.shoebill.Shoebill;

import java.util.Collection;

/**
 * 
 * 
 * @author MK124
 */
public interface ServiceStore
{
	public static ServiceStore get()
	{
		return Shoebill.get().getServiceStore();
	}
	
	
	<T extends Service> T getService(Class<T> type);
	<T extends Service> ServiceEntry getServiceEnrty(Class<T> type);
	
	<T extends Service> boolean isServiceAvailable(Class<T> type);
	
	Collection<ServiceEntry> getServiceEntries();
}
