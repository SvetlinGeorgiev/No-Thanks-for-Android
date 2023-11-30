package eu.veldsoft.no.thanks;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Screen for the player report.
 */
public class PlayerReportActivity extends AppCompatActivity {

    /**
     * {@inheritDoc}
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_report);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onStart() {
        super.onStart();

        ((TextView) findViewById(R.id.playerReportText)).setText(getIntent().getStringExtra("report"));
    }
}