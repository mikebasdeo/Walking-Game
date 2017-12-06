package com.example.mike.myapplication_2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    String appTitle = "Dog Counter";
    TextView scoreMike;
    TextView scoreLorena;
    String FILENAME = "dog_scores";

    //Attempt at saving data



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Dog Counter");

        //Connect text output fields for score
        scoreMike = (TextView)findViewById(R.id.scoreMike);
        scoreLorena = (TextView)findViewById(R.id.scoreLorena);


        //Connect Button using it's id to a variable button
        Button mikeBtn = (Button)findViewById(R.id.btnMike);
        Button lorenaBtn = (Button)findViewById(R.id.btnLorena);

        //Mike's Button
        mikeBtn.setOnClickListener(new View.OnClickListener()
                                   {
                                       //Override default onclick method
                                       @Override
                                       public void onClick(View view)
                                       {
                                           int currentScore = Integer.parseInt(scoreMike.getText().toString());
                                           scoreMike.setText(Integer.toString(currentScore + 1));

                                       }
                                   }
        );

        //Lorena's Button
        lorenaBtn.setOnClickListener(new View.OnClickListener()
                                   {
                                       //Override default onclick method
                                       @Override
                                       public void onClick(View view)
                                       {
                                           int currentScore = Integer.parseInt(scoreLorena.getText().toString());
                                           scoreLorena.setText(Integer.toString(currentScore + 1));
                                       }
                                   }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
