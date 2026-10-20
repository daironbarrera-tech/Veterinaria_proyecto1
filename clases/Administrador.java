package clases;
public class Administrador extends Usuario {
    private String nivelAcceso;

    public Administrador(String id, String nombre, String telefono, String correo, String nivelAcceso) {
        super(id, nombre, telefono, correo);
        this.nivelAcceso = nivelAcceso;
    }

    public String getNivelAcceso() { return nivelAcceso; }
    public void setNivelAcceso(String nivelAcceso) { this.nivelAcceso = nivelAcceso; }
}