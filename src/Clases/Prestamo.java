/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    private String codigoLibro, numeroUser;
    private LocalDateTime fecha;

    public Prestamo(String codigoLibro, String numeroUser, LocalDateTime fecha) {
        this.codigoLibro = codigoLibro;
        this.numeroUser = numeroUser;
        this.fecha = fecha;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getNumeroUser() {
        return numeroUser;
    }

    public void setNumeroUser(String numeroUser) {
        this.numeroUser = numeroUser;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getFechaFormateada() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        return formateador.format(this.fecha);
    }

    @Override
    public String toString() {
        return "codigo Libro: " + codigoLibro +
                "numero Usuario: " + numeroUser + 
                "fecha: " + this.getFechaFormateada();
    }

}
