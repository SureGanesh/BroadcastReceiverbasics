package com.example.ganesh.broadcastreceiverbasics;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button broadcastIntent;


    private BroadcastReceiver broadcastReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcastIntent = (Button) findViewById(R.id.btn_broadcast);
        broadcastReceiver = new MyBroadcastReceiver();
        broadcastIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.android.tag.fordemo");
                sendBroadcast(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
//        IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
//        registerReceiver(broadcastReceiver,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
       // unregisterReceiver(broadcastReceiver);
    }
}
