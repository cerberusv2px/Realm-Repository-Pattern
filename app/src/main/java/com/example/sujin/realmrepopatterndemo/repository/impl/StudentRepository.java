package com.example.sujin.realmrepopatterndemo.repository.impl;

import com.example.sujin.realmrepopatterndemo.model.Student;
import com.example.sujin.realmrepopatterndemo.repository.IStudentRepository;
import io.realm.Realm;
import io.realm.Realm.Transaction;
import io.realm.RealmList;
import io.realm.RealmResults;

/**
 * Created by sujin on 1/13/18.
 */

public class StudentRepository implements IStudentRepository{


  @Override
  public void addStudent(final Student student) {
    Realm realm = Realm.getDefaultInstance();
    try {
      realm.executeTransaction(new Transaction() {
        @Override
        public void execute(Realm realm) {
          realm.copyToRealmOrUpdate(student);
        }
      });
    } finally {
      if(realm != null) {
        realm.close();
      }
    }
  }

  @Override
  public void updateStudent(Student student) {

  }

  @Override
  public void deleteStudent(String id) {

  }

  @Override
  public RealmResults<Student> getAllStudent() {
    Realm realm = Realm.getDefaultInstance();
    return realm.where(Student.class).findAll();

  }

  @Override
  public Student getStudentById(String id) {
    Realm realm = Realm.getDefaultInstance();
    return realm.where(Student.class).equalTo("id", id).findFirst();
  }
}
