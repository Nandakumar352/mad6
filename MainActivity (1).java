package com.example.smsprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.et1);
        ed2=findViewById(R.id.et2);

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    SmsManager smugger = SmsManager.getDefault();
                    smugger.sendTextMessage(ed1.getText().toString(),null,ed2.getText().toString(),null,null);
                    Toast.makeText(MainActivity.this, "SMS sent Successfully", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "SMS sending failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}