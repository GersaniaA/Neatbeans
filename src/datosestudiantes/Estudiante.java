/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosestudiantes;

/**
 *
 * @author Anleska obando
 */
public class Estudiante {
    double carnet;
        String nombres;
        String apellidos;
        String carrera;
        String nivel;

    Estudiante(double car, String nombreS, String apellidoS, String carrerA, String niveL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCarnet() {
        return carnet;
    }

    public void setCarnet(double carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Estudiante(double carnet, String apellidos, String carrera, String nivel) {
        this.carnet = carnet;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.nivel = nivel;
    }
}
