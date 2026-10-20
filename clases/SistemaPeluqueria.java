package clases;

import java.util.ArrayList;
import java.util.List;

public class SistemaPeluqueria {
    
    private List<Cliente> listaClientes;
    private List<Peluquero> listaPeluqueros;
    private List<Administrador> listaAdministradores;
    private List<Servicio> listaServicios;
    private List<Cita> listaCitas;

    public SistemaPeluqueria() {
        this.listaClientes = new ArrayList<>();
        this.listaPeluqueros = new ArrayList<>();
        this.listaAdministradores = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
        this.listaCitas = new ArrayList<>();
    }

   
    public List<Cliente> getListaClientes() { return listaClientes; }
    public List<Peluquero> getListaPeluqueros() { return listaPeluqueros; }
    public List<Administrador> getListaAdministradores() { return listaAdministradores; }
    public List<Servicio> getListaServicios() { return listaServicios; }
    public List<Cita> getListaCitas() { return listaCitas; }

    // Métodos directos para registrar datos
    public void registrarCliente(Cliente cliente) { listaClientes.add(cliente); }
    public void registrarPeluquero(Peluquero peluquero) { listaPeluqueros.add(peluquero); }
    public void registrarServicio(Servicio servicio) { listaServicios.add(servicio); }
    public void agendarCita(Cita cita) { listaCitas.add(cita); }
}