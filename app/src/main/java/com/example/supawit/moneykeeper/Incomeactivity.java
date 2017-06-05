package com.example.supawit.moneykeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Supawit on 6/5/2017.
 */

public class Incomeactivity extends AppCompatActivity {
    private Account account = new Account();
    Button done,back,add;
    EditText income;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        done = (Button)findViewById(R.id.Done);
        done.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Incomeactivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        back = (Button)findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Incomeactivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        add = (Button)findViewById(R.id.Add);
        income = (EditText)findViewById(R.id.AddText);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
               account.setIncome(Integer.parseInt(income.getText().toString()));
                income.setText("");
            }
        });
    }











}
