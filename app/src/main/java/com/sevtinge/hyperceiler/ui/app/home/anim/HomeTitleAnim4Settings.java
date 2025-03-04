/*
 * This file is part of HyperCeiler.

 * HyperCeiler is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.

 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.

 * Copyright (C) 2023-2025 HyperCeiler Contributions
 */
package com.sevtinge.hyperceiler.ui.app.home.anim;

import com.sevtinge.hyperceiler.R;
import com.sevtinge.hyperceiler.ui.app.dashboard.DashboardFragment;

import fan.preference.SeekBarPreferenceCompat;

public class HomeTitleAnim4Settings extends DashboardFragment {
    SeekBarPreferenceCompat mDRCX;
    SeekBarPreferenceCompat mSRCX;
    SeekBarPreferenceCompat mDRCY;
    SeekBarPreferenceCompat mSRCY;
    SeekBarPreferenceCompat mDRW;
    SeekBarPreferenceCompat mSRW;
    SeekBarPreferenceCompat mDRR;
    SeekBarPreferenceCompat mSRR;
    SeekBarPreferenceCompat mDR;
    SeekBarPreferenceCompat mSR;
    SeekBarPreferenceCompat mDA;
    SeekBarPreferenceCompat mSA;

    @Override
    public int getPreferenceScreenResId() {
        return R.xml.home_title_anim_4;
    }

    @Override
    public void initPrefs() {
        mDRCX = findPreference("prefs_key_home_title_custom_anim_param_damping_RECT_CENTERX_4");
        mSRCX = findPreference("prefs_key_home_title_custom_anim_param_stiffness_RECT_CENTERX_4");
        mDRCY = findPreference("prefs_key_home_title_custom_anim_param_damping_RECT_CENTERY_4");
        mSRCY = findPreference("prefs_key_home_title_custom_anim_param_stiffness_RECT_CENTERY_4");
        mDRW = findPreference("prefs_key_home_title_custom_anim_param_damping_RECT_WIDTH_4");
        mSRW = findPreference("prefs_key_home_title_custom_anim_param_stiffness_RECT_WIDTH_4");
        mDRR = findPreference("prefs_key_home_title_custom_anim_param_damping_RECT_RATIO_4");
        mSRR = findPreference("prefs_key_home_title_custom_anim_param_stiffness_RECT_RATIO_4");
        mDR = findPreference("prefs_key_home_title_custom_anim_param_damping_RADIUS_4");
        mSR = findPreference("prefs_key_home_title_custom_anim_param_stiffness_RADIUS_4");
        mDA = findPreference("prefs_key_home_title_custom_anim_param_damping_ALPHA_4");
        mSA = findPreference("prefs_key_home_title_custom_anim_param_stiffness_ALPHA_4");

        mDRCX.setDefaultValue(900);
        mSRCX.setDefaultValue(400);
        mDRCY.setDefaultValue(900);
        mSRCY.setDefaultValue(400);
        mDRW.setDefaultValue(900);
        mSRW.setDefaultValue(400);
        mDRR.setDefaultValue(970);
        mSRR.setDefaultValue(350);
        mDR.setDefaultValue(900);
        mSR.setDefaultValue(400);
        mDA.setDefaultValue(900);
        mSA.setDefaultValue(400);

    }
}
