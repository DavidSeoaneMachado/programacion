public class Guitarra extends Pulsada {
    private int n_trastes = 0;


    public String emitir_sonido(int modificador, int cuerda, int traste) {
     if (cuerda>getN_cuerdas() || traste> n_trastes) {
         throw new IllegalArgumentException("El numero de cuerdas o trastes es mayor a las disponibles");
     }
        double nuevo_valor_tono;
        nuevo_valor_tono = modificador + TONO.getFrecuencia();
        return "Emitiendo el sonido de la frecuencia " + nuevo_valor_tono;
    }
}
