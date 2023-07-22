package songleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HungrySingletonTest {
    @DisplayName("单例模式测试--饿汉模式")
    @Test
    public void testHungrySingleton() {
        HungrySingleton HungrySingletonFirst = HungrySingleton.getInstance();
        HungrySingleton HungrySingletonSecond = HungrySingleton.getInstance();

        Assertions.assertSame(HungrySingletonFirst, HungrySingletonSecond);

        new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();
        new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();
    }
}