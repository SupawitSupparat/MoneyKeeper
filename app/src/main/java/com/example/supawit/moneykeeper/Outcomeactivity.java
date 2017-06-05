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

public class Outcomeactivity extends AppCompatActivity {

    Button done,back,add;
    EditText outcome;
    private Account account = new Account();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);

        done = (Button)findViewById(R.id.Done);
        done.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Outcomeactivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        back = (Button)findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Outcomeactivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        add = (Button)findViewById(R.id.Back);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Outcomeactivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        add = (Button)findViewById(R.id.Add);
        outcome = (EditText)findViewById(R.id.AddText);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                account.setIncome(Integer.parseInt(outcome.getText().toString()));
                outcome.setText("");
            }
        });
    }
}
