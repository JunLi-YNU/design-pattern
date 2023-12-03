package proxy_pattern.CGLIB_proxy;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 15:53:40
 * @version: 1.0
 * @Description: 客户类
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用代理对象中的代理方法
        proxyObject.sellTicket();
    }
}
