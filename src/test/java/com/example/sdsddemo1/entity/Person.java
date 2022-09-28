package com.example.sdsddemo1.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    private String name;

    @OneToOne(optional=false, cascade= CascadeType.ALL)
    @JoinColumn(name="passport_id")
    private Passport passport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}