package com.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BranchesLoanSettingRepository")
public class BranchesLoanSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    public Long Id;

    @Column(name = "minimum_loan_amount")
    public Long minimumLoanAmount;

    @Column(name = "maximum_loan_amount")
    public Long maximumLoanAmount;

    @Column(name = "minimum_loan_interest_rate")
    public Long minimumLoanInterestRate;

    @Column(name = "maximum_loan_interest_rate")
    public Long maximumLoanInterestRate;

    public BranchesLoanSetting(){}

}
