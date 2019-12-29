/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestion.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author zaroui
 */
@Entity
public class Recomendation {
    @Id
    private Long id;
    @NotNull
    String titre;
    @NotNull
    int text;
    @NotNull
    String date;
    
    
}
