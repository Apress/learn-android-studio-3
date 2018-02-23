package com.example.ted.getresultssubactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    Button b = (Button) findViewById(R.id.button2);
    b.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent();
        EditText e = (EditText) findViewById(R.id.editText);
        String data = e.getText().toString();
        intent.putExtra("secondactivity", data);
        setResult(Activity.RESULT_OK, intent);
        finish();
      }
    });
  }
}
