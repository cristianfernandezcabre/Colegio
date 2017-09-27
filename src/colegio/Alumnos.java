/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author Cristian
 */
public class Alumnos {
    private String nombre;    //con private solo la misma clase puede acceder a la informacion
    private String apellido;
    private float mates;
    private float edfisica;
    private float catalan;
    private float notaMedia;
    
    //Constructores

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, float mates, float edfisica, float catalan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mates = mates;
        this.edfisica = edfisica;
        this.catalan = catalan;
        //this.notaMedia = notaMedia;
    }
    
    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getMates() {
        return mates;
    }

    public float getEdfisica() {
        return edfisica;
    }

    public float getCatalan() {
        return catalan;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMates(float mates) {
        this.mates = mates;
    }

    public void setEdfisica(float edfisica) {
        this.edfisica = edfisica;
    }

    public void setCatalan(float catalan) {
        this.catalan = catalan;
    }
    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public float notamedia (float nota1, float nota2, float nota3){
        //float resultado;
        //resultado = (nota1+nota2+nota3)/3;
        //return resultado;
        return (nota1+nota2+nota3)/3;
    }
    
}
