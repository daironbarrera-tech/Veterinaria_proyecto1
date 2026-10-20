import java.util.ArrayList;
import java.util.List;

public class ControlAgendaService {

    // Lista donde guardaremos todas las citas confirmadas
    private List<Cita> listaDeCitas;

    public ControlAgendaService() {
        this.listaDeCitas = new ArrayList<>();
    }

    /**
     * TAREA 1: Revisar si el peluquero ya tiene una cita a esa misma fecha y hora
     */
    public boolean estaDisponible(String peluquero, String fecha, String hora) {
        for (Cita cita : listaDeCitas) {
            // Si coincide el peluquero, la fecha Y la hora -> Está ocupado
            if (cita.getPeluquero().equalsIgnoreCase(peluquero) &&
                cita.getFecha().equals(fecha) &&
                cita.getHora().equals(hora)) {
                return false; // No está disponible
            }
        }
        return true; // Está libre
    }

    /**
     * TAREA 2: Agendar la cita solo si el peluquero está disponible
     */
    public boolean agendarCita(Cita nuevaCita) {
        // Validamos si el peluquero está ocupado
        if (!estaDisponible(nuevaCita.getPeluquero(), nuevaCita.getFecha(), nuevaCita.getHora())) {
            System.out.println("❌ ERROR: El peluquero " + nuevaCita.getPeluquero() + 
                               " ya tiene una cita agendada el " + nuevaCita.getFecha() + 
                               " a las " + nuevaCita.getHora() + ".");
            return false;
        }

        // Si está libre, la guardamos en la lista
        listaDeCitas.add(nuevaCita);
        System.out.println("✅ Cita agendada con éxito para " + nuevaCita.getMascota() + ".");
        return true;
    }

    // Devuelve la lista completa de citas
    public List<Cita> getListaDeCitas() {
        return listaDeCitas;
    }
}