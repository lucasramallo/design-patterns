package github.lucasramallo.factoryMethod;

public class Main {
    public static void main(String[] args) {
        ProductInfoService productInfoService = new ProductInfoService();
        ClothingFactory clothingFactory = new ClothingFactory();
        EletronicsFactory eletronicsFactory = new EletronicsFactory();

        productInfoService.showInfo(clothingFactory.createProduct());

    }
}
