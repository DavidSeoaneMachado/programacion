public abstract class Madera implements Instrumento {
    private boolean lengueta = true;

    public boolean isLengueta() {
        return lengueta;
    }

    public void setLengueta(boolean lengueta) {
        this.lengueta = lengueta;
    }

    //modifica los valores de las constantes para que sean DO y VIENTO. La afinacion ya es DO por defecto//
    public static final Clase_categoria.Categoria TIPO = Clase_categoria.Categoria.VIENTO;


    public String emitir_sonido(int modificador, boolean lengueta) {
        if (lengueta!= isLengueta()) {
            throw new IllegalArgumentException("NO HAY LENGUETA. PROBLEMAS");
        }
        double nuevo_valor_tono;
        nuevo_valor_tono = modificador + TONO.getFrecuencia();
        return "Emitiendo el sonido de la frecuencia " + nuevo_valor_tono;
    }

}
