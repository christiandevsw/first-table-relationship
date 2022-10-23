package com.dojo.firstrelationship.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "currencies")
@NoArgsConstructor
@Data
//where
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    private String name;
    @OneToMany(mappedBy = "currency")
    private Set<Account> accounts;

}
