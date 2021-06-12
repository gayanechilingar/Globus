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

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coord implements Serializable{
    

    private Double lon;
    private Double lat;

    
}