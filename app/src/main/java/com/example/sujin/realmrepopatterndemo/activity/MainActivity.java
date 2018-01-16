package com.example.sujin.realmrepopatterndemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.sujin.realmrepopatterndemo.R;
import com.example.sujin.realmrepopatterndemo.model.Student;
import com.example.sujin.realmrepopatterndemo.model.University;
import com.example.sujin.realmrepopatterndemo.repository.impl.StudentRepository;
import com.example.sujin.realmrepopatterndemo.repository.impl.UniversityRepository;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();

  UniversityRepository universityRepository;
  StudentRepository studentRepository;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    universityRepository = new UniversityRepository();
    studentRepository = new StudentRepository();

    addStudent();
    getAllStudents();

//    addUniversity();
  //  getAllUniversity();
  }

  private void addStudent() {
    ArrayList<Student> studentList = new ArrayList<>();
    studentList.add(new Student("1","Ram","ram@gmail.com"));
    studentList.add(new Student("2","Hari","hari@gmail.com"));
    studentList.add(new Student("3","Sita","sita@gmail.com"));

    for(Student std : studentList) {
      studentRepository.addStudent(std);
    }
  }

  private void getAllStudents() {
    for(Student std : studentRepository.getAllStudent()) {
      Log.e(TAG, std.toString());
    }
  }

  private void getAllUniversity() {
    for(University university : universityRepository.getAllUniversity()) {
      Log.e(TAG, university.toString());
    }
  }

  private void addUniversity() {
    ArrayList<University> universities = new ArrayList<>();
    /*universities.add(new University("1","Abc"));
    universities.add(new University("2","XXzzz"));
    universities.add(new University("3","poqweeer"));
    universities.add(new University("4", "ERER"));
*/
    for(University university : universities) {
      universityRepository.addUniversity(university);
    }

  }
}
