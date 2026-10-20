public class PruebaAgenda {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ControlAgendaService agenda = new ControlAgendaService();

        System.out.println("=== PRUEBAS MÓDULO 3: CONTROL DE AGENDA Y NOTIFICACIONES ===\n");

        // Creamos dos citas de prueba
        Cita cita1 = new Cita("Carlos", "Max", "Laura", "Corte de pelo", "2026-10-25", "10:00");
        Cita cita2 = new Cita("Ana", "Luna", "Laura", "Baño completo", "2026-10-25", "10:00"); // Mismo peluquero, fecha y hora
        Cita cita3 = new Cita("Pedro", "Toby", "Andrés", "Limpieza de oídos", "2026-10-25", "10:00"); // Diferente peluquero

        System.out.println("1. Intentando agendar Cita 1 (Laura)...");
        if (agenda.agendarCita(cita1)) {
            // Si se agendó bien, generamos el recordatorio por WhatsApp
            String recordatorio = agenda.generarRecordatorio(cita1, "WhatsApp");
            System.out.println(recordatorio);
        }

        System.out.println("\n2. Intentando agendar Cita 2 (Laura - Traslape de hora)...");
        agenda.agendarCita(cita2); // Debería dar error

        System.out.println("\n3. Intentando agendar Cita 3 (Andrés - Mismo horario, diferente peluquero)...");
        if (agenda.agendarCita(cita3)) {
            String recordatorio = agenda.generarRecordatorio(cita3, "Correo");
            System.out.println(recordatorio);
        }
    }
}