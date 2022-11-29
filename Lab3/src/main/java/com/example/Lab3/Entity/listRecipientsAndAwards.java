package com.example.Lab3.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "listRecipientsAndAwards",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"awarder_id", "award_id"},
                        name="uk_listRecipientsAndAwards_awarder_award"
                )
        })
public class listRecipientsAndAwards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "award_id")
    private Award award;

    public listRecipientsAndAwards(){

    }

    public listRecipientsAndAwards(Integer id, Award award, Awarder awarder) {
        this.id = id;
        this.award = award;
        this.awarder = awarder;
    }


    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "awarder_id")
    private Awarder awarder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Award getAward() {
        return award;
    }

    public void setAward(Award award) {
        this.award = award;
    }

    public Awarder getAwarder() {
        return awarder;
    }

    public void setAwarder(Awarder awarder) {
        this.awarder = awarder;
    }
}
