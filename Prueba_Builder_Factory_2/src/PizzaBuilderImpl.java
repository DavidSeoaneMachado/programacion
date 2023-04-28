public class PizzaBuilderImpl implements PizzaBuilder {
    private Pizza _pizza;

    public PizzaBuilderImpl() {
        _pizza = new Pizza();
    }

    public void buildMasa() {
        // Implementación para construir la masa de la pizza
    }

    public void buildTamaño() {
        // Implementación para construir el tamaño de la pizza
    }

    public void buildIngredientes() {
        // Implementación para construir los ingredientes de la pizza
    }

    public Pizza getPizza() {
        return _pizza;
    }
}