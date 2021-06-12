/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weather.globus.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gayanec
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "data"
    })

    @JsonProperty("data")
    public List<LocationData> ldata = null;

}