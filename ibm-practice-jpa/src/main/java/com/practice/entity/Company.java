package com.practice.entity;


import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Getter
@Setter
public class Company {
  
  /**
   * The Id of the Company
   */
//  @Id
//  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
//  public int idCompany;
  
  /**
   * The Company Name
   */
//  @Column(name = "nom_com")
//  MappedBy 
  public String companyNamy;
  

}
