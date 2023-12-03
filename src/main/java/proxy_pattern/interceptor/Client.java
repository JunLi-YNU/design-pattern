package proxy_pattern.interceptor;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 16:35:44
 * @version:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SellTickets sellTickets = (SellTickets) InterceptorJDKProxy.bind(new TrainStation(),"proxy_pattern.interceptor.MyInterceptor");
        sellTickets.sellTicket();
    }
}
