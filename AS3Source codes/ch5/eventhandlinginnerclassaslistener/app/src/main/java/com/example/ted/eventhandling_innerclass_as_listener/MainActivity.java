package com.example.ted.eventhandling_innerclass_as_listener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        
        ButtonHandler blistener = new ButtonHandler();
        b1.setOnClickListener(blistener);
        b2.setOnClickListener(blistener);
        b3.setOnClickListener(blistener);
        
    }
    
    void show(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.i(getClass().getName(), message);
    }
    
    private class ButtonHandler implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.button1:
                    show("Button 1");
                    break;
                case R.id.button2:
                    show("Button 2");
                    break;
                case R.id.button3:
                    show("Button 3");
                    break;
                default:
                    show("This should not happen");
                
            }
        }
    }
}


