package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.Date;

@Data
public class Branches {
    public Long Id;

    @JsonProperty( "branch_name")
    public String branchName;

    @JsonProperty("branch_open_day")
    public Date branchOpenedDay;

    @JsonProperty("country")
    public String country;

    @JsonProperty("currency")
    public String currency;

    @JsonProperty("date_format")
    public String dateFormat;

}



