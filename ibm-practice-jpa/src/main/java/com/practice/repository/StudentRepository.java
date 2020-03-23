package com.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.practice.entity.Student;

/**
 * 
 * @author edgar.ochoa
 *
 */
public interface StudentRepository extends MongoRepository<Student, String>{

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
//  Student findByLastName(String lastName);
  
}
