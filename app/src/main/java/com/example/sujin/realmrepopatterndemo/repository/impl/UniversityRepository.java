package com.example.sujin.realmrepopatterndemo.repository.impl;

import com.example.sujin.realmrepopatterndemo.app.MyApplication;
import com.example.sujin.realmrepopatterndemo.model.University;
import com.example.sujin.realmrepopatterndemo.repository.IUniversityRepository;
import io.realm.Realm;
import io.realm.Realm.Transaction;
import io.realm.RealmList;
import io.realm.RealmResults;

/**
 * Created by sujin on 1/13/18.
 */

public class UniversityRepository implements IUniversityRepository {

  @Override
  public void addUniversity(final University university) {
    Realm realm = Realm.getDefaultInstance();
    try {
      realm.executeTransaction(new Transaction() {
        @Override
        public void execute(Realm realm) {
          realm.copyToRealmOrUpdate(university);
        }
      });
    } finally {
      if (realm != null) {
        realm.close();
      }
    }
  }

  @Override
  public void updateUniversity(final University university) {
    Realm realm = Realm.getDefaultInstance();
    try {
      realm.executeTransaction(new Transaction() {
        @Override
        public void execute(Realm realm) {
          realm.copyToRealmOrUpdate(university);
        }
      });
    } finally {
      if (realm != null) {
        realm.close();
      }
    }
  }

  @Override
  public void deleteUniversity(final String id) {
    Realm realm = Realm.getDefaultInstance();
    try {
      realm.executeTransaction(new Transaction() {
        @Override
        public void execute(Realm realm) {
          University university = realm
              .where(University.class)
              .equalTo("id", id)
              .findFirst();
          university.deleteFromRealm();
        }
      });
    } finally {
      if (realm != null) {
        realm.close();
      }
    }
  }

  @Override
  public RealmResults<University> getAllUniversity() {
    Realm realm = Realm.getDefaultInstance();
    RealmResults<University> universityList = realm
        .where(University.class)
        .findAll();

    return universityList;
  }

  @Override
  public University getUniversityById(String id) {
    Realm realm = Realm.getDefaultInstance();
    University university = realm
        .where(University.class)
        .equalTo("id", id)
        .findFirst();
    realm.close();
    return university;
  }
}
