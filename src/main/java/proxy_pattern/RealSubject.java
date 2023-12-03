package proxy_pattern;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:06:07
 * @version: 1.0
 * @Description: 实现抽象主题的真实主题
 */
public class RealSubject extends Subject{
    @Override
    public void visit() {
        System.out.println("Real subject");
    }
}
