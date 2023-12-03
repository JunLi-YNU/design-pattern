package proxy_pattern.jdk_proxy;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:50:38
 * @version: 1.0
 * @Description: 客户类
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //使用代理工厂对象获取代理对象
        SellTickets sellTickets = proxyFactory.getProxyObject();
        //调用被代理的方法
        sellTickets.sellTicket();
    }
}
