package com.practice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Document(collection = "STUDENTS")
@Getter
@Setter
public class Student {
  
  /**
   * The Student Id
   */
  @Id
  private String id;
  
  /**
   * The Student Name
   */
  @Field(value = "nombre")
  private String name;
  
  /**
   * The  Student Surname
   */
  @Field(value = "apellido")
  private String lastName;
  
  /**
   * The Id Of the Company Related
   * to the Student
   */
  //@OneToOne
  //JoinColumn
  
  private Company company;
  
  /**
   * The Id Of the City Related
   * to the Student
   */
  private City city;

}
