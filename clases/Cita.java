package clases;

public class Cita {
    private String idCita;
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mascota mascota;
    private Peluquero peluquero;
    private Servicio servicio;
    private String estado; 

    public Cita(String idCita, String fecha, String hora, Cliente cliente, Mascota mascota, Peluquero peluquero, Servicio servicio) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mascota = mascota;
        this.peluquero = peluquero;
        this.servicio = servicio;
        this.estado = "Pendiente";
    }

    public String getIdCita() { return idCita; }
    public void setIdCita(String idCita) { this.idCita = idCita; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }

    public Peluquero getPeluquero() { return peluquero; }
    public void setPeluquero(Peluquero peluquero) { this.peluquero = peluquero; }

    public Servicio getServicio() { return servicio; }
    public void setServicio(Servicio servicio) { this.servicio = servicio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}