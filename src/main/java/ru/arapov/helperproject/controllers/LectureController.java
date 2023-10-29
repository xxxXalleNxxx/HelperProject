package ru.arapov.helperproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.arapov.helperproject.models.Lecture;
import ru.arapov.helperproject.services.LectureService;

import java.util.List;

@RestController
public class LectureController {

    @Autowired
    LectureService service;

    @PostMapping("/addLecture")
    public Lecture addLecture(@RequestBody Lecture lecture) {
        return service.addLecture(lecture);
    }

    @GetMapping("/lectures")
    public List<Lecture> findAllLectures() {
        return service.getLectures();
    }

    @GetMapping("/lecture/{id}")
    public Lecture findLectureById(@PathVariable int id) {
        return service.getLectureById(id);
    }

    @GetMapping("/deleteLecture/{id}")
    public String deleteLecture(@PathVariable int id) {
        return service.deleteLecture(id);
    }
}
