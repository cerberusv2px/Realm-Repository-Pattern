package com.example.sujin.realmrepopatterndemo.adapter;

import android.support.v7.widget.RecyclerView;
import io.realm.Realm;
import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;

/**
 * Created by sujin on 1/13/18.
 */

public abstract class RealmRecyclerViewAdapter<T extends RealmObject> extends RecyclerView.Adapter {

  private RealmBaseAdapter<T> realmBaseAdapter;

  public T getItem(int position) {
    return realmBaseAdapter.getItem(position);
  }

  public RealmBaseAdapter<T> getRealmBaseAdapter() {
    return realmBaseAdapter;
  }

  public void setRealmBaseAdapter(RealmBaseAdapter<T> realmBaseAdapter) {
    this.realmBaseAdapter = realmBaseAdapter;
  }

}
