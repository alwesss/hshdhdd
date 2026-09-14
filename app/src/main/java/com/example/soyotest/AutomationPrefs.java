package com.example.soyotest;

import android.content.Context;
import android.content.SharedPreferences;

public final class AutomationPrefs {
    static final String PREFS = "soyo_ui_test_runner";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TARGET = "target_package";
    static final String KEY_TTL = "ttl_minutes";
    static final String KEY_RUNNING = "running";
    static final String KEY_STATUS = "status";
    static final String KEY_SENT = "sent_count";
    static final String KEY_SKIPPED = "skipped_count";
    static final String KEY_LAST = "last_profile";

    private AutomationPrefs() {}

    static SharedPreferences get(Context c) {
        return c.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    static String message(Context c) {
        return get(c).getString(KEY_MESSAGE, "Merhaba");
    }

    static String target(Context c) {
        return get(c).getString(KEY_TARGET, "com.haflla.soulu").trim();
    }

    static long ttlMillis(Context c) {
        int minutes = get(c).getInt(KEY_TTL, 60);
        if (minutes < 1) minutes = 60;
        return minutes * 60_000L;
    }

    static boolean running(Context c) {
        return get(c).getBoolean(KEY_RUNNING, false);
    }

}
