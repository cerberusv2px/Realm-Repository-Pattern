package com.example.sujin.realmrepopatterndemo.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by sujin on 1/13/18.
 */

public class RealmModelAdapter<T extends RealmObject> extends RealmBaseAdapter<T> {

  public RealmModelAdapter(@Nullable OrderedRealmCollection<T> data) {
    super(data);
  }

  /*public RealmModelAdapter(Context context, RealmResults<T> realmResults, boolean automaticUpdate) {
    //super(context, realmResults, automaticUpdate);
  }*/

  @Override
  public View getView(int i, View view, ViewGroup viewGroup) {
    return null;
  }
}
