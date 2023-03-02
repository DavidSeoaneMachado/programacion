import java.util.ArrayList;
import java.util.Random;

public class Liga_futbol implements Liga {

    Jornada[][] jornadas = new Jornada[42][11];
    ArrayList<Equipo_futbol> liga_array = new ArrayList<Equipo_futbol>();

    Equipo_futbol Beti = new Equipo_futbol();
    Equipo_futbol Malaga = new Equipo_futbol();
    Equipo_futbol Osasuna = new Equipo_futbol();
    Equipo_futbol Beti_blanco = new Equipo_futbol();
    Equipo_futbol Beti_Norte = new Equipo_futbol();
    Equipo_futbol Beti_Gallego = new Equipo_futbol();
    Equipo_futbol Betilona = new Equipo_futbol();
    Equipo_futbol Barça = new Equipo_futbol();
    Equipo_futbol PerroSancheFC = new Equipo_futbol();
    Equipo_futbol Cadi = new Equipo_futbol();
    Equipo_futbol Almeria = new Equipo_futbol();
    Equipo_futbol Mambo = new Equipo_futbol();
    Equipo_futbol Palancas = new Equipo_futbol();
    Equipo_futbol Seymour = new Equipo_futbol();
    Equipo_futbol Fry = new Equipo_futbol();
    Equipo_futbol Lila = new Equipo_futbol();
    Equipo_futbol Hoju = new Equipo_futbol();
    Equipo_futbol Homer_junior = new Equipo_futbol();
    Equipo_futbol Asus = new Equipo_futbol();
    Equipo_futbol Acer = new Equipo_futbol();
    Equipo_futbol Lenovo = new Equipo_futbol();
    Equipo_futbol P_Casado = new Equipo_futbol();

    @Override
    public ArrayList<Equipo_futbol> crear_liga(String nombre_liga) {

        Beti.setNombre("Beti");
        P_Casado.setNombre("P_Casado");
        Beti_blanco.setNombre("Beti_blanco");
        Beti_Gallego.setNombre("Beti_Gallego");
        Beti_Norte.setNombre("Beti_Norte");
        Osasuna.setNombre("Osasuna");
        Barça.setNombre("Barça");
        Acer.setNombre("Acer");
        Asus.setNombre("Asus");
        Hoju.setNombre("Hoju");
        Homer_junior.setNombre("Homer_junior");
        Malaga.setNombre("Malaga");
        Betilona.setNombre("Betilona");
        PerroSancheFC.setNombre("PerroSancheFC");
        Mambo.setNombre("Mambo");
        Palancas.setNombre("Palancas");
        Seymour.setNombre("Seymour");
        Fry.setNombre("Fry");
        Lila.setNombre("Lila");
        Lenovo.setNombre("Lenovo");
        Cadi.setNombre("Cadi");
        Almeria.setNombre("Almeria");

        liga_array.add(Beti);
        liga_array.add(Barça);
        liga_array.add(Beti_Norte);
        liga_array.add(Beti_blanco);
        liga_array.add(Betilona);
        liga_array.add(Beti_Gallego);
        liga_array.add(Malaga);
        liga_array.add(Mambo);
        liga_array.add(Osasuna);
        liga_array.add(PerroSancheFC);
        liga_array.add(Cadi);
        liga_array.add(Almeria);
        liga_array.add(Palancas);
        liga_array.add(Seymour);
        liga_array.add(Fry);
        liga_array.add(Lila);
        liga_array.add(Asus);
        liga_array.add(Acer);
        liga_array.add(Lenovo);
        liga_array.add(Hoju);
        liga_array.add(Homer_junior);
        liga_array.add(P_Casado);

        System.out.println("La liga '" + nombre_liga + "' está compuesta por los siguientes equipos.");
        for (int i = 0; i < liga_array.size(); i++) {
            //System.out.println(liga_array.toString());
            System.out.println("-" + i + " " + liga_array.get(i)); //Tanto esta sentencia como la de arriba son validas para imprimir los nombres de los equipos. Cada una de una forma.
        }
        return liga_array;
    }

