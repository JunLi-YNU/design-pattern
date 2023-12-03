package proxy_pattern.CGLIB_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 15:38:06
 * @version: 1.0
 * @Description: 代理工厂
 */
public class ProxyFactory implements MethodInterceptor {
    private final TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("(CGLIB代理: 代售点收取一定的服务费用");
        return method.invoke(trainStation,objects);
    }
}
