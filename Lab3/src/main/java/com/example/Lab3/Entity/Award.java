package com.example.Lab3.Entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "award")
public class Award {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String awardName;
    @OneToMany
    @JoinColumn(name = "award", referencedColumnName = "id")
    private Set<listRecipientsAndAwards> awards;
}
