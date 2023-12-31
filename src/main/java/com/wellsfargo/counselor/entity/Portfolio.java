package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    public Portfolio(String creationDate) {
        this.creationDate = creationDate;
    }

    @OneToOne
    private long clientId;


    @Column(nullable = false)
    private String creationDate;

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }



}
