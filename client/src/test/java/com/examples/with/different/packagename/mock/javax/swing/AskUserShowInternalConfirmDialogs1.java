/*
 * Copyright (C) 2010-2018 Gordon Fraser, Andrea Arcuri and SmartUt
 * contributors
 *
 * This file is part of SmartUt.
 *
 * SmartUt is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3.0 of the License, or
 * (at your option) any later version.
 *
 * SmartUt is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with SmartUt. If not, see <http://www.gnu.org/licenses/>.
 */
package com.examples.with.different.packagename.mock.javax.swing;

import javax.swing.JOptionPane;

public class AskUserShowInternalConfirmDialogs1 {

	public int askInput1() {
		int ret = JOptionPane.showInternalConfirmDialog(null, "message", "title", JOptionPane.YES_NO_OPTION);
		if (ret == JOptionPane.YES_OPTION) {
			return 0;
		} else if (ret == JOptionPane.NO_OPTION) {
			return 1;
		} else if (ret == JOptionPane.CLOSED_OPTION) {
			return 2;
		} else {
			return 3;
		}
	}

}
