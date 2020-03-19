package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table ( name = "CCompany")
public class Company {
  
  /**
   * The Id of the Company
   */
  @Id
  @GeneratedValue
  private int idCompany;
  
  /**
   * The Company Name
   */
  @Column(name = "nom_com")
  private String companyNamy;
  

}
