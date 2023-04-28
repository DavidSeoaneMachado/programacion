public class PizzaFactory {
    public static Pizza createPizza(String tipo) {

        PizzaBuilder builder = new PizzaBuilderImpl();

        if (tipo.equals("Hawaiana")) {
            builder.buildMasa();
            builder.buildTamaño();
            builder.buildIngredientes();
        } else if (tipo.equals("Pepperoni")) {
            builder.buildMasa();
            builder.buildIngredientes();
        } else if (tipo.equals("Vegetariana")) {
            builder.buildMasa();
            builder.buildIngredientes();
        }

        return builder.getPizza();
    }
}