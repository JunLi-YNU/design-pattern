package factory_pattern;

public class Client {
    public static void main(String[] args){
        Factory factory = new ConcreteProductAFactory();
        Product product = factory.createProduct();
        product.method();
    }
}
