public enum Enum {
    DO(261.63),
    RE(293.66),
    MI(329.63),
    FA(349.23),
    SOL(392),
    LA(442),
    SI(493.88);
    private final double frecuencia;
    Enum(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    public double getFrecuencia() {
        return frecuencia;
    }
}
