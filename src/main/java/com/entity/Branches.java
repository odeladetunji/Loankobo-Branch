package com.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "branches")
public class Branches {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    public Long Id;

    @Column(name = "branch_name")
    public String branchName;

    @Column(name = "branch_open_day")
    public Date branchOpenedDay;

    @Column(name = "country")
    public String country;

    @Column(name = "currency")
    public String currency;

    @Column(name = "date_format")
    public String dateFormat;

    public Branches(){}
}
