package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Entity
@Getter
@Setter
@Table ( name = "MStudent")
public class Student {
  
  /**
   * The Student Id
   */
  @Id
  @GeneratedValue
  private int id;
  
  /**
   * The Student Name
   */
  @Column(name = "nom_stu")
  private String name;
  
  /**
   * The  Student Surname
   */
  @Column(name = "ape_stu")
  private String lastName;
  
  /**
   * The Id Of the Company Related
   * to the Student
   */
  @OneToOne
  private int idCompany;
  
  /**
   * The Id Of the City Related
   * to the Student
   */
  @OneToOne
  private int idCity;

}
