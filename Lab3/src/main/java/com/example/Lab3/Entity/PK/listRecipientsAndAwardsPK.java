package com.example.Lab3.Entity.PK;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class listRecipientsAndAwardsPK implements Serializable {

    protected Integer awardId;
    protected Integer awarderId;

    public listRecipientsAndAwardsPK(){

    }

    public listRecipientsAndAwardsPK(Integer awardId, Integer awarderId) {
        this.awardId = awardId;
        this.awarderId = awarderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        listRecipientsAndAwardsPK that = (listRecipientsAndAwardsPK) o;
        return awardId.equals(that.awardId) && awarderId.equals(that.awarderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awardId, awarderId);
    }
}
