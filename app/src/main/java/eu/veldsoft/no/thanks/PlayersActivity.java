package eu.veldsoft.no.thanks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Screen with the players' information.
 */
public class PlayersActivity extends AppCompatActivity {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
         * Set the layout for this activity
         */
        setContentView(R.layout.activity_players);

        /*
         * Set up a click listener for the "Done" button
         */
        ((Button) findViewById(R.id.playersDone))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        /*
                         * Create an intent to pass data back to the calling activity
                         */
                        Intent intent = new Intent();

                        /*
                         * Retrieve and put data for each player
                         */
                        intent.putExtra("player1Enabled", ((CheckBox) findViewById(R.id.activePlayer1)).isChecked());
                        intent.putExtra("player1Name", ((EditText) findViewById(R.id.namePlayer1)).getText().toString());
                        intent.putExtra("player2Enabled", ((CheckBox) findViewById(R.id.activePlayer2)).isChecked());
                        intent.putExtra("player2Name", ((EditText) findViewById(R.id.namePlayer2)).getText().toString());
                        intent.putExtra("player3Enabled", ((CheckBox) findViewById(R.id.activePlayer3)).isChecked());
                        intent.putExtra("player3Name", ((EditText) findViewById(R.id.namePlayer3)).getText().toString());
                        intent.putExtra("player4Enabled", ((CheckBox) findViewById(R.id.activePlayer4)).isChecked());
                        intent.putExtra("player4Name", ((EditText) findViewById(R.id.namePlayer4)).getText().toString());
                        intent.putExtra("player5Enabled", ((CheckBox) findViewById(R.id.activePlayer5)).isChecked());
                        intent.putExtra("player5Name", ((EditText) findViewById(R.id.namePlayer5)).getText().toString());
                        intent.putExtra("player6Enabled", ((CheckBox) findViewById(R.id.activePlayer6)).isChecked());
                        intent.putExtra("player6Name", ((EditText) findViewById(R.id.namePlayer6)).getText().toString());

                        /*
                         * Set the result of the activity to indicate success and attach the intent with data
                         */
                        setResult(AppCompatActivity.RESULT_OK, intent);

                        /*
                         * Finish the activity and return to the calling activity
                         */
                        PlayersActivity.this.finish();
                    }
                });
    }
}
