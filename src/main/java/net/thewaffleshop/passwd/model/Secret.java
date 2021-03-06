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
 *
 * @author Robert Hollencamp
 */
public class Secret extends Entity
{
	private Account account;
	private byte[] encryptedSecret;
	private byte[] iv;

	public Account getAccount()
	{
		return account;
	}

	public void setAccount(Account account)
	{
		this.account = account;
	}

	public void setEncryptedSecret(byte[] encryptedSecret)
	{
		this.encryptedSecret = encryptedSecret;
	}

	public byte[] getEncryptedSecret()
	{
		return encryptedSecret;
	}

	public byte[] getIv()
	{
		return iv;
	}

	public void setIv(byte[] iv)
	{
		this.iv = iv;
	}
}
