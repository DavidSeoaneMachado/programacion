package semana9.ejercicio;

public class perro {

    private String pelo;
    private String color;
    private int chip;
    private int peso;
    private int altura;



    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public static String ladrar(int peso, int altura) {

        String ladrido = "";

        if (peso < 5 && altura < 2) {
            ladrido = "guau guau";
        }
        if (peso > 5 && altura > 2) {
            ladrido = "GUAU GUAU!!!!";
        }
        if (peso < 5 && altura > 2) {
            ladrido = "guau GUAU";
        }
        if (peso > 5 && altura < 2) {
            ladrido = "GUAU guau!!!!";
        }
        return ladrido;
    }
}
