package github.lucasramallo.factoryMethod.products;

import github.lucasramallo.factoryMethod.Product;

public class Electronics implements Product {
    private String name;
    private String warranty;

    public Electronics(String name, String warranty) {
        this.name = name;
        this.warranty = warranty;
    }


    public Electronics() {
    }

    @Override
    public void displayDetails() {
        System.out.println("Nome: " + this.name);
        System.out.println("Garantia: " + this.warranty);
    }
}
