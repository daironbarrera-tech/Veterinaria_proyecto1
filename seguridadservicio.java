import java.util.HashMap;
import java.util.Map;

public class seguridadservicio {

    private Map<String, String> BaseDeDatosUsuarios; 
    
    private Map<String, String> BaseDeDatosRoles;
    
    public seguridadservicio() {

        BaseDeDatosUsuarios = new HashMap<>();
        BaseDeDatosRoles = new HashMap<>();

        BaseDeDatosUsuarios.put("administradorPeluqueria.com", "Administrador123");
        BaseDeDatosRoles.put("adminiestaadorPeluqueria.com" ,"ADMINIESTRADOR" );
         
        BaseDeDatosUsuarios.put("peluquero@peluqueria.com", "pelu123");
        BaseDeDatosRoles.put("peluquero@peluqueria.com", "PELUQUERO");

        BaseDeDatosUsuarios.put("cliente@gmail.com", "cliente123");
        BaseDeDatosRoles.put("cliente@gmail.com", "CLIENTE");

    }

        public boolean IniciarSesion (String correoIngresado, String constraseñaIngresada) {

            if (correoIngresado == null|| constraseñaIngresada == null) { 
                System.out.println("Error, los campos no pueden estar vacios.");
                return false;
                }

            if (BaseDeDatosUsuarios.containsKey(correoIngresado)) {
                System.out.println("Error: el Usuario no existe");
                return false;
                }

            String ConstraseñaReal = BaseDeDatosUsuarios.get(correoIngresado);

            if (ConstraseñaReal.equals(correoIngresado)) {
                System.out.println("¡Inicio Sesión Correctamente");
                return true;
            }else {

                System.out.println("Error: La Contraseña Incorrecta");
                return false;
            }

    }



    public boolean VerificarPermiso (String correoIngresado, String AccionSolicitada) {

    String rolUsuario = BaseDeDatosRoles.get(correoIngresado);

    if (rolUsuario == null) {
        System.out.println("Error: El usuario no tiene un rol asisgnado.");
        return false;

        }
        
        switch (AccionSolicitada){
            
            case "AGENDAR_CITA":
            case "ELIMINAR_CITA":

              return rolUsuario.equals("ADMINISTRADOR") || rolUsuario.equals("CLIENTE");

            case "CONSULTAR_DISPONIBILIDAD":

              return rolUsuario.equals("ADMINISTRADOR") || rolUsuario.equals("PELUQUERO");

            case "EDITAR_AGENDA":
            case "GESTINAR_USUARIOS":

             return rolUsuario.equals("ADMINISTRADOR");

            default:
                System.out.println("Error: la accion solicitada no existe en el sistema.");
                return false;

        }

    
    }
}