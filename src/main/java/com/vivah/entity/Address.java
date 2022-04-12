package com.vivah.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@Getter
@Setter
@ToString
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "pkAddressId", nullable = false, unique = true)
    public int pkAddressId;

    @Column(name = "address1", nullable = false)
    public String address1;
    @Column(name = "address2", nullable = true)
    public String address2;
    @Column(name = "district", nullable = true)
    public String district;
    @Column(name = "state", nullable = false)
    public String state;
    @Column(name = "pinOrZipCode", nullable = true)
    public String pinOrZipCode;
    @Column(name = "country", nullable = true)
    public String country;
}
