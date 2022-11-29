package com.example.Lab3.Entity;

import jakarta.persistence.*;
import com.example.Lab3.Entity.PK.listRecipientsAndAwardsPK;

@Entity
@Table(name = "listRecipientsAndAwards",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"mask", "group"},
                        name="uk_product_serial_group_mask"
                )
        })
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
