package yb.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initSpotify(View spotify) {
        displayWorkInProgress();
    }

    public void initScores(View scores) {
        displayWorkInProgress();
    }

    public void initLibrary(View library) {
        displayWorkInProgress();
    }

    public void initBigger(View bigger) {
        displayWorkInProgress();
    }

    public void initReader(View reader) {
        displayWorkInProgress();
    }

    public void initCapstone(View capstone) {
        displayWorkInProgress();
    }

    private void displayWorkInProgress() {
        String workInProgress = getString(R.string.work_in_progress);
        Toast.makeText(this, workInProgress, Toast.LENGTH_SHORT).show();
    }

}
