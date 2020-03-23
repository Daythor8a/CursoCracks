package com.practice.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author edgar.ochoa
 *
 */


@Getter
@Setter
public class City {
  
  /**
   * The Id of the City
   */
//  @Id
//  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
//  public int idCity;
  
  /**
   * The Name of the City
   */
//  @Column(name = "nom_ciu")
  // MappedBy
  @Field(value = "City")
  public String City;

}
