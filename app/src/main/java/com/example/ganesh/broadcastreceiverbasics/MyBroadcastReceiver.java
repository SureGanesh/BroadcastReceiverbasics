package com.example.ganesh.broadcastreceiverbasics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kvana on 5/22/17.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Broadcast Receiver Triggered ", Toast.LENGTH_SHORT).show();
    }
}
