package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BranchID {

    @JsonProperty("id")
    public Long Id;

}
