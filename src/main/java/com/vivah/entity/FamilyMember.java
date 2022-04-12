package com.vivah.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "FamilyMember")
public class FamilyMember {

    @Id
    @GeneratedValue
    @Column(name = "pkFamilyMemberId", nullable = false, unique = true)
    private Long pkFamilyMemberId;

    @Column(name = "type", nullable = false)
    public String type; //Father, mother, sister, brother.

    @Column(name="fullName", nullable = false)
    public String fullName;

    @Column(name="gotra", nullable = false)
    public String gotra;

    @Column(name="village", nullable = false)
    public String village;

    @Column(name="isMarried", nullable = true)
    public boolean isMarried;

    //we will below fields nullable even though they are coming from dropdown.

//    @Column(name="marriageDate", nullable = true)
//    public Calendar marriageDate;
//
//    @Column(name="isDivorced", nullable = true)
//    public boolean isDivorce;
//
//    @Column(name="divorcedDate", nullable = true)
//    public Calendar divorcedDate;

}
