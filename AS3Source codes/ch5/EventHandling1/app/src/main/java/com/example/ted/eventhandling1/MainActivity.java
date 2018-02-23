package com.example.ted.eventhandling1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ButtonHandler bh = new ButtonHandler();
    findViewById(R.id.button1).setOnClickListener(bh);
    findViewById(R.id.button2).setOnClickListener(bh);
    findViewById(R.id.button3).setOnClickListener(bh);

  }

  private class ButtonHandler implements View.OnClickListener {

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
          show("Button 3");
          break;
        default:
          show("This should not happen");
      }
    }
  }

  void show(String message) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    Log.i(getClass().getName(), message);
  }
}
