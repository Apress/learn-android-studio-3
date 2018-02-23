package com.example.ted.sharedpref2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btnsave = (Button) findViewById(R.id.btnsave);
    Button btnload = (Button) findViewById(R.id.btnload);

    final EditText etlastname = (EditText) findViewById(R.id.etlastname);
    final EditText etfirstname = (EditText) findViewById(R.id.etfirstname);
    final TextView tv = (TextView) findViewById(R.id.textView);

    btnsave.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        String file = getPackageName() + "myFile";
        SharedPreferences sp = getSharedPreferences(file, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();

        String lname = etlastname.getText().toString();
        String fname = etfirstname.getText().toString();

        edit.putString("lname", lname);
        edit.putString("fname", fname);
        edit.apply();

        Toast.makeText(MainActivity.this, "Saved it", Toast.LENGTH_SHORT).show();
      }
    });

    btnload.setOnClickListener(new View.OnClickListener(){

      @Override
      public void onClick(View view) {
        /*
        SharedPreferences sp = getPreferences(Context.MODE_PRIVATE);
        String lname = sp.getString("lname", "na");
        String fname = sp.getString("fname", "na");
        tv.setText(String.format("%s , %s", lname, fname));
        */
        Intent intent = new Intent(MainActivity.this, Second.class);
        startActivity(intent);
      }
    });

  }
}
