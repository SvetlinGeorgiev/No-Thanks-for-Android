package eu.veldsoft.no.thanks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Initial menu screen.
 */
public class MenuActivity extends AppCompatActivity {

    /**
     * This method is called when the activity is first created.
     * It initializes the activity and sets its content view.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
         * Call the superclass's onCreate method to perform necessary initialization.
         */
        super.onCreate(savedInstanceState);

        /*
         * Set the content view of this activity to the layout defined in 'activity_menu.xml'.
         */
        setContentView(R.layout.activity_menu);

        /*
         * Open new game screen.
         */
        findViewById(R.id.single_game).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MenuActivity.this, GameActivity.class);
                        startActivity(intent);
                    }
                }
        );

        /*
         *  Start host screen for multiplayer game.
         */
        findViewById(R.id.join_game).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        Intent intent = new Intent(MenuActivity.this, JoinActivity.class);
//                        startActivity(intent);
                    }
                }
        );

        /*
         *  Start host screen for multiplayer game.
         */
        findViewById(R.id.host_game).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        Intent intent = new Intent(MenuActivity.this, HostActivity.class);
//                        startActivity(intent);
                    }
                }
        );


        /*
         *  Application exit.
         */
        findViewById(R.id.exit_game).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MenuActivity.this.finish();
                    }
                }
        );
    }
}