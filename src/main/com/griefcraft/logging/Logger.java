/**
 * This file is part of LWC (https://github.com/Hidendra/LWC)
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

package com.griefcraft.logging;

import com.griefcraft.lwc.LWCInfo;

public class Logger {

	public void info(String str) {
		System.out.println(String.format("%s\t[v%s]\t%s", name, LWCInfo.FULL_VERSION, str));
	}

	/**
	 * Create a new logger
	 * 
	 * @param name
	 * @return
	 */
	public static Logger getLogger(String name) {
		return new Logger(name);
	}

	/**
	 * Logger name
	 */
	private String name;

	private Logger(String name) {
		this.name = name;
	}

}
