public abstract class Pulsada implements Instrumento {
    private int n_cuerdas = 0;

    public int getN_cuerdas() {
        return n_cuerdas;
    }

    public void setN_cuerdas(int n_cuerdas) {
        this.n_cuerdas = n_cuerdas;
    }

    //modifica los valores de las constantes para que sean MI y CUERDA.//
    public static final Clase_afinacion.Afinacion TONO = Clase_afinacion.Afinacion.MI;
    public static final Clase_categoria.Categoria TIPO = Clase_categoria.Categoria.CUERDA;

    //“emitirSonido” utilizará el parámetro de entrada (llámalo
    //modificador, por ejemplo) para multiplicarlo por el TONO y devolver, como
    //cadena de caracteres un mensaje indicando el nuevo valor de TONO.
    public String emitir_sonido(int modificador) {
        double nuevo_valor_tono;
        nuevo_valor_tono = modificador + TONO.getFrecuencia();
        return "Emitiendo el sonido de la frecuencia " + nuevo_valor_tono;
    }


}
