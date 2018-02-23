package com.example.ted.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // return super.onCreateOptionsMenu(menu);
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main_menu, menu);
    return true;
  }


  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    //return super.onOptionsItemSelected(item);
    switch(item.getItemId()){
      case R.id.menuFile:
        showMessage("File");
        break;
      case R.id.menuEdit:
        showMessage("Edit");
        break;
      case R.id.menuHelp:
        showMessage("Help");
        break;
      case R.id.menuExit:
        showMessage("Exit");
        break;
      default:
        showMessage("Default");
    }
    return true;
  }

  private void showMessage(String msg) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
  }
}
