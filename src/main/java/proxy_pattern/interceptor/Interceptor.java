package proxy_pattern.interceptor;

import java.lang.reflect.Method;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 16:12:19
 * @version: 1.0
 * @Description: 拦截器接口
 */
public interface Interceptor {
    /**
     *
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method 方法参数
     * @param args 参数
     * @return 返回值
     */
    boolean before(Object proxy, Object target, Method method, Object[] args);
    void around(Object proxy, Object target, Method method, Object[] args);
    void after(Object proxy, Object target, Method method, Object[] args);
}
