package factory_pattern;

/**
 * 抽象工厂类：抽象出所有工厂公有的方法
 */
public abstract class Factory {
    /**
     * 抽象方法，实现由具体的类实现
     * @return
     */
    public abstract Product createProduct();
}
