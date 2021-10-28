package factory_pattern;

/**
 * 具体工厂类
 */
public class ConcreteProductAFactory extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
