package eu.veldsoft.no.thanks;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import eu.veldsoft.no.thanks.model.Table;

/**
 * Main game screen.
 */
public class GameActivity extends AppCompatActivity {
    /**
     * The identifier for launching activity.
     */
    private static final int LAUNCH_PLAYERS_LIST_ACTIVITY = 1;

    /**
     * Table object as mediator with the model.
     */
    private Table table = null;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.game_option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.new_game) {
            startActivityForResult(new Intent(GameActivity.this, PlayersActivity.class), LAUNCH_PLAYERS_LIST_ACTIVITY);
            //findViewById(R.id.table).setVisibility(View.VISIBLE);
        }

        if (item.getItemId() == R.id.save_game) {

        }

        if (item.getItemId() == R.id.load_game) {

        }

        if (item.getItemId() == R.id.end_turn) {

        }

        if (item.getItemId() == R.id.player_report) {

        }

        if (item.getItemId() == R.id.end_report) {

        }

        if (item.getItemId() == R.id.help) {
            startActivity(new Intent(GameActivity.this, HelpActivity.class));
        }

        if (item.getItemId() == R.id.about) {
            startActivity(new Intent(GameActivity.this, AboutActivity.class));
        }

        if (item.getItemId() == R.id.exitt) {
            GameActivity.this.finish();
        }

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        /*
         * Do not handle other results than OK.
         */
        if (resultCode != RESULT_OK) {
            return;
        }

        if (requestCode == LAUNCH_PLAYERS_LIST_ACTIVITY) {
            List<String> names = new ArrayList<String>();

            if (data.getBooleanExtra("player1Enabled", false)) {
                names.add(data.getCharSequenceExtra("player1Name").toString());
            }
            if (data.getBooleanExtra("player2Enabled", false)) {
                names.add(data.getCharSequenceExtra("player2Name").toString());
            }
            if (data.getBooleanExtra("player3Enabled", false)) {
                names.add(data.getCharSequenceExtra("player3Name").toString());
            }
            if (data.getBooleanExtra("player4Enabled", false)) {
                names.add(data.getCharSequenceExtra("player4Name").toString());
            }
            if (data.getBooleanExtra("player5Enabled", false)) {
                names.add(data.getCharSequenceExtra("player5Name").toString());
            }
            if (data.getBooleanExtra("player6Enabled", false)) {
                names.add(data.getCharSequenceExtra("player6Name").toString());
            }
            if (data.getBooleanExtra("player7Enabled", false)) {
                names.add(data.getCharSequenceExtra("player7Name").toString());
            }

            /*
             * Convert the list of names to array of names.
             */
            if (table.newGame(names.toArray(new String[0])) == false) {
                Toast.makeText(GameActivity.this, R.string.game_was_not_started_message, Toast.LENGTH_LONG).show();
            }
        }
    }
}