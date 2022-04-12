package com.vivah.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.id.IdentityGenerator;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Profile")
@Getter
@Setter
@ToString
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pkProfileId", nullable = false)
    public int pkProfileId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fkPersonId")
    private Person person; // 1 person to 1 Profile.

    @Column(name = "isBride", nullable = false)
    public boolean isBride;

    @Column(name = "preference", nullable = true)
    public String preference;

    @Column(name = "mobileNumber", nullable = false)
    public String mobileNumber;

    @Column(name = "bloodGroup", nullable = true)
    public String bloodGroup;

    @Column(name = "historyOfDisease", nullable = true)
    public String historyOfDisease;

    /*  if Divorced - start  */
    @Column(name="isDivorcee", nullable = true)
    public boolean isDivorcee;

    @Column(name="divorcedDate", nullable = true)
    public Calendar divorcedDate;

    @Column(name="marriageDate", nullable = true)
    public Calendar marriageDate;
    /*  if Divorced - end  */




}
