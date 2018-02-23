package com.example.ted.firstintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second); // <1>

    Button secondButton = (Button) findViewById(R.id.button2); // <2>
    assert secondButton != null; // <3>
    secondButton.setOnClickListener(new View.OnClickListener() { // <4>
      @Override
      public void onClick(View view) {
        finish(); // <5>
      }
    });
  }
}
