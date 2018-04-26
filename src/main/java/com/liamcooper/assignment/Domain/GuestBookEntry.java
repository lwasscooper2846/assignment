package com.liamcooper.assignment.Domain;

import javax.validation.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

@Entity
public class GuestBookEntry {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "entry_id")
    private Integer id;

    @NotEmpty
    private String user;

    @NotEmpty
    private String comment;
}
