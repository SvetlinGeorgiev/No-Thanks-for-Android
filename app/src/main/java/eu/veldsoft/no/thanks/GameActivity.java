package eu.veldsoft.no.thanks;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main game screen.
 */
public class GameActivity extends AppCompatActivity {

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
}