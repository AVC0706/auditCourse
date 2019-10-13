package com.example.yashj.helllo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                   btn = (Button) findViewById(R.id.btn_yash);
                   btn2 = (Button) findViewById(R.id.btn_press);
                   btn.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent toy = new Intent(MainActivity.this, MapsActivity.class);
                           startActivity(toy);
                       }
                   });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(toy1);
            }
        });
    }
}
