/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weather.globus.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gayanec
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"temp",
"feels_like",
"temp_min",
"temp_max",
"pressure",
"humidity"
})
public class Main implements Serializable{
@JsonProperty("temp")
public Double temp;
@JsonProperty("feels_like")
public Double feelsLike;
@JsonProperty("temp_min")
public Double tempMin;
@JsonProperty("temp_max")
public Double tempMax;
@JsonProperty("pressure")
public Integer pressure;
@JsonProperty("humidity")
public Integer humidity;
}