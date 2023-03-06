import java.util.*;

public class Liga_futbol implements Liga {

    Jornada[][] jornadas = new Jornada[42][11];
    ArrayList<Equipo_futbol> liga_array = new ArrayList<Equipo_futbol>();

    @Override
    public ArrayList<Equipo_futbol> crear_liga(String nombre_liga, boolean ligacreada) {

        String[] nombres = {"Almería", "Athletic", "Atlético", "Barça", "Betis", "Cádiz", "Celta",
                "Elche", "Espanyol", "Getafe", "Girona", "Mallorca", "Osasuna", "R.Sociedad", "Rayo",
                "R.Madrid", "R.Valladolid", "Sevilla", "Valencia", "Villarreal", "Deportivo C.", "Real Pepe"};

        if (ligacreada == false) {
            for (int i = 0; i < nombres.length; i++) {
                Equipo_futbol nuevoEquipo = new Equipo_futbol(nombres[i]);
                liga_array.add(nuevoEquipo);
            }

            System.out.println("La liga '" + nombre_liga + "' está compuesta por los siguientes equipos.");
            for (int i = 0; i < liga_array.size(); i++) {
                //System.out.println(liga_array.toString());
                System.out.println("-" + i + " " + liga_array.get(i)); //Tanto esta sentencia como la de arriba son validas para imprimir los nombres de los equipos. Cada una de una forma.
            }
        } else {

            for (int i = 0; i < nombres.length; i++) {
                liga_array.remove(0);
            }

            for (int i = 0; i < nombres.length; i++) {
                Equipo_futbol nuevoEquipo = new Equipo_futbol(nombres[i]);
                liga_array.add(nuevoEquipo);
            }

            System.out.println("La liga '" + nombre_liga + "' está compuesta por los siguientes equipos.");
            for (int i = 0; i < liga_array.size(); i++) {
                //System.out.println(liga_array.toString());
                System.out.println("-" + i + " " + liga_array.get(i)); //Tanto esta sentencia como la de arriba son validas para imprimir los nombres de los equipos. Cada una de una forma.
            }
        }

        return liga_array;
    }

