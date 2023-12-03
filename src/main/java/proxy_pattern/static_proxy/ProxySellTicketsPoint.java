package proxy_pattern.static_proxy;

import proxy_pattern.ProxySubject;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:29:18
 * @version: 1.0
 * @Description: 火车票代售点
 */
public class ProxySellTicketsPoint implements SellTickets{
    private final TrainStation trainStation = new TrainStation();
    @Override
    public void sellTicket() {
        System.out.println("(静态代理)代理增强:代售点收取一些代售费用");
        trainStation.sellTicket();
    }
}
