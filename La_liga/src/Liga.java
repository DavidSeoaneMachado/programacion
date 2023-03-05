import java.util.ArrayList;

public interface Liga {
    void calcular_jornada(int jornada, Jornada[][] matriz);
    void mostrar_clasificacion();
    ArrayList<Equipo_futbol> crear_liga (String nombre_liga, boolean ligacreada);
    Jornada [][] simular_liga();


}
