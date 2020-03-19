package com.practice.service;

import java.util.List;
import com.practice.entity.Student;

/**
 * 
 * @author edgar.ochoa
 *
 */
public interface StudentService {
  
  /**
   * Find All Method
   * @return
   */
  List<Student> findAll();
  
  /**
   * Find By Name Method
   * @param name
   * @return
   */
  Student findByName(String name);

}
