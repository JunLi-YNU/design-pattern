package factory_pattern;

/**
 * 具体工厂类
 */
public class ConcreteProductBFactory extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
