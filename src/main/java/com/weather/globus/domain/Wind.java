/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weather.globus.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;

/**
 *
 * @author gayanec
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"speed",
"deg"
})
public class Wind implements Serializable{
@JsonProperty("speed")
public Double speed;
@JsonProperty("deg")
public Integer deg;
}
