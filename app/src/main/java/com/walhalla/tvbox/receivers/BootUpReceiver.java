package com.walhalla.tvbox.receivers;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.walhalla.tvbox.MainActivity;

public class BootUpReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
//        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
//        PendingIntent pi = PendingIntent.getService(context, 0, new Intent(context, MyService.class), PendingIntent.FLAG_UPDATE_CURRENT);
//        if (am != null) {
//            am.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + interval, interval, pi);
//        }
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Intent intent1 = new Intent(context, MainActivity.class);
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
        }
    }
}
