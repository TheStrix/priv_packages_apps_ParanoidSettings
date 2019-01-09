package com.paranoid.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v14.preference.PreferenceFragment;
import android.support.v7.preference.ListPreference;

public class BatteryStyleSettings extends PreferenceActivity {
    private final String TAG = "BatteryStyleSettings";
    private ListPreference mBatteryStylePref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new BatteryStylePreference()).commit();
    }

    private class BatteryStylePreference extends PreferenceFragment {
        private static final String KEY_BATTERY_STYLE = "battery_style";

        @Override
        public void onCreatePreferences(Bundle bundle, String s) {
            addPreferencesFromResource(R.xml.battery_panel);
        }
    }
}
