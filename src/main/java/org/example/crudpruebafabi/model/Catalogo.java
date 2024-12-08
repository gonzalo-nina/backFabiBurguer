package org.example.crudpruebafabi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Catalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo")
    private Long idCatalogo;

    @NotBlank(message = "El nombre del catálogo no puede estar vacío")
    @Size(max = 100, message = "El nombre del catálogo no puede tener más de 100 caracteres")
    @Column(name = "nombre_catalogo")
    private String nombreCatalogo;

    @Size(max = 255, message = "La descripción del catálogo no puede tener más de 255 caracteres")
    @Column(name = "descripcion_catalogo")
    private String descripcionCatalogo;

    @Column(name = "url")
    private String url;

    public Catalogo() {}

    public Catalogo(Long idCatalogo, String nombreCatalogo, String descripcionCatalogo, String url) {
        this.idCatalogo = idCatalogo;
        this.nombreCatalogo = nombreCatalogo;
        this.descripcionCatalogo = descripcionCatalogo;
        this.url = url;
    }

    public Long getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Long idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getNombreCatalogo() {
        return nombreCatalogo;
    }

    public void setNombreCatalogo(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }

    public String getDescripcionCatalogo() {
        return descripcionCatalogo;
    }

    public void setDescripcionCatalogo(String descripcionCatalogo) {
        this.descripcionCatalogo = descripcionCatalogo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
