package com.microsoft.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {


    //region Description

    private Button mTrueButton;
    private Button mFalseButton;
    //endregion
    ////////////////////////////////
    /// the on create
    ////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        this.mTrueButton = (Button)findViewById(R.id.true_button);
        this.mFalseButton = (Button)findViewById(R.id.false_button);
    }

    ////////////////////////////////
    /// the on
    ////////////////////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    ////////////////////////////////
    /// the on
    ////////////////////////////////
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
