/*
 * Copyright (C) 2014 The Waffleshop
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.thewaffleshop.passwd.model;


/**
 * Contains fields common to all entities
 *
 * @author Robert Hollencamp
 */
public class Entity
{
	private Long uid;
	private Long version;
	private Long created;
	private Long updated;

	public Long getUid()
	{
		return uid;
	}

	public void setUid(Long uid)
	{
		this.uid = uid;
	}

	public Long getVersion()
	{
		return version;
	}

	public void setVersion(Long version)
	{
		this.version = version;
	}

	public Long getCreated()
	{
		return created;
	}

	public void setCreated(Long created)
	{
		this.created = created;
	}

	public Long getUpdated()
	{
		return updated;
	}

	public void setUpdated(Long updated)
	{
		this.updated = updated;
	}
}
