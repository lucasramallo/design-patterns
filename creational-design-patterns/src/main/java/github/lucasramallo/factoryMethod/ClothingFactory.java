package github.lucasramallo.factoryMethod;

import github.lucasramallo.factoryMethod.products.Clothing;
import github.lucasramallo.factoryMethod.products.Electronics;

public class ClothingFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Clothing("Camisa", "Troca pode ser realizada em até 2 semanas após a compra");
    }
}
