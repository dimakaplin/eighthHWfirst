package com.dimakaplin143.difftheme;

import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;

    public final static int THEME_GREEN = 0;
    public final static int THEME_BLACK = 1;
    public final static int THEME_BLUE = 2;
    private static int lang = 0;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_GREEN:
                activity.setTheme(R.style.GreenTheme);
                break;
            case THEME_BLACK:
                activity.setTheme(R.style.BlackTheme);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.BlueTheme);
                break;
        }
    }

    public static void changeLang(int newLang) {
        lang = newLang;
    }

    public static int getLang() {
        return lang;
    }
    public static int getTheme() {
        return sTheme;
    }
}