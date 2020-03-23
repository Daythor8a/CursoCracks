package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.dao.StudentDao;
import com.practice.entity.City;
import com.practice.entity.Company;
import com.practice.entity.Student;
import com.practice.model.DataRequestStudent;
import com.practice.model.DataResponseStudent;
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
//  @Override
//  public Student findByName(String name) {
//    
//    Student student = dao.findByName(name);
//    
//    return student;
//  }
//
//  /**
//   * Method that implements Find All
//   */
//  @Override
//  public List<Student> findAll() {
//    // TODO Auto-generated method stub
//    return (List<Student>) dao.findAll();
//  }
  
  @Override
  public DataResponseStudent saveStudent(DataRequestStudent request) {
    Student student = buildStudent(request);
    Student responseStudent = dao.saveStudent(student);
    DataResponseStudent response = new DataResponseStudent();
    response.setId(String.valueOf(responseStudent.getId()));
    
    return response;
  }
  
  private Student buildStudent ( DataRequestStudent request) {
    Student student = new Student();
    student.setLastName(request.getLastName());
    City city = new City();
    city.setCity(request.getCity());
    student.setCity(city);
    Company company = new Company();
    company.setCompanyNamy(request.getCompany());
    student.setCompany(company);
    return student;     
  }
  
}
