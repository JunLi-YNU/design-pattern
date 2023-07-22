package songleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LazySingletonTest {
    @DisplayName("单例模式测试--懒汉式")
    @Test
    public void testLazySingleton() {
        LazySingleton lazySingletonFirst = LazySingleton.getInstance();
        LazySingleton lazySingletonSecond = LazySingleton.getInstance();

        Assertions.assertSame(lazySingletonFirst, lazySingletonSecond);

        new Thread(() -> System.out.println(LazySingleton.getInstance())).start();
        new Thread(() -> System.out.println(LazySingleton.getInstance())).start();
    }
}