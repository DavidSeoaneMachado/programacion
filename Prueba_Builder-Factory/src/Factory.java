public class Factory {

    public static final int BICICLETA = 1;
    public static final int  MOTO= 2;
    public static final int COCHE = 3;
    public static final int CAMION = 4;

    public static Vehiculo getProducto(int rango_precio) {

        switch (rango_precio) {
            case BICICLETA:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            case MOTO:
                return new Moto();
            case COCHE:
                return new Coche();
            default:
                return null;
        }

    }

}
