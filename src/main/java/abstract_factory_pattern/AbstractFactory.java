package abstract_factory_pattern;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    /**
     * 创建A类产品
     * @return 产品A对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B类产品
     * @return
     */
    public abstract AbstractProductB createProductB();
}
