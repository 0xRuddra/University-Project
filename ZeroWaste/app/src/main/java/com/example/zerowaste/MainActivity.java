package com.example.zerowaste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView NGOListButton;
    public CardView DonateFoodButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NGOListButton = (CardView) findViewById(R.id.NGOListButton);
        DonateFoodButton =(CardView) findViewById(R.id.DonateFoodButton);

        NGOListButton.setOnClickListener(this);
        DonateFoodButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId())
        {
            case R.id.NGOListButton :

                i = new Intent(this,NGO_List.class);
                startActivity(i);
                break;

            case R.id.DonateFoodButton:

                i = new Intent(this,Donate_Food.class);
                startActivity(i);
                break;
        }

    }
}