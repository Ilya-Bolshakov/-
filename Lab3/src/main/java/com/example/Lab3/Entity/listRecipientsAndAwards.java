package com.example.Lab3.Entity;

import jakarta.persistence.*;
import com.example.Lab3.Entity.PK.listRecipientsAndAwardsPK;

@Entity
@Table(name = "listRecipientsAndAwards")
public class listRecipientsAndAwards {
    @EmbeddedId
    private listRecipientsAndAwardsPK pk;

    @MapsId("awardId")
    @ManyToOne
    @JoinColumn(name = "award", referencedColumnName = "id")
    private Award award;

    @MapsId("awarderId")
    @ManyToOne
    @JoinColumn(name = "awarder", referencedColumnName = "id")
    private Awarder awarder;
}
