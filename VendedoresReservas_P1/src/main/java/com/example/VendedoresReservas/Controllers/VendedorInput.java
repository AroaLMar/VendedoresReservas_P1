package com.example.VendedoresReservas.Controllers;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class VendedorInput {

    //ATRIBUTOS
    @NotBlank(message = "El codigo de vendedor está vacio.")
    @NotNull(message = "El codigo de vendedor es nulo.")
    private String codcli;
    @NotBlank(message = "El nombre del vendedor está vacio.")
    @NotNull(message = "El nombre del vendedor es nulo.")
    private String nombre;
    @NotNull(message =" El domicilio de vendedor está vacio.")
    @Positive(message = " El domicilio de vendedor es nulo")
    private String domicilio;
    @NotNull(message =" El telefono de vendedor está vacio.")
    @Positive(message = " El telefono de vendedor es nulo")
    private int telefono;


    //CONSTRUCTORES

    public VendedorInput() {
    }

    public VendedorInput(String codcli, String nombre, String domicilio, int telefono) {
        this.codcli = codcli;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    //GETTERS Y SETTERS

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    //MÉTODO TOSTRING
    @Override
    public String toString() {
        return "VendedorInput{" +
                "codcli='" + codcli + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
