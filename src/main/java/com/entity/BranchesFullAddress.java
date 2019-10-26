package com.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BranchesFullAddress")
public class BranchesFullAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;

    @Column(name = "branch_address")
    public String branchAddress;

    @Column(name = "branch_city")
    public String branchCity;

    @Column(name = "branch_province")
    public String branchProvince;

    @Column(name = "branch_zip_code")
    public String branchZipCode;

    @Column(name = "branch_land_line")
    public Long branchLandLine;

    @Column(name = "branch_mobile_phone")
    public Long branchMobilePhone;

    public BranchesFullAddress(){}
}
