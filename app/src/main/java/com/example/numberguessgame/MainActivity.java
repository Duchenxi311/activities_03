package com.example.numberguessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    TextView t1;
    private EditText et_number;
    Button b1;
    private int number;
    int randomnum = (int) (Math.random() * 10000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.txt2);
        et_number = (EditText)findViewById(R.id.et_input);
        b1=(Button)findViewById(R.id.btn1) ;

        et_number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                b1.setVisibility(View.VISIBLE);
            }
        });
    }


    public void check(View view) {
        String numStr = et_number.getText().toString();

        number = Integer.parseInt(numStr);

        if(randomnum<number){
            t1.setText("it is too big!");
        }
        if(randomnum>number){
            t1.setText("it is too small!");
        }
        if(randomnum==number){
            t1.setText("you are right!!!!");
        }
    }
}






