package factory_pattern;

public abstract class ReflectFactory {

    public abstract <T extends Product> T createProduct(Class<T> clz);
}
