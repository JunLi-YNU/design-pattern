package songleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

class SerializableInnerClassSingletonTest {
    @DisplayName("序列化测试--输出")
    @Test
    public void serializableOutputTest() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("SerializableSingletonFile"
        ));
        objectOutputStream.writeObject(SerializableInnerClassSingleton.getInstance());
        objectOutputStream.close();
    }

    @DisplayName("序列化测试--输入")
    @Test
    public void serializableInputTest() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("SerializableSingletonFile"));
        SerializableInnerClassSingleton serializableInnerClassSingleton = (SerializableInnerClassSingleton) objectInputStream.readObject();
        System.out.println(serializableInnerClassSingleton.toString());
        Assertions.assertSame(serializableInnerClassSingleton, SerializableInnerClassSingleton.getInstance());
    }

}