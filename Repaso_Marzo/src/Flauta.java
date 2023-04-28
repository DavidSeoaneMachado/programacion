public class Flauta extends Madera {

    private int n_agujeros = 20;
    @Override
    public String emitir_sonido(int modificador, int agujero) {
        if (agujero> n_agujeros) {
            throw new IllegalArgumentException("NO HAY TANTOS AGUJEROS. PROBLEMAS");
        }
        double nuevo_valor_tono;
        nuevo_valor_tono = modificador + TONO.getFrecuencia();
        return "Emitiendo el sonido de la frecuencia de la flauta: " + nuevo_valor_tono;
    }

    @Override
    public String emitir_sonido(int modificador) {
        return null;
    }
}
