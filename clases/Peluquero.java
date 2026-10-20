package clases;

public class Peluquero extends Usuario {
    private String especialidad;
    private String turno; 

    public Peluquero(String id, String nombre, String telefono, String correo, String especialidad, String turno) {
        super(id, nombre, telefono, correo);
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}