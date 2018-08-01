package com.easyway2in.mysqldbdemo;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import com.easyway2in.mysqldbdemo.R;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;


/**
 * Created by seaso on 12/07/2016.
 */
public class GCMRegistrationIntentService extends IntentService {
    public static final String REGISTRATION_SUCCESS="Registration success";
    public static final String REGISTRATION_ERROR="Registration error";

    public GCMRegistrationIntentService()
    {
        super("");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
 registerGCM();
    }
    private void registerGCM(){
        Intent registrationComplete=null;
        String token=null;
        try{
            InstanceID instanceID = InstanceID.getInstance(getApplicationContext());
            token= instanceID.getToken(getString(R.string.gcm_defaultSenderId), GoogleCloudMessaging.INSTANCE_ID_SCOPE,null);
           // Log.w("com.easyway2in.mysqldbdemo.GCMRegistrationIntentService","token:"+token );
            registrationComplete =new Intent(REGISTRATION_SUCCESS);
            registrationComplete.putExtra("token",token);

        }catch (Exception e){
            //Log.w("com.easyway2in.mysqldbdemo.GCMRegistrationIntentService","Registration error");
            registrationComplete =new Intent(REGISTRATION_ERROR);

        }
        LocalBroadcastManager.getInstance(this).sendBroadcast(registrationComplete);

    }
}
