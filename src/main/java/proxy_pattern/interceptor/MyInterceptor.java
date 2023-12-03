package proxy_pattern.interceptor;

import java.lang.reflect.Method;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 16:16:55
 * @version: 1.0
 * @Description: 拦截器
 */
public class MyInterceptor implements Interceptor{
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("(拦截器JDK动态代理):代理点收取了一些服务费用");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("(拦截器JDK动态代理):代理点无票");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("(拦截器JDK动态代理):给发票");
    }
}
