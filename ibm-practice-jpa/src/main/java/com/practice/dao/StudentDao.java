package com.practice.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.practice.entity.Student;
import com.practice.repository.StudentRepository;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Component
public class StudentDao {

  @Autowired
  private StudentRepository repository;
  
  /**
   * Method to find by name
   * @param name as name
   * @return Student
   */
  public Student findByName(String name) {
      return repository.findByName(name);
  }
  
  /**
   * Method to find by Last Name
   * @param Last Name as lastName
   * @return Student
   */
//  public Student findByLastName(String lastName) {
//      return repository.findByLastName(lastName);
//  }
  
  /**
   * Method to find by All parameters
   * @return Student
   */
  public List<Student> findAll(){
      return repository.findAll();
  }
  
  public Student saveStudent(Student student) {
      return repository.save(student);
  }
  
}
