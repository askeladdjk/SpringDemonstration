package com.SpringDemoDB.SpringDemoDB.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String school;

    @Column
    private String course;

    @Column
    private int FK_bookId;

    @ManyToOne
            //(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_bookId", insertable = false, updatable = false)
    private Book book;

    public  Book book() {
        return book;
    }

    public void setBook (Book book){
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Book getBook() {
        return book;
    }

    public int getFK_bookId() {
        return FK_bookId;
    }

    public void setFK_bookId(int FK_bookId) {
        this.FK_bookId = FK_bookId;
    }
}
