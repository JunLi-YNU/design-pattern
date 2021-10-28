package abstract_factory_pattern;

/**
 * 一个具体的工厂：专为生产A-1和B-1
 */
public class ConcreteFactoryOne extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductAOne();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductBOne();
    }
}
