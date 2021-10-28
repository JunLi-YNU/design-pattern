package factory_pattern;

/**
 * 具体的产品
 */
public class ConcreteProductA extends Product{
    @Override
    public void method() {
        System.out.println("这是产品A！");
    }
}
