package yb.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
    }

    private void initButtons() {
        final Button
                spotify = (Button) findViewById(R.id.button_spotify_app),
                scores = (Button) findViewById(R.id.button_scores_app),
                library = (Button) findViewById(R.id.button_library_app),
                bigger = (Button) findViewById(R.id.button_built_it_bigger_app),
                capstone = (Button) findViewById(R.id.button_capstone);
        initSpotify(spotify);
        initScores(scores);
        initLibrary(library);
        initBigger(bigger);
        initCapstone(capstone);
    }

    private void initSpotify(Button spotify) {
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayWorkInProgress();
            }
        });
    }


    private void initScores(Button scores) {
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayWorkInProgress();
            }
        });
    }

    private void initLibrary(Button library) {
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayWorkInProgress();
            }
        });
    }

    private void initBigger(Button bigger) {
        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayWorkInProgress();
            }
        });
    }

    private void initCapstone(Button capstone) {
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayWorkInProgress();
            }
        });
    }

    private void displayWorkInProgress() {
        String workInProgress = getString(R.string.work_in_progress);
        Toast.makeText(this, workInProgress, Toast.LENGTH_SHORT).show();
    }

}
