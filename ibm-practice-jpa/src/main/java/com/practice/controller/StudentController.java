package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.practice.entity.Student;
import com.practice.model.DataRequestStudent;
import com.practice.model.DataResponseStudent;
import com.practice.service.StudentService;

/**
 * 
 * @author edgar.ochoa
 *
 */
@RestController
@RequestMapping("api/")
public class StudentController {
  
  /**
   * The Student Service Instance
   */
  @Autowired
  private StudentService service;
      
  /**
   * This API is used to obtain the Student Information
   * Searched by Name
   * 
   * @param name as name
   * @return a Student
   */
//  @ResponseBody
//  @GetMapping("/get-by-name")
//  public Student getByName(@RequestParam String name){
//      
//    Student student = service.findByName(name);
//    return student;
//        
//  }
  
  @PostMapping("create-student/")
  public ResponseEntity<DataResponseStudent> createStudent(DataRequestStudent request){
    DataResponseStudent response = service.saveStudent(request);
    
      
      return new ResponseEntity<>(response, HttpStatus.OK);    
  }
}
