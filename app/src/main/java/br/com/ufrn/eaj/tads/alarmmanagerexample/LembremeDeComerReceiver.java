package br.com.ufrn.eaj.tads.alarmmanagerexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Date;

/*
@Author Lecheta
 */

public class LembremeDeComerReceiver extends BroadcastReceiver {
    public LembremeDeComerReceiver() {
    }
    private static final String TAG = "livroandroid";
    public static final String ACTION = "LEMBREME_DE_COMER";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG,"Você precisa comer: " + new Date());

        Intent notifIntent = new Intent(context,MainActivity.class);

        NotificationUtil.create(context, 1, notifIntent, R.mipmap.ic_launcher,"Hora de comer algo...","Que tal uma fruta?");
    }
}
