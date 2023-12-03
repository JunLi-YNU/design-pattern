package proxy_pattern;

/**
 * @Author: LiJun-YNU
 * @createTime: 2023年12月03日 14:08:12
 * @version: 1.0
 * @Description: 代理类
 */
public class ProxySubject extends Subject {

    private final RealSubject mRealSubject;

    public ProxySubject(RealSubject realSubject) {
        this.mRealSubject = realSubject;
    }

    @Override
    public void visit() {
        System.out.println("Proxy subject:进行扩展操作");
        mRealSubject.visit();
    }
}
