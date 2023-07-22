package songleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InnerClassSingletonTest {
    @DisplayName("单例模式测试--静态内部类模式")
    @Test
    public void testInnerClassSingleton() {
        InnerClassSingleton InnerClassSingletonFirst = InnerClassSingleton.getInstance();
        InnerClassSingleton InnerClassSingletonSecond = InnerClassSingleton.getInstance();

        Assertions.assertSame(InnerClassSingletonFirst, InnerClassSingletonSecond);

        new Thread(() -> System.out.println(InnerClassSingleton.getInstance())).start();
        new Thread(() -> System.out.println(InnerClassSingleton.getInstance())).start();
    }

}