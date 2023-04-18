public class Factory {

    public static final int BICICLETA = 1;
    public static final int  MOTO= 2;
    public static final int COCHE = 3;
    public static final int CAMION = 4;

    public static Vehiculo getProducto(int medio_de_envio) {

        switch (medio_de_envio) {
            case BICICLETA:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            default:
                return null;
        }

    }

}
