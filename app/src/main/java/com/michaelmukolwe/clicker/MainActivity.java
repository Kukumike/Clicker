package com.michaelmukolwe.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    Button btnReset;
    TextView txtCount;
    Button btnSub;
    int intCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.addBtn);
        btnSub = (Button)(findViewById(R.id.subBtn));
        btnReset = (Button)findViewById(R.id.resetBtn);
        txtCount = (TextView)findViewById(R.id.clickTv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intCount++;
                if(intCount <= 50) {
                    txtCount.setText("Customer Count " + String.valueOf(intCount));
                }else{
                    txtCount.setText("Customer Count Full" + String.valueOf(intCount));
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intCount--;
                if(intCount >0) {
                    txtCount.setText("Customer Count " +String.valueOf(intCount));
                }else{
                    txtCount.setText("Customer Count 0");
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String counttxt = "";
                txtCount.setText("0");
            }
        });
    }
}
