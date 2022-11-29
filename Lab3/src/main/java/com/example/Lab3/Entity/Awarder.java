package com.example.Lab3.Entity;


import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "awarder")
public class Awarder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Awarder(){}

    public Awarder(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    @JoinColumn(name = "awarder_id")
    private Collection<listRecipientsAndAwards> awarders;


    private String name;
}
