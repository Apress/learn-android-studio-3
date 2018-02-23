package com.example.ted.getresultssubactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  private static final int REQUEST_CODE = 1000;
  Button b;
  TextView t;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    b = (Button) findViewById(R.id.button);
    t = (TextView) findViewById(R.id.textView);
    b.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    Intent intent = new Intent(this, SecondActivity.class);
    startActivityForResult(intent, REQUEST_CODE);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if((requestCode == REQUEST_CODE) && (resultCode == Activity.RESULT_OK)) {
      t.setText(data.getStringExtra("secondactivity"));
    }
  }
}
