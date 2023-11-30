package eu.veldsoft.no.thanks;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Initial splash screen.
 */
public class SplashActivity extends AppCompatActivity {
    /**
     * Timeout to switch to product functional screens.
     */
    private long timeout = 0L;

    /**
     * Screen to load after the ad timeout.
     */
    private String redirect = "";

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
         * Set the theme for this activity. Replace 'ntfa' with your actual theme name.
         */
        setTheme(R.style.no_thanks_theme);

        /*
         * Call the super class's onCreate method to perform necessary initialization.
         */
        super.onCreate(savedInstanceState);

        /*
         * Set the content view of this activity to the layout defined in 'activity_splash.xml'.
         */
        setContentView(R.layout.activity_splash);

        /*
         * Activate JavaScript for a WebView with the ID 'ads'.
         */
        ((WebView) findViewById(R.id.ads)).getSettings().setJavaScriptEnabled(
                true);

        /*
         * Load local web page as banner holder.
         */
        ((WebView) findViewById(R.id.ads))
                .loadUrl("file:///android_asset/banner.html");

        /*
         * Get the splash screen timeout from the AndroidManifest.xml metadata.
         */
        try {
            timeout = getPackageManager().getActivityInfo(
                    this.getComponentName(),
                    PackageManager.GET_ACTIVITIES
                            | PackageManager.GET_META_DATA).metaData.getInt(
                    "timeout", 0);
        } catch (Exception e) {
            /*
             * If an exception occurs, set the timeout to 0.
             */
            timeout = 0;
        }

        /*
         * Get the splash screen timeout.
         */
        try {
            timeout = getPackageManager().getActivityInfo(
                    this.getComponentName(),
                    PackageManager.GET_ACTIVITIES
                            | PackageManager.GET_META_DATA).metaData.getInt(
                    "timeout", 0);
        } catch (Exception e) {
            /*
             * If an exception occurs, set the timeout to 0.
             */
            timeout = 0;
        }

        /*
         * Get redirect activity class name.
         */
        try {
            redirect = getPackageManager().getActivityInfo(
                            this.getComponentName(),
                            PackageManager.GET_ACTIVITIES
                                    | PackageManager.GET_META_DATA).metaData
                    .getString("redirect");
        } catch (Exception e) {
            /*
             * If an exception occurs, set the 'redirect' to this activity's class name
             * and show a Toast message indicating the redirect activity is missing.
             */
            redirect = this.getClass().toString();
            Toast.makeText(
                    this,
                    getResources().getString(
                            R.string.redirect_activity_is_missing_message),
                    Toast.LENGTH_LONG).show();
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected void onResume() {
        super.onResume();

        /*
         * On resume there is no need to show the ads.
         */
        new Timer().schedule(new TimerTask() {
            public void run() {
                try {
                    startActivity(new Intent(SplashActivity.this, Class
                            .forName(redirect)));
                } catch (Exception e) {
                }
            }
        }, timeout);
    }
}
