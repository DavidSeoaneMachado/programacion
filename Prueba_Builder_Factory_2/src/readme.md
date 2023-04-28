### Pasos combinacion Builder-Factory

Supongamos que tenemos una clase llamada Pizza que tiene varios atributos, como el tipo de masa, el tamaño, los ingredientes, etc. Queremos crear una fábrica de pizzas que use un patrón Builder para permitir la personalización de las pizzas.

Primero, creamos una interfaz PizzaBuilder que define los métodos para construir una pizza.

Luego, implementamos una clase PizzaBuilderImpl que implementa esta interfaz y proporciona una implementación concreta de cada método para construir una pizza.

A continuación, implementamos una clase PizzaFactory que utiliza el patrón Factory para crear pizzas personalizadas utilizando el patrón Builder.

Finalmente, podemos crear pizzas personalizadas utilizando la fábrica de pizzas y el patrón Builder.

De esta manera, combinamos los patrones de diseño Factory y Builder para crear objetos complejos y personalizados en Java.