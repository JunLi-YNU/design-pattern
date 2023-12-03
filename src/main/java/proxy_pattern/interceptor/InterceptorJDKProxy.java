package proxy_pattern.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 16:22:17
 * @version: 1.0
 * @Description: JDK代理
 */
public class InterceptorJDKProxy implements InvocationHandler {
    private final Object target;//真实对象
    private String interceptorClass = null;//拦截器权限限定名

    public InterceptorJDKProxy(Object target,String interceptorClass){
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    public static Object bind(Object target,String interceptorClass){
        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InterceptorJDKProxy(target,interceptorClass)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //如果没有设置拦截器则直接反射原有方法
        if(interceptorClass==null){
            return method.invoke(target,args);
        }
        Object result=null;
        //通过反射生成拦截器
        Interceptor interceptor=(Interceptor)Class.forName(interceptorClass).getDeclaredConstructor().newInstance();
        //调用前置方法
        if(interceptor.before(proxy,target,method,args)){
           //反射原有方法
            result= method.invoke(target,args);
        }else{
            //返回false，执行around方法
            interceptor.around(proxy,target,method,args);
        }

        //调用后置方法
        interceptor.after(proxy,target,method,args);
        return result;
    }
}
