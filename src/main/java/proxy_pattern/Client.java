package proxy_pattern;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:13:54
 * @version: 1.0
 * @Description: 客户类
 */
public class Client {
    public static void main(String[] args) {
        //构建真实主题
        RealSubject realSubject = new RealSubject();
        //通过真实主题构架一个代理类
        ProxySubject proxySubject = new ProxySubject(realSubject);
        //调用代理的相关方法
        proxySubject.visit();
    }
}
