package com.example.ted.sharedpref2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    TextView tv = (TextView) findViewById(R.id.textView2);
    String file = getPackageName() + "myFile";
    SharedPreferences sp = getSharedPreferences(file, Context.MODE_PRIVATE);

    String lname = sp.getString("lname", "na");
    String fname = sp.getString("fname", "na");
    tv.setText(String.format("%s , %s", lname, fname));

  }
}
