public class Vehiculo {

    private String matricula;

    private String tipo;

    private int tamaño;

    public Vehiculo(int tamaño) {
        this.tamaño = tamaño;
        if (tamaño == 1) {
            tipo = "coche (ocupa 1 plaza) ";
        }
        if (tamaño == 2) {
            tipo = "camion (ocupa 2 plazas) ";
        }
        System.out.println("-Se ha seleccionado introducir un " + tipo);
        generar_matricula();
        // System.out.println("El vehiculo es de tipo: "+ tipo);
        // System.out.println("Su matricula es "+ generar_matricula());

    }

    public String toString() {
        return " un vehiculo tipo " + tipo + "con matricula = " + matricula;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String generar_matricula() {

        // String[] letras = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        //int num_matricula = (int) Math.floor(Math.random() * (9999 - 999 + 1) + 999);
        //  for (int i = 0; i < 1; i++) {
        //    int letra = (int) Math.floor(Math.random() * (letras.length - 0 + 1) + 0);
        //   String indiv = "";
        //   indiv = letras[letra];
        //   matricula = num_matricula + indiv;
        //   System.out.println(matricula);

        String[] letras = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        int num_matricula = (int) Math.floor(Math.random() * (9999 - 999 + 1) + 999);

        int letra = (int) Math.floor(Math.random() * ((letras.length - 1) - 0 + 1) + 0);
        int letra2 = (int) Math.floor(Math.random() * ((letras.length - 1) - 0 + 1) + 0);
        int letra3 = (int) Math.floor(Math.random() * ((letras.length - 1) - 0 + 1) + 0);
        String indiv = "";
        indiv = letras[letra];
        String indiv2 = "";
        indiv2 = letras[letra2];
        String indiv3 = "";
        indiv3 = letras[letra3];
        matricula = num_matricula + indiv + indiv2 + indiv3;
        return matricula;

    }
}

