package factory_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConcreteFactory extends ReflectFactory{
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            //p  = (Product) Class.forName(clz.getName()).newInstance();
            p = (Product) Class.forName(clz.getName()).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
