package com.okul.okul.controller;

import com.okul.okul.model.Course;
import com.okul.okul.model.Student;
import com.okul.okul.repository.CourseRepository;
import com.okul.okul.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseRepository courseRepo;
    private final StudentRepository studentRepo;

    public CourseController(CourseRepository c, StudentRepository s) {
        this.courseRepo = c;
        this.studentRepo = s;
    }

    @GetMapping
    public List<Course> getAll() {
        return courseRepo.findAll();
    }

    @PostMapping
    public Course create(@RequestBody Course c) {
        return courseRepo.save(c);
    }

    @PostMapping("/{courseId}/assign/{studentId}")
    public String assignStudent(@PathVariable Long courseId, @PathVariable Long studentId) {
        Course course = courseRepo.findById(courseId).orElseThrow();
        Student student = studentRepo.findById(studentId).orElseThrow();

        course.getStudents().add(student);
        courseRepo.save(course);
        return "Öğrenci kursa eklendi.";
    }
}
