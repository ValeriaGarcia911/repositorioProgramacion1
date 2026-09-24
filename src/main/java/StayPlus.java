import java.util.ArrayList;

public class StayPlus {
    private String nombre;
    private int nit;
    private String direccion;
    private int telefono;

    private String paginaWeb;
    private ArrayList<Huesped> listHuespedes;
    private ArrayList<Reserva> listReservas;
    private ArrayList<Habitacion> listHabitaciones;
    private ArrayList<Servicio> listServicios;

    public StayPlus(String nombre, int nit, String direccion, int telefono, String paginaWeb) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;

        listHuespedes = new ArrayList<>();
        listReservas = new ArrayList<>();
        listHabitaciones = new ArrayList<>();
        listServicios = new ArrayList<>();

        public void registrarHuesped(String nombre, int documento, int telefono,
        String correoElectronico, String paisProcedencia) {
            Huesped huesped = new Huesped(
                    nombre,
                    documento,
                    telefono,
                    correoElectronico,
                    paisProcedencia

            );
            listHuespedes.add(huesped);
        }
        public void crearReserva(int codigo, String fechaRealizacion,
                String fechaEntrada, String fechaSalida,
                String estado, String metodoPago, double valorTotal) {
            Reserva reserva = new Reserva(
                    codigo,
                    fechaRealizacion,
                    fechaEntrada,
                    fechaSalida,
                    estado,
                    metodoPago,
                    valorTotal
            );
            listReservas.add(reserva);
        }
        public void registrarHabitacion(int numero, int piso, String tipoHabitacion,
        int capacidadMaxima, double precioNoche,
        String disponibilidad, String estado) {
            Habitacion habitacion = new Habitacion(
                    numero,
                    piso,
                    tipoHabitacion,
                    capacidadMaxima,
                    precioNoche,
                    disponibilidad,
                    estado
            );
            listHabitaciones.add(habitacion);
        }
        public void registrarServicio(int codigo, String nombre, String descripcion,
        double precio, String disponibilidad) {
            Servicio servicio = new Servicio(
                    codigo,
                    nombre,
                    descripcion,
                    precio,
                    disponibilidad
            );
            listServicios.add(servicio);
        }
        public Reserva buscarReserva(int codigo) {

            for (Reserva reserva : listReservas) {
                if (reserva.getCodigo() == codigo) {
                    return reserva;
                }
            }

            return null; .
    }
}
