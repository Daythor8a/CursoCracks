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
@Table ( name = "CCiudad")
public class City {
  
  /**
   * The Id of the City
   */
  @Id
  @GeneratedValue
  private int idCity;
  
  /**
   * The Name of the City
   */
  @Column(name = "nom_ciu")
  private String cityName;

}
