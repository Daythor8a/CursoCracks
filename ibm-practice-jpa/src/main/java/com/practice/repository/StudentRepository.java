package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.entity.Student;

/**
 * 
 * @author edgar.ochoa
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{

  /**
   * Find By Name Constructor
   * @param name
   * @return
   */
  Student findByName(String name);
  
  /**
   * Find By Last Name Constructor
   * @param lastName
   * @return
   */
  Student findByLastName(String lastName);
  
}
