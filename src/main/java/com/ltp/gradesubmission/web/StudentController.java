package com.ltp.gradesubmission.web;

import com.ltp.gradesubmission.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping(path = "/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(path = "/")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Student>> getStudent() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
