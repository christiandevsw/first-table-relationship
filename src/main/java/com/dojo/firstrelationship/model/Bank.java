package com.dojo.firstrelationship.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "banks")
@NoArgsConstructor
@Data
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    private String name;

    public Bank(String name) {
        this.name = name;
    }
}







