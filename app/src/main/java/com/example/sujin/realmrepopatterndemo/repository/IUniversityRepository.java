package com.example.sujin.realmrepopatterndemo.repository;

import com.example.sujin.realmrepopatterndemo.model.University;
import io.realm.RealmList;
import io.realm.RealmResults;

/**
 * Created by sujin on 1/13/18.
 */

public interface IUniversityRepository {

  public void addUniversity(University university);

  public void updateUniversity(University university);

  public void deleteUniversity(String id);

  public RealmResults<University> getAllUniversity();

  public University getUniversityById(String id);
}
