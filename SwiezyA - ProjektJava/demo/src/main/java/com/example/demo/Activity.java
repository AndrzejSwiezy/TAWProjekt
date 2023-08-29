package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.Value;

@JsonSerialize
@Data
public class Activity {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nazwa")
    private String name;

    @JsonProperty("punkty")
    private Integer point;

    @JsonProperty("sala")
    private Integer number;

    @JsonProperty("egzamin")
    private String exam;
}