    @Override
    public Jornada[][] simular_liga() { //metodo para simular la liga por completo y guardar todas las jornadas en una matriz//

        for (int i = 0; i < 42; ++i) { //bucle para sacar todas las jornadas de la liga (sin resultados)
            ArrayList<Integer> liga_array_out = new ArrayList<>(); //arraylist de 22 enteros (equipos) para evitar que se repitan los indices de los equipos a añadir en cada jornada//
            for (int k = 0; k<22; k++){
                liga_array_out.add(k);
            }
            for (int j = 0; j < 11; ++j) { //bucle de enfrentamientos en cada jornada //
                while (liga_array_out.size() > 0 ) { //se repite hasta que el arraylist de enteros esta vacio, es decir, no quedan mas equipos que jugar en la jornada//
                    int index = (int)Math.floor(Math.random()*((liga_array_out.size()-1)-0+1)+0); //random evitando un out of bound con el (liga_array_out.size()-1) //
                    int index2 = (int)Math.floor(Math.random()*((liga_array_out.size()-1)-0+1)+0); //random evitando un out of bound con el (liga_array_out.size()-1) //
                    if (index!=index2 && index>index2) { //condicion de uno mayor que otro para evitar que al eliminar el menor cambie la situacion del indice mayor en el array//
                        Jornada jornada = new Jornada(liga_array.get(index), liga_array.get(index2)); //el objeto jornada solicita dos objetos que van a ser los equipos que se van a enfrentar//
                        jornadas[i][j] = jornada; //el puesto [0][0] de la matriz corresponde al primer partido de la primera jornada. [3][6] corresponderia por ejemplo al septimo de la cuarta jornada//
                        liga_array_out.remove(index); //eliminamos los numeros que ya han salido del arralist de enteros para que no se repitan //
                        liga_array_out.remove(index2);
                        j++; //sumamos uno al iterador dado que si llego hasta aqui la funcion ya tenemos un partido mas añadido //
                    }
                    if (index!=index2 && index<index2) { //condicion de uno mayor que otro para evitar que al eliminar el menor cambie la situacion del indice mayor en el array//
                        Jornada jornada = new Jornada(liga_array.get(index), liga_array.get(index2)); //el objeto jornada solicita dos objetos que van a ser los equipos que se van a enfrentar//
                        jornadas[i][j] = jornada; //el puesto [0][0] de la matriz corresponde al primer partido de la primera jornada. [3][6] corresponderia al septimo de la cuarta jornada//
                        liga_array_out.remove(index2); //eliminamos los numeros que ya han salido del arralist de enteros para que no se repitan //
                        liga_array_out.remove(index);
                        j++; //sumamos uno al iterador dado que si llego hasta aqui la funcion ya tenemos un partido mas añadido //
                    }
                }
            }

        }

        for (int i = 0; i < 1; ++i) {
            for (int j = 0; j < 11; ++j) {
                System.out.println("En la jornada " + (i+1) + ", " + (j+1) + "º partido:" + jornadas[i][j]);

            }
        }

        System.out.println("CHORIZO");

       /* Random rand = new Random();
        for (int i = 0; i < 42; ++i) {
            for (int j = 0; j < 11; ++j) {
               // ArrayList<Integer> liga_array_out = new ArrayList<>(); //array creado para introducir los indices del array de la liga ya utilizados y que no se repitan //
                while (liga_array_out.size() < liga_array.size()) { //el array de salida solo se llena cuando se hayan agotado los equipos del indice de la liga (se han asignado todos esta jornada) //
                    int index = rand.nextInt(liga_array.size());
                    int index2 = rand.nextInt(liga_array.size());
                    if (!liga_array_out.contains(index) && !liga_array_out.contains(index2) && index!=index2) { //si el array de eliminacion no contiene los indices random, se los añadimos y creamos el partido que corresponde//
                        liga_array_out.add(index);
                        liga_array_out.add(index2);
                        Jornada jornada = new Jornada(liga_array.get(index), liga_array.get(index2)); //el objeto jornada solicita dos objetos que van a ser los equipos que se van a enfrentar//
                        jornadas[i][j] = jornada; //el puesto [0][0] de la matriz corresponde al primer partido de la primera jornada. [3][6] corresponderia al septimo de la cuarta jornada//
                    }
                }
            }
        }

        for (int i = 0; i < 1; ++i) {
            for (int j = 0; j < 11; ++j) {
                System.out.println("En la jornada " + (i+1) + ", " + (j+1) + "º partido:" + jornadas[0][j]);

            }
        } */
        return jornadas;
    }

    @Override
    public void calcular_jornada(int jornada, Jornada[][] matriz) {

        if (jornada > 42) {
            System.out.println("Ya se han jugado las 42 jornadas de la liga. Borra la liga y comienza una nueva.");
        } else {
            System.out.println("Se simulará la jornada " + jornada);

            int marcador_local = (int) Math.floor(Math.random() * (5 - 0 + 1) + 0);
            int marcador_visitante = (int) Math.floor(Math.random() * (5 - 0 + 1) + 0);


            ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
            final int MAX_INT = 23;
            for (int i = 0; i < MAX_INT; i++) {
                int random = (int) Math.floor(Math.random() * (21 - 0 + 1) + 0);
                for (int j = 0; j < MAX_INT; j++) {
                    if (i == 0) {
                        listaEnteros.add(random);
                    }
                    if (random != listaEnteros.get(j)) {
                        listaEnteros.add(random);
                    }
                    System.out.println(listaEnteros);
                    System.out.println("perro------------------------------------------------------------");
                }
            }


            int[] numeros = new int[22];
            for (int i = 0; i < numeros.length; i++) {
                int random = (int) Math.floor(Math.random() * (21 - 0 + 1) + 0);
                for (int j = 0; j < numeros.length; j++) {
                    if ((random != numeros[j]) && (random != numeros[i])) {
                        numeros[i] = random;
                    }
                }
            }

            for (int e : numeros) {
                System.out.println(e);
            }
        }

    }


    @Override
    public void mostrar_clasificacion() {

    }


}
