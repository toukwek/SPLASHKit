package com.example.cal_staff.splashkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Data_Collection extends AppCompatActivity {

    public Button next, back1;

    public void init4() {
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Data_Collection.this, Data_Analysis.class);

                startActivity(toy);

            }
        });
    }

    public void init11() {
        back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Data_Collection.this, Main.class);

                startActivity(toy);

            }
        });
    }
    ListView pools;

    String[] strings = {"Outdoor pool","Indoor pool"};

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection);
        init4();
        init11();

        pools = (ListView) findViewById(R.id.ListView);

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, strings);

        pools.setAdapter(adapter);

        pools.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(Data_Collection.this, "" + strings[i], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
