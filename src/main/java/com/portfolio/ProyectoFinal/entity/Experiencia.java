package com.portfolio.ProyectoFinal.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreE;
    private String descripcionE;
     private String imgE;
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
         this.imgE = imgE;
    }

    //Getters and setters

    public int getId() {
        return id;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImg(String img) {
        this.imgE = imgE;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
}