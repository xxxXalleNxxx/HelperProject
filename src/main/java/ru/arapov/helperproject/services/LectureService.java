package ru.arapov.helperproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arapov.helperproject.models.Lecture;
import ru.arapov.helperproject.repositories.LectureRepository;

import java.util.List;

@Service
public class LectureService {

    @Autowired
    LectureRepository lectureRepository;

    public Lecture addLecture(Lecture lecture) {
        return lectureRepository.save(lecture);
    }

    public List<Lecture> getLectures() {
        return lectureRepository.findAll();
    }


    public Lecture getLectureById(int id) {
        return lectureRepository.findById(id).orElse(null);
    }

    public String deleteLecture(int id) {
        lectureRepository.deleteById(id);
        return "lecture deleted! \n id: " + id;
    }
}
