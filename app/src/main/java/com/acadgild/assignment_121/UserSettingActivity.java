package com.acadgild.assignment_121;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * used to inflate the settings page.
 * The class extends PrefenceActivity
 */

public class UserSettingActivity extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.user_settings);
    }
}