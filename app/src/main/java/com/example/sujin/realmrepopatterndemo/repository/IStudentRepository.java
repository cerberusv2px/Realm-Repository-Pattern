package com.example.sujin.realmrepopatterndemo.repository;

import com.example.sujin.realmrepopatterndemo.model.Student;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;

/**
 * Created by sujin on 1/13/18.
 */

public interface IStudentRepository {

  public void addStudent(Student student);

  public void updateStudent(Student student);

  public void deleteStudent(String id);

  public RealmResults<Student> getAllStudent();

  public Student getStudentById(String id);
}
