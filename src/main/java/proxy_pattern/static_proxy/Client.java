package proxy_pattern.static_proxy;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:34:15
 * @version: 1.0
 * @Description: 客户端类
 */
public class Client {
    public static void main(String[] args) {
        ProxySellTicketsPoint proxySellTicketsPoint = new ProxySellTicketsPoint();
        proxySellTicketsPoint.sellTicket();
    }
}
