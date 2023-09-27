package com.SpringDemoDB.SpringDemoDB.Models;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private long id;

    @Column
    private String name;

    @Column
    private String school;

    @Column
    private String course;

//    @ManyToOne
//    @JoinColumn
//    private Book FK_bookId;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

//    public Book getFK_bookId(){
//        return FK_bookId;
//    }
//
//    public void setFK_bookId (Book FK_bookId){
//        this.FK_bookId = FK_bookId;
//    }

}
