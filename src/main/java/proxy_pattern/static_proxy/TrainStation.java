package proxy_pattern.static_proxy;

import proxy_pattern.Subject;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:27:07
 * @version: 1.0
 * @Description: 火车站售票点
 */
public class TrainStation implements SellTickets {
    @Override
    public void sellTicket() {
        System.out.println("火车站售票点：售票");
    }
}
