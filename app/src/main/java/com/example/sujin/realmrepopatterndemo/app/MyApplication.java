package com.example.sujin.realmrepopatterndemo.app;

import android.app.Application;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by sujin on 1/13/18.
 */

public class MyApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Realm.init(this);
    RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
        .deleteRealmIfMigrationNeeded()
        .build();
    Realm.setDefaultConfiguration(realmConfiguration);
  }
}
