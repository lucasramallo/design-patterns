package github.lucasramallo.factoryMethod.products;

import github.lucasramallo.factoryMethod.Product;

public class Clothing implements Product {
    private String name;
    private String exchangePolicy;

    public Clothing(String name, String exchangePolicy) {
        this.name = name;
        this.exchangePolicy = exchangePolicy;
    }

    public Clothing() {
    }

    @Override
    public void displayDetails() {
        System.out.println("Nome: " + this.name);
        System.out.println("Política de troca: " + this.exchangePolicy);
    }
}
