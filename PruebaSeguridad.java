
public class PruebaSeguridad {

    public static void main(String[] args) {
        
        seguridadservicio seguridad = new seguridadservicio();

        System.out.println("=======================================");
        System.out.println("     PRUEBA DE SEGURIDAD Y PERMISOS    ");
        System.out.println("=======================================\\n");

        System.out.println("1° DE INICIO DE SESION");

        System.out.println("primer intento (calve incorrecta)");
        seguridad.IniciarSesion("cliente@gmail.com","123456");

        System.out.println("segundo intento (cliente admitido)");
        boolean loginCliente = seguridad.IniciarSesion("administrador@peluqueria.com", "Administrador123");

        System.out.println();

        System.out.println("2° PROBANDO PERMISOS Y ROLES");

        if (loginCliente) {

            boolean ClienteAgenda = seguridad.VerificarPermiso("cliente@gmail.com" , "AGENDAR_CITA");
            System.out.println("¿Cliente puede agendar Cita?: " + ClienteAgenda);

            boolean ClienteEditar = seguridad.VerificarPermiso("cliente@gmail.com" , "EDITAR_AGENDA");
            System.out.println("¿CLiente puede editar la agenda?: "+ ClienteEditar);

            boolean loginAdmin = seguridad.IniciarSesion("administrador@peluqueria.com", "Administrador123");
            System.out.println("¿El admin puede editar la agenda?" + loginAdmin);
    

        if (loginAdmin) {
            boolean adminEdita = seguridad.VerificarPermiso("administrador@peluqueria.com" , "EDITAR_AGENDA" );
            System.out.println("¿Admin puede editar agenda" + adminEdita);
        }

        System.out.println();


        System.out.println("3° prueba de intruduccion de texto");
        boolean textoOK = seguridad.ValidarTexto("<script>alert('hack')</script>");
        System.out.println("Texto con script bloqueado" + textoOK);


            
        }
    }

}
