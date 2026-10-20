public class Cita {
    private String cliente;
    private String mascota;
    private String peluquero;
    private String servicio;
    private String fecha; 
    private String hora;  

    // Constructor
    public Cita(String cliente, String mascota, String peluquero, String servicio, String fecha, String hora) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.peluquero = peluquero;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters
    public String getCliente() { return cliente; }
    public String getMascota() { return mascota; }
    public String getPeluquero() { return peluquero; }
    public String getServicio() { return servicio; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}