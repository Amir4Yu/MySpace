package com.vtxlab.demo.student.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vtxlab.demo.student.entity.Student;

public interface StudentOperation {

  @GetMapping(value = "/students")
  ResponseEntity<List<Student>> findStudents();

  @GetMapping(value = "/student/name/{name}/height/{height}")
  ResponseEntity<Void> createStudent(@PathVariable String name, @PathVariable Double height);

}
