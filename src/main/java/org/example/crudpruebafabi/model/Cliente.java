package org.example.crudpruebafabi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Date;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
    @Column(name = "Nombre_cliente")
    private String nombre;

    @Email(message = "El email debe ser válido")
    @Column(name = "Email_cliente")
    private String email;

    @Size(max = 9, message = "El teléfono no puede tener más de 9 caracteres")
    @Column(name = "Telefono_cliente")
    private String telefono;

    @Size(max = 150, message = "La dirección no puede tener más de 150 caracteres")
    @Column(name = "Direccion_cliente")
    private String direccion;

    @NotNull(message = "La fecha de registro no puede estar vacía")
    @PastOrPresent(message = "La fecha de registro debe ser en el pasado o presente")
    @Column(name = "FechaRegistro_cliente")
    private Date fechaRegistro;

    @Column(name = "url")
    private String url;

    /* Agregando la relación que faltaba en el cliente */
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    public Cliente() {
        this.fechaRegistro = new Date();
    }

    public Cliente(Long idCliente, String nombre, String email, String telefono, String direccion, Date fechaRegistro, String url) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
