package com.vivah.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Male {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    public String firstName;
}
