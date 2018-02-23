package com.example.ted.async;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

public class Worker extends AsyncTask<TextView, String, Boolean> {

  private String TAG;
  private TextView tv;

  @Override
  protected Boolean doInBackground(TextView... textViews) {
    tv = textViews[0];
    TAG = getClass().getSimpleName();
    int i = 0;
    while (i++ < 15) {
      try {
        Thread.sleep(2000);
        publishProgress(String.format("Value of i = %d", i));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return true;
  }

  @Override
  protected void onProgressUpdate(String... values) {
    tv.setText(values[0]);
    Log.i(TAG, String.format(values[0]));

  }
}
