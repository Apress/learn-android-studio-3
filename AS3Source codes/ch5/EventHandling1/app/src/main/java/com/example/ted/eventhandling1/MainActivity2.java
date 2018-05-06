package com.example.ted.eventhandling1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by ted on 06/10/2017.
 */

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    /*
      The next 3 statements were accidentally removed during
      the time of book writing.
    */

    findViewById(R.id.button1).setOnClickListener(this);
    findViewById(R.id.button2).setOnClickListener(this);
    findViewById(R.id.button3).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()){
      case R.id.button1:
        show("Button One");
        break;
      case R.id.button2:
        show("Button Two");
        break;
      case R.id.button3:
        show("Button Three");
        break;
      default:
        show("This should not happen");
    }
  }
  void show(String message) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    Log.i(getClass().getName(), message);
  }
}

