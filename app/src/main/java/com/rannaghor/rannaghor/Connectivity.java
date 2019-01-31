package com.rannaghor.rannaghor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Connectivity {
    private ConnectivityManager cm;
    private NetworkInfo activeNetwork;

    public Connectivity(Context context)
    {
        cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        activeNetwork = cm.getActiveNetworkInfo();
    }

    public boolean getConnectionStatus()
    {
        boolean status = false;
        if (activeNetwork != null && activeNetwork.isConnectedOrConnecting())
        {
            status = true;
        }
        return status;
    }

    public boolean getWifiConnectionStatus()
    {
        boolean status = false;
        if(getConnectionStatus())
        {
            if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
            {
                status = true;
            }
        }
        return status;
    }
}
