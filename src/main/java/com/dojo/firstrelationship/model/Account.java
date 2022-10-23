package com.dojo.firstrelationship.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    private String description;
    private String holder;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;

    public Account(String description, String holder, Bank bank, Currency currency) {
        this.description = description;
        this.holder = holder;
        this.bank = bank;
        this.currency = currency;
    }
}
