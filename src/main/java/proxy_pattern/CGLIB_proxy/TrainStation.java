package proxy_pattern.CGLIB_proxy;

import proxy_pattern.jdk_proxy.SellTickets;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:27:07
 * @version: 1.0
 * @Description: 火车站售票点
 */
public class TrainStation{

    public void sellTicket() {
        System.out.println("火车站售票点：售票");
    }
}
