package com.example.supawit.moneykeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button Incomebot;
    Button Expensebot;
    TextView IncomeView,ExpenseView;
    private Account account = new Account();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Incomebot = (Button)findViewById(R.id.Incomebot);
        Incomebot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,Incomeactivity.class);
                startActivity(i);
            }
        });


        Expensebot = (Button)findViewById(R.id.Expensebot);
        Expensebot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,Outcomeactivity.class);
                startActivity(i);
            }
        });

        IncomeView = (TextView)findViewById(R.id.IncomeView);
        IncomeView.setText(""+account.getIncome());

        ExpenseView = (TextView)findViewById(R.id.ExpenseView);
        ExpenseView.setText(""+account.getExpense());
    }




}
