package ru.arapov.helperproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "course_name")
    private String courseName;

    @ManyToMany(fetch = FetchType.LAZY,
             mappedBy = "courses", cascade = CascadeType.MERGE)
    @JsonIgnore
    private Set<User> users = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course(Integer id) {
        Id = id;
    }

    public Course(String courseName, Set<User> users) {
        this.courseName = courseName;
        this.users = users;
    }

    public Course() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
