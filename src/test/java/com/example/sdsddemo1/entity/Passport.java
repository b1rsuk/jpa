package com.example.sdsddemo1.entity;

import javax.persistence.*;

@Entity
@Table(name="passports")
public class Passport
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String series;
    private String number;

    @OneToOne(optional=false, mappedBy="passport")
    private Person owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}