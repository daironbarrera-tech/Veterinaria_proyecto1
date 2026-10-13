import java.util.HashMap;
import java.util.Map;

public class seguridadservicio {

    private Map<String, String> BaseDeDatosUsuarios; 
    
    private Map<String, String> BaseDeDatosRoles;
    
    public seguridadservicio() {

        BaseDeDatosUsuarios = new HashMap<>();
        BaseDeDatosRoles = new HashMap<>();

        BaseDeDatosUsuarios.put("administradorPeluqueria.com", "Administrador123");
        BaseDeDatosRoles.put("adminiestaadorPeliqueria.com" ,"ADMINIESTRADOR" );
         
        BaseDeDatosUsuarios.put("peluquero@peluqueria.com", "pelu123");
        BaseDeDatosRoles.put("peluquero@peluqueria.com", "PELUQUERO");

        BaseDeDatosUsuarios.put("cliente@gmail.com", "cliente123");
        BaseDeDatosRoles.put("cliente@gmail.com", "CLIENTE");


    }

    
}