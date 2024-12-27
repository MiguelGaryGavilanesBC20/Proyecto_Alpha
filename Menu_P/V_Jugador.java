package Menu_P;
/*
Se desea gestionar las actividades de un campeonato de futbol. 
Para ello se necesitan controlar la información de los equipos de futbol, jugadores, dirigentes y partidos.
Se conoce que los equipos de futbol tienen nombre, categoría, presidentes y lista de jugadores. 
Hay 2 categorías de equipos, de primera y de segunda. Los de primera pueden inscribir un máximo de 24 jugadores 
y los de segunda tienen cupo libre, pero ambos como mínimo deben inscribir 11 jugadores.

Los jugadores, árbitros y dirigentes deben tener los datos básicos. Jugadores tienen posición en la que juegan,
cantidad de goles, cantidad de tarjetas amarillas y rojas, minutos jugados, así como la fecha de contrato. 
Los dirigentes tienen fecha de elección, patrimonio en dólares y cargo (presidente, vicepresidente, vocal, etc).
Se debe organizar y gestionar los resultados de los partidos, para lo cual se ingresan los equipos que juegan,
el marcador del partido, las tarjetas por equipo. Esto afecta al registro de cada jugador.
Dentro de las consultas que se puedan realizar están la tabla de posiciones, la lista de jugadores por equipos
y la lista de equipos participantes.

Considere lo siguiente:
- Al crear un equipo este debe tener dirigente.
- Puede crear dirigentes sin equipo.
- Todo jugador debe pertenecer a un equipo.

Desarrolle una aplicación GUI o de consola en java con un diseño CRUD para gestionar los jugadores, equipos, dirigentes, 
árbitros y partidos.

Para el enunciado anterior:
- Realice el modelo UML orientado a objeto.
- Declare las clases.
- Desarrolle una aplicación GUI (calificación máxima 10) o de consola (calificación máxima 8) en java.

Entregables del proyecto:
1. Documento PDF con UML orientado a objeto.
2. Archivos .java con las clases.
*/
import java.util.Date;
//import java.util.List;
//import java.util.ArrayList;

class V_Jugador {
    private String nombre;
    private int edad;
    private int cedula;
    private String posicion;
    private int goles;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int minutosJugados;
    private Date fechaContrato;

    public V_Jugador(String nombre, String posicion, Date fechaContrato, int cedula, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.posicion = posicion;
        this.fechaContrato = fechaContrato;
        this.goles = 0;
        this.tarjetasAmarillas = 0;
        this.tarjetasRojas = 0;
        this.minutosJugados = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
