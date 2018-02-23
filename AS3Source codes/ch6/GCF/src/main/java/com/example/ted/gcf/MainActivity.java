package com.example.ted.gcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private EditText fno;
  private EditText sno;
  private Button btn;

  private final String TAG = "GCF app ";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fno = (EditText) findViewById(R.id.firstno);
    sno = (EditText) findViewById(R.id.secondno);
    btn = (Button) findViewById(R.id.button);
    btn.setOnClickListener(this);
  }

  @Override
  protected void onStart() {
    super.onStart();
    // Log.i(TAG, "onStart method");
    fno.setText("");
    sno.setText("");
  }

  public void onClick(View v) {
    Log.i(TAG, "onCick of button ");

    boolean a = TextUtils.isEmpty(fno.getText());
    boolean b = TextUtils.isEmpty(sno.getText());

    if (!a & !b) {

      int firstnumber = Integer.parseInt(fno.getText().toString());
      int secondnumber = Integer.parseInt(sno.getText().toString());

      Intent intent = new Intent(this, Calculate.class);
      Bundle bundle = new Bundle();
      bundle.putInt("fno", firstnumber);
      bundle.putInt("sno", secondnumber);
      intent.putExtra("gcfdata", bundle);
      startActivity(intent);

      Log.i(TAG, "" + firstnumber);
      Log.i(TAG, "" + secondnumber);

    }
  }
}
