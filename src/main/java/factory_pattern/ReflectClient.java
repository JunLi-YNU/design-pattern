package factory_pattern;

public class ReflectClient {
    public static void main(String[] args){
        ReflectFactory reflectFactory = new ConcreteFactory();
        Product product = reflectFactory.createProduct(ConcreteProductA.class);
        product.method();
    }
}
