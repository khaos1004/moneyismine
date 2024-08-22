package com.project.moneyismine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {
    @Column(unique=true)
    @Id
    private int id;
}
