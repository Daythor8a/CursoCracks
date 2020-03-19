package com.practice.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.dao.StudentDao;
import com.practice.entity.Student;
import com.practice.service.StudentService;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Service
public class StudentServiceImpl implements StudentService{

  /**
   * A StudentDao instance
   */
  @Autowired
  private StudentDao dao;
  
  /**
   * Method that implements Find By Name
   */
  @Override
  public Student findByName(String name) {
    
    Student student = dao.findByName(name);
    
    return student;
  }

  /**
   * Method that implements Find All
   */
  @Override
  public List<Student> findAll() {
    // TODO Auto-generated method stub
    return (List<Student>) dao.findAll();
  }
  
}
