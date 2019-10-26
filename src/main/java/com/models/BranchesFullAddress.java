package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BranchesFullAddress {

    @JsonProperty("Id")
    public Long Id;

    @JsonProperty("branchAddress")
    public String branchAddress;

    @JsonProperty("branchCity")
    public String branchCity;

    @JsonProperty("branchProvince")
    public String branchProvince;

    @JsonProperty("branchZipCode")
    public String branchZipCode;

    @JsonProperty("branchLandLine")
    public Long branchLandLine;

    @JsonProperty("branchMobilePhone")
    public Long branchMobilePhone;

}
