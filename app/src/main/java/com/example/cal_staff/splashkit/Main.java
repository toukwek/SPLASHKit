package com.example.cal_staff.splashkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    public Button collect, bluetooth, back;

    public void init2() {
        collect = (Button) findViewById(R.id.collect);
        collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Main.this, Data_Collection.class);

                startActivity(toy);

            }
        });
    }

    public void init1() {
        bluetooth = (Button) findViewById(R.id.bluetooth);
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Main.this, Bluetooth.class);

                startActivity(toy);

            }
        });
    }


    public void init12() {
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Main.this, Welcome.class);

                startActivity(toy);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init2();
        init1();
        init12();
    }
}
