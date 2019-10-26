package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BranchesLoanSetting {
    @JsonProperty("Id")
    public Long Id;

    @JsonProperty("minimumLoanAmount")
    public Long minimumLoanAmount;

    @JsonProperty("maximumLoanAmount")
    public Long maximumLoanAmount;

    @JsonProperty("minimumLoanInterestRate")
    public Long minimumLoanInterestRate;

    @JsonProperty("maximumLoanInterestRate")
    public Long maximumLoanInterestRate;
}
