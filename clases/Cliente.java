package clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private String direccion;
    private List<Mascota> mascotas;

    public Cliente(String id, String nombre, String telefono, String correo, String direccion) {
        super(id, nombre, telefono, correo); 
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public List<Mascota> getMascotas() { return mascotas; }

    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
}