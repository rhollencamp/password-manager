/*
 * Copyright 2013 Robert Hollencamp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package net.thewaffleshop.passwd.model.repository;

import java.util.List;
import net.thewaffleshop.passwd.model.Account;
import net.thewaffleshop.passwd.model.Secret;


/**
 *
 * @author Robert Hollencamp
 */
public class SecretRepository extends BaseRepository<Secret>
{
	public SecretRepository()
	{
		super(Secret.class);
	}

	/**
	 * Find all secrets for a given account
	 *
	 * @param account
	 * @return
	 */
	public List<Secret> findByAccount(Account account)
	{
		String hql = "SELECT s FROM Secret s WHERE s.account = :account";
		List<Secret> results = em
				.createQuery(hql, Secret.class)
				.setParameter("account", account)
				.getResultList();
		return results;
	}
}