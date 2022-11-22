/**
 * Semana 9 (métodos).
 *
 * @author David Seoane Machado
 * @version 22.11.2022
 *
 */

public class Perro {

    private String pelo;
    private String color;
    private int chip;
    private int peso;
    private int altura;


    /**
     * Getter.
     * @return pelo.
     */
    public String getPelo() {
        return pelo;
    }
    /**
     * Setter.
     * @param pelo a definir
     */
    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    /**
     * Getter.
     * @return color.
     */
    public String getColor() {
        return color;
    }
    /**
     * Setter.
     * @param color a definir
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Getter.
     * @return chip.
     */
    public int getChip() {
        return chip;
    }
    /**
     * Setter.
     * @param chip a definir
     */
    public void setChip(int chip) {
        this.chip = chip;
    }
    /**
     * Getter.
     * @return peso.
     */
    public int getPeso() {
        return peso;
    }
    /**
     * Setter.
     * @param peso a definir
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * Getter.
     * @return altura.
     */
    public int getAltura() {
        return altura;
    }
    /**
     * Setter.
     * @param altura a definir
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Muestra un tipo de ladrido en funcion del peso y altura del perro.
     * @param peso peso del perro.
     * @param altura altura del perro.
     * @return ladrido.
     */
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
