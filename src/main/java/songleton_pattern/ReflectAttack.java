package songleton_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 模拟通过反射进行对单例模式的攻击
 */
public class ReflectAttack{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //枚举模式 Cannot reflectively create enum objects
        Constructor<EnumSingleton> enumSingletonConstructor =
                EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
        enumSingletonConstructor.setAccessible(true);
        EnumSingleton enumSingleton = enumSingletonConstructor.newInstance("INSTANCE",0);
        System.out.println(enumSingleton == EnumSingleton.INSTANCE);

        //饿汉式
        Constructor<HungrySingleton> hungrySingletonConstructor =
                HungrySingleton.class.getDeclaredConstructor();
        hungrySingletonConstructor.setAccessible(true);
        HungrySingleton hungrySingleton = hungrySingletonConstructor.newInstance();
        System.out.println(hungrySingleton == HungrySingleton.getInstance());

        //静态内部类模式
        Constructor<InnerClassSingleton> innerClassSingletonConstructor =
                InnerClassSingleton.class.getDeclaredConstructor();
        innerClassSingletonConstructor.setAccessible(true);
        InnerClassSingleton innerClassSingleton = innerClassSingletonConstructor.newInstance();
        System.out.println(innerClassSingleton==InnerClassSingleton.getInstance());
    }
}
