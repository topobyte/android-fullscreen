// Copyright 2016 Sebastian Kuerten
//
// This file is part of fullscreen.
//
// fullscreen is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// fullscreen is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with fullscreen. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.android.fullscreen;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.Window;
import android.view.WindowManager;

import de.topobyte.fullscreen.R;

public class FullscreenUtil {

  public static void setupFullScreen(Context context, SharedPreferences preferences, Window window)
  {
    String prefKey = context.getString(R.string.pref_key_fullscreen);
    if (preferences.getBoolean(prefKey, false)) {
      window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
      window.clearFlags(
          WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
    } else {
      window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
      window.addFlags(
          WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
    }
  }

}
