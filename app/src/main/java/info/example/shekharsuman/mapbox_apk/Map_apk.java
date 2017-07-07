package info.example.shekharsuman.mapbox_apk;

import android.app.Application;

import com.mapbox.mapboxsdk.Mapbox;

/**
 * Created by shekharsuman on 7/7/2017.
 */

public class Map_apk extends Application {
    @Override
    public void onCreate() {
        super.onCreate();// Mapbox Access token
        Mapbox.getInstance(getApplicationContext(), "pk.eyJ1Ijoic2hla2hhcnN1bWFuIiwiYSI6ImNqNG9idW5pazF2N3AzM3BkNmJucTVidGYifQ.MYMvp5rNP-0z_PoQhvPVAQ");
    }

}
