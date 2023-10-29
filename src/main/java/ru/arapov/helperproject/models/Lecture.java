package ru.arapov.helperproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lectures")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String image;

    @ManyToMany(fetch = FetchType.LAZY,
            mappedBy = "lectures", cascade = CascadeType.MERGE)
    @JsonIgnore
    private Set<Course> courses = new HashSet<>();

    public Lecture(String image) {
        this.image = image;
    }

    public Lecture() {

    }

    public Lecture(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
