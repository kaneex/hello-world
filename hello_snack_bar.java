package com.kaneex.hellosnack_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hello_snack_bar extends AppCompatActivity {
    Button count;
    int value=0;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_snack_bar);
        count = (Button)findViewById(R.id. count);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value++;
                text.setText(String.valueOf(value));
            }
        });
    }
}
