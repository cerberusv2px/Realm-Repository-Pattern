package com.example.sujin.realmrepopatterndemo.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by sujin on 1/13/18.
 */

public class University extends RealmObject {

  @PrimaryKey
  private String id;

  @Required
  private String name;

  private RealmList<Student> studentList;

  public University() {

  }

  public University(String id, String name,
      RealmList<Student> studentList) {
    this.id = id;
    this.name = name;
    this.studentList = studentList;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public RealmList<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(
      RealmList<Student> studentList) {
    this.studentList = studentList;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "University{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
