package com.example.android.appen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv1;                                           // The tv1 TextView from the activity_main.xml


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);            // Instantiate the tv1 TextView.
        tv1.setText("A plain TextView.");
        tv1.append("\nwith some text.");

    }
}
