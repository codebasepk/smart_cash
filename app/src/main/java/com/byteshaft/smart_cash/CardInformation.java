package com.byteshaft.smart_cash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardInformation extends AppCompatActivity {

    private Button mPayNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_information);
        mPayNow = findViewById(R.id.button_pay_now);
        setTitle("Card information");
        mPayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardInformation.this, PinActivity.class));
            }
        });
    }
}
