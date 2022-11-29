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

    public Award(Integer id, String awardName) {
        this.id = id;
        this.awardName = awardName;
    }

    public Award() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Set<listRecipientsAndAwards> getAwards() {
        return awards;
    }

    public void setAwards(Set<listRecipientsAndAwards> awards) {
        this.awards = awards;
    }
}
