package songleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

class EnumSingletonTest {
    @DisplayName("单例模式测试--枚举模式")
    @Test
    public void testEnumSingleton() {
        EnumSingleton enumSingletonFirst = EnumSingleton.INSTANCE;
        EnumSingleton enumSingletonSecond = EnumSingleton.INSTANCE;
        Assertions.assertSame(enumSingletonFirst, enumSingletonSecond);
    }

    @DisplayName("单例模式测试--枚举模式--序列化")
    @Test
    public void enumSingletonOutputTest() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream("EnumSingletonSerializableFile"));
        objectOutputStream.writeObject(EnumSingleton.INSTANCE);
        objectOutputStream.close();
    }

    @DisplayName("单例模式测试--枚举模式--反序列化")
    @Test
    public void enumSingletonInputTest() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream
                (new FileInputStream("EnumSingletonSerializableFile"));
        EnumSingleton enumSingleton = (EnumSingleton) objectInputStream.readObject();
        Assertions.assertSame(enumSingleton, EnumSingleton.INSTANCE);
    }

}