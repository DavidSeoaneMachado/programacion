import java.io.Serializable;

public class clase_objeto4 implements Serializable {

    private int edad;
    private int dias;
    private String nombre;

    public clase_objeto4(int edad, int dias, String nombre) {
        this.edad = edad;
        this.dias = dias;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "clase_objeto4{" +
                "edad=" + edad +
                ", dias=" + dias +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
