package cajero;
import java.util.Scanner;
public class metodos {
    int retirar = 0;
    public void retirarDinero() {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dinero que deseas retirar ");
        retirar = cubrir.nextInt();
        if (retirar >= 5) {
            System.out.println("Usted quiere retirar " + retirar + " €");
            System.out.println("Recibirá: ");
        } else {
            System.out.println("Seleccione una cifra mayor que 5 € ");
        }
    }
    public void numBilletes() {

        int quini = 0, dosci = 0, cien = 0, cincu = 0, veinte = 0, diez = 0, cinco = 0;

        quini = retirar / 500;
        retirar = retirar - (quini * 500);
        dosci = retirar / 200;
        retirar = retirar - (dosci * 200);
        cien = retirar / 100;
        retirar = retirar - (cien * 100);
        cincu = retirar / 50;
        retirar = retirar - (cincu * 50);
        veinte = retirar / 20;
        retirar = retirar - (veinte * 20);
        diez = retirar / 10;
        retirar = retirar - (diez * 10);
        cinco = retirar / 5;
        retirar = retirar - (cinco * 5);

        if (quini>0){
        System.out.println("Numero de billetes de 500 = " + quini);}
        if (dosci>0){
            System.out.println("Numero de billetes de 200 = " + dosci);}
        if (cien>0){
            System.out.println("Numero de billetes de 100 = " + cien);}
        if (cincu>0){
            System.out.println("Numero de billetes de 50 = " + cincu);}
        if (veinte>0){
            System.out.println("Numero de billetes de 20 = " + veinte);}
        if (diez>0){
            System.out.println("Numero de billetes de 10 = " + diez);}
        if (cinco>0){
            System.out.println("Numero de billetes de 5 = " + cinco);}

    }


}
