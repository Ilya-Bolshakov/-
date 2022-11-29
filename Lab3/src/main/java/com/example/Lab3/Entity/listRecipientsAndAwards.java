package com.example.Lab3.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "listRecipientsAndAwards",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"awarder", "award"},
                        name="uk_listRecipientsAndAwards_awarder_award"
                )
        })
public class listRecipientsAndAwards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @MapsId("awardId")
    @ManyToOne
    @JoinColumn(name = "award", referencedColumnName = "id")
    private Award award;

    @MapsId("awarderId")
    @ManyToOne
    @JoinColumn(name = "awarder", referencedColumnName = "id")
    private Awarder awarder;
}