    @Override
    public Jornada[][] simular_liga(int ida_vuelta) { //metodo para simular la liga por completo y guardar todas las jornadas en una matriz//

       /* for (int i = 0; i < 42; ++i) { //bucle para sacar todas las jornadas de la liga (sin resultados)
            ArrayList<Integer> liga_array_out = new ArrayList<>(); //arraylist de 22 enteros (equipos) para evitar que se repitan los indices de los equipos a añadir en cada jornada//
            for (int k = 0; k < 22; k++) {
                liga_array_out.add(k);
            }
            for (int j = 0; j < 11; ++j) { //bucle de enfrentamientos en cada jornada //
                while (liga_array_out.size() > 0) { //se repite hasta que el arraylist de enteros esta vacio, es decir, no quedan mas equipos que jugar en la jornada//
                    int index = (int) Math.floor(Math.random() * ((liga_array_out.size() - 1) - 0 + 1) + 0); //random evitando un out of bound con el (liga_array_out.size()-1) //
                    int index2 = (int) Math.floor(Math.random() * ((liga_array_out.size() - 1) - 0 + 1) + 0); //random evitando un out of bound con el (liga_array_out.size()-1) //
                    if (index != index2 && index > index2) { //condicion de uno mayor que otro para evitar que al eliminar el menor cambie la situacion del indice mayor en el array//
                        Jornada jornada = new Jornada(liga_array.get(index), liga_array.get(index2)); //el objeto jornada solicita dos objetos que van a ser los equipos que se van a enfrentar//
                        jornadas[i][j] = jornada; //el puesto [0][0] de la matriz corresponde al primer partido de la primera jornada. [3][6] corresponderia por ejemplo al septimo de la cuarta jornada//
                        liga_array_out.remove(index); //eliminamos los numeros que ya han salido del arralist de enteros para que no se repitan //
                        liga_array_out.remove(index2);
                        j++; //sumamos uno al iterador dado que si llego hasta aqui la funcion ya tenemos un partido mas añadido //
                    }
                    if (index != index2 && index < index2) { //condicion de uno mayor que otro para evitar que al eliminar el menor cambie la situacion del indice mayor en el array//
                        Jornada jornada = new Jornada(liga_array.get(index), liga_array.get(index2)); //el objeto jornada solicita dos objetos que van a ser los equipos que se van a enfrentar//
                        jornadas[i][j] = jornada; //el puesto [0][0] de la matriz corresponde al primer partido de la primera jornada. [3][6] corresponderia al septimo de la cuarta jornada//
                        liga_array_out.remove(index2); //eliminamos los numeros que ya han salido del arralist de enteros para que no se repitan //
                        liga_array_out.remove(index);
                        j++; //sumamos uno al iterador dado que si llego hasta aqui la funcion ya tenemos un partido mas añadido //
                    }
                }
            }

        } */
if (ida_vuelta<=21){
    for (int i = 0; i < 21; ++i) {
        Collections.shuffle(liga_array);
        for (int j = 0; j < 11; ++j) {
            int indice = 0;
            while (indice < liga_array.size()) {
                Jornada jornada = new Jornada(liga_array.get(indice), liga_array.get(indice + 1));
                if (Arrays.asList(jornadas).contains(jornada)) {
                    Collections.shuffle(liga_array);
                } else {
                    jornadas[i][j] = jornada;
                    indice += 2;
                    j++;
                }
            }
        }
    }
}

        if (ida_vuelta>21 && ida_vuelta<43){
            for (int i = 22; i < 43; ++i) {
                Collections.shuffle(liga_array);
                for (int j = 0; j < 11; ++j) {
                    int indice = 0;
                    while (indice < liga_array.size()) {
                        Jornada jornada = new Jornada(liga_array.get(indice), liga_array.get(indice + 1));
                        if (Arrays.asList(jornadas).contains(jornada)) {
                            Collections.shuffle(liga_array);
                        } else {
                            jornadas[i][j] = jornada;
                            indice += 2;
                            j++;
                        }
                    }
                }
            }
        }

       /* for (int i = 0; i < 1; ++i) {
            for (int j = 0; j < 11; ++j) {
                System.out.println("En la jornada " + (i + 1) + ", " + (j + 1) + "º partido: " + jornadas[i][j]);
            } */


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
            System.out.println("Se simulará la jornada " + jornada + ".");

            for (int j = 0; j < 11; j++) {
                int marcador_local = (int) Math.floor(Math.random() * (5 - 0 + 1) + 0);
                int marcador_visitante = (int) Math.floor(Math.random() * (5 - 0 + 1) + 0);

                matriz[jornada - 1][j].getLocal().setGoles_a_favor(matriz[jornada - 1][j].getLocal().getGoles_a_favor() + marcador_local);
                matriz[jornada - 1][j].getVistante().setGoles_a_favor(matriz[jornada - 1][j].getVistante().getGoles_a_favor() + marcador_visitante);
                matriz[jornada - 1][j].getLocal().setGoles_en_contra(matriz[jornada - 1][j].getLocal().getGoles_en_contra() + marcador_visitante);
                matriz[jornada - 1][j].getVistante().setGoles_en_contra(matriz[jornada - 1][j].getVistante().getGoles_en_contra() + marcador_local);

                matriz[jornada - 1][j].getLocal().setPartidos_jugados(matriz[jornada - 1][j].getLocal().getPartidos_jugados() + 1);
                matriz[jornada - 1][j].getVistante().setPartidos_jugados(matriz[jornada - 1][j].getVistante().getPartidos_jugados() + 1);

                System.out.println(matriz[jornada - 1][j].getLocal().getNombre() + " " + marcador_local + " - " + marcador_visitante + " " + matriz[jornada - 1][j].getVistante().getNombre());

                if (marcador_local > marcador_visitante) {
                    matriz[jornada - 1][j].getLocal().setVictorias(matriz[jornada - 1][j].getLocal().getVictorias() + 1);
                    matriz[jornada - 1][j].getVistante().setDerrotas(matriz[jornada - 1][j].getVistante().getDerrotas() + 1);
                    matriz[jornada - 1][j].getLocal().setPuntuacion(matriz[jornada - 1][j].getLocal().getPuntuacion() + 3);
                }
                if (marcador_local < marcador_visitante) {
                    matriz[jornada - 1][j].getLocal().setDerrotas(matriz[jornada - 1][j].getLocal().getDerrotas() + 1);
                    matriz[jornada - 1][j].getVistante().setVictorias(matriz[jornada - 1][j].getVistante().getVictorias() + 1);
                    matriz[jornada - 1][j].getVistante().setPuntuacion(matriz[jornada - 1][j].getVistante().getPuntuacion() + 3);
                }
                if (marcador_local == marcador_visitante) {
                    matriz[jornada - 1][j].getLocal().setEmpates(matriz[jornada - 1][j].getLocal().getEmpates() + 1);
                    matriz[jornada - 1][j].getVistante().setEmpates(matriz[jornada - 1][j].getVistante().getEmpates() + 1);
                    matriz[jornada - 1][j].getLocal().setPuntuacion(matriz[jornada - 1][j].getLocal().getPuntuacion() + 1);
                    matriz[jornada - 1][j].getVistante().setPuntuacion(matriz[jornada - 1][j].getVistante().getPuntuacion() + 1);
                }
            }
        }
    }

    @Override
    public void mostrar_clasificacion() {
        System.out.println("Clasificacion.");
        for (int i = 0; i < 22; i++) {
            Collections.sort(liga_array, Comparator.comparing(Equipo::getPuntuacion, Comparator.reverseOrder()));
            System.out.println((i+1) + "º " + liga_array.get(i) + " con " + liga_array.get(i).getPuntuacion());
        }
    }


}
