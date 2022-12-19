package Enunciado2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        Maquina maquina = new Maquina();
        Usuario usuario = new Usuario();
        int salir = 0;

        do {
            System.out.println("¿Que quieres hacer? \n1 Jugar. \n2 Mostrar datos del usuario. \n3 Mostrar datos de la maquina. \n4 Salir.");
            int menu = cubrir.nextInt();

            switch (menu){

                case 1:
                    System.out.println("Haga sua puesta. ¿Cara o cruz?. \n1 Cara. \n2 Cruz.");
                    int decicion_usuario = cubrir.nextInt();
                    int cara_random = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);

                    if (decicion_usuario==1&&cara_random==1){
                        System.out.println("Enhorabuena, ha salido cara. Tu ganas.");
                        usuario.setVictorias(usuario.getVictorias()+1);
                        maquina.setDerrotas(maquina.getDerrotas()+1);
                        maquina.setPartidas_jugadas(maquina.getPartidas_jugadas()+1);
                        usuario.setPartidas_jugadas(usuario.getPartidas_jugadas()+1);
                    }
                    if (decicion_usuario==2&&cara_random==2){
                        System.out.println("Enhorabuena, ha salido cruz. Tu ganas.");
                        usuario.setVictorias(usuario.getVictorias()+1);
                        maquina.setDerrotas(maquina.getDerrotas()+1);
                        maquina.setPartidas_jugadas(maquina.getPartidas_jugadas()+1);
                        usuario.setPartidas_jugadas(usuario.getPartidas_jugadas()+1);
                    }
                    if (decicion_usuario==1&&cara_random==2){
                        System.out.println("Lo siento, ha salido cruz, la maquina gana.");
                        maquina.setVictorias(maquina.getVictorias()+1);
                        usuario.setDerrotas(usuario.getDerrotas()+1);
                        maquina.setPartidas_jugadas(maquina.getPartidas_jugadas()+1);
                        usuario.setPartidas_jugadas(usuario.getPartidas_jugadas()+1);
                    }
                    if (decicion_usuario==2&&cara_random==1){
                        System.out.println("Lo siento, ha salido cara, la maquina gana.");
                        maquina.setVictorias(maquina.getVictorias()+1);
                        usuario.setDerrotas(usuario.getDerrotas()+1);
                        maquina.setPartidas_jugadas(maquina.getPartidas_jugadas()+1);
                        usuario.setPartidas_jugadas(usuario.getPartidas_jugadas()+1);
                    }
                    break;

                case 2:
                    System.out.println("Los datos del usuario son:");
                    System.out.println("Victorias: " + usuario.getVictorias());
                    System.out.println("Empates: " + usuario.getEmpates());
                    System.out.println("Derrotas: " + usuario.getDerrotas());
                    System.out.println("Partidas jugadas: " + usuario.getPartidas_jugadas());
                    break;

                case 3:
                    System.out.println("Los datos de la maquina son:");
                    System.out.println("Victorias: " + maquina.getVictorias());
                    System.out.println("Empates: " + maquina.getEmpates());
                    System.out.println("Derrotas: " + maquina.getDerrotas());
                    System.out.println("Partidas jugadas: " + maquina.getPartidas_jugadas());

                    break;
                case 4:
                    salir=1;
            }

            if (maquina.getVictorias()==5){
                System.out.println("Se acabó la partida!! LA MAQUINA CONSIGUE LA 5º VICTORIA Y ES LA GANADORA!!");
                salir=1;
            }

            if (usuario.getVictorias()==5){
                System.out.println("Se acabó la partida!! HAS CONSIGUIDO LA 5º VICTORIA Y ERES EL/LA GANADORA!!");
                salir=1;
            }

        } while (salir==0);






    }


}
