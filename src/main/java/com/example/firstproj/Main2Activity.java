package com.example.firstproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button btn10;
    Button btn11, btn12;
    public int ra=1;
    EditText editText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        btn10= (Button)findViewById(R.id.btn10);
        btn11= (Button)findViewById(R.id.btn11);
        btn12= (Button)findViewById(R.id.btn12);
        editText= (EditText) findViewById(R.id.editText);
    }

    public void gofirstpage(View view) {

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(ii);
            }
        });
    }

    public void inc(View view) {
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ra++;
                editText.setText(""+ra);

            }
        });

    }


    public void dec(View view) {
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ra--;
                editText.setText(""+ra);

            }
        });

    }
}
