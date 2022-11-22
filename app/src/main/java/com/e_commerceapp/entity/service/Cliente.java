package com.e_commerceapp.entity.service;

public class Cliente {

    private int id;
    private String nombres;
    private String apellido;
    private String tipoDoc;
    private String numDoc;
    private String direccionEnvio;
    private String departamento;
    private String provincia;
    private String telefono;
    private DocumentoAlmacenado foto;

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }



    public DocumentoAlmacenado getFoto() {
        return foto;
    }

    public void setFoto(DocumentoAlmacenado foto) {
        this.foto = foto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellido = apellidoPaterno;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCompleto(){
        return this.nombres != null && this.apellido != null ?
                this.nombres + " " + this.apellido : "------";
    }
}
