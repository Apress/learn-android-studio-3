package com.example.ted.async;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ted.async.Worker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  private String TAG;
  TextView tv;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button b = (Button) findViewById(R.id.button);
    Button b2 = (Button) findViewById(R.id.button2);
    tv = (TextView) findViewById(R.id.textView);
    TAG = getClass().getSimpleName();

    b.setOnClickListener(this);
    b2.setOnClickListener(new View.OnClickListener(){
      public void onClick(View v) {
        Log.i(TAG, "Clicked");
      }
    });

    StrictMode.enableDefaults();
  }

  public void onClick(View v) {
    Worker worker = new Worker();
    worker.execute(tv);
  }
}
