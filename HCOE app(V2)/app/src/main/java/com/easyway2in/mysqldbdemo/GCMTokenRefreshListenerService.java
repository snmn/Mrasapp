package com.easyway2in.mysqldbdemo;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by seaso on 12/07/2016.
 */
public class GCMTokenRefreshListenerService extends InstanceIDListenerService {
    @Override
    public void onTokenRefresh()
    {
        Intent intent = new Intent(this,GCMRegistrationIntentService.class);
        startService(intent);
    }




}
