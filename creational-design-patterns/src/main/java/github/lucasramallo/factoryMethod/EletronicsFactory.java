package github.lucasramallo.factoryMethod;

import github.lucasramallo.factoryMethod.products.Electronics;

public class EletronicsFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Electronics("Compiuter", "Apresentar Nota fiscal, caixa em bom estado e formulário de garantia preenchido.");
    }
}
