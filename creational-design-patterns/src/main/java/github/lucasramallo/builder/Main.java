package github.lucasramallo.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .massa("fina")
                .molho("tomate")
                .cobertura("queijo")
                .build();

        System.out.println(pizza);
    }
}
