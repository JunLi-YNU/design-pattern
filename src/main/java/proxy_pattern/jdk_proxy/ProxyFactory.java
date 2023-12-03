package proxy_pattern.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:38:58
 * @version: 1.0
 * @Description: 代理售票点工厂类
 */
public class ProxyFactory {
    private final TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        /*
         * ClassLoader loader:类加载器，用于加载被代理类。可以通过目标类获取类加载器。
         * Class<?>[] interfaces:代理类实现的接口的字节码对象
         * InvocationHandler h:代理对象的调用处理程序
         */
        /*
        Object proxy: 代理对象
         Method method: 对被代理对象实现的接口中的方法进行封装的method对象
         Object[] args: 调用方法时的参数
         */
        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("(jdk动态代理)代理增强:代售点收取了相应的服务费用");
                    //执行被代理对象的方法
                    return method.invoke(trainStation, args);
                }
        );
    }
}
