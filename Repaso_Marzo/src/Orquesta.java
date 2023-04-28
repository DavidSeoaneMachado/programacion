public class Orquesta {

    Instrumento[] array_instrumentos;
    int tamaño;
    String director;
    String nombre;

    public Orquesta() { //Constructor vacio//
    }

    public Orquesta(Orquesta otra_orquesta) { //Constructor copia//
        this.array_instrumentos = otra_orquesta.array_instrumentos;
        this.director = otra_orquesta.director;
        this.nombre = otra_orquesta.nombre;
        this.tamaño = otra_orquesta.tamaño;
    }

    public Orquesta(int tamaño) { //Constructor parametrizado//
        array_instrumentos = new Instrumento[tamaño];
    }

    public String ejecutar_movimiento(int[][] matriz) {

        Guitarra git = new Guitarra();
        Flauta fla = new Flauta();

        array_instrumentos[0] = git;
        array_instrumentos[1] = fla;


        for (Instrumento f : array_instrumentos) {

        }


        for (int i = 0; i > matriz.length; i++) {
            for (int j = 0; j > matriz[i].length; j++) {
                array_instrumentos[i].;
            }
        }

        String guitarra_sonido = git.emitir_sonido(matriz[0][0], matriz[0][1], matriz[0][2]);
        String flauta_sonido = fla.emitir_sonido(matriz[1][0], matriz[1][1]);
        return guitarra_sonido + flauta_sonido;

    }

}
