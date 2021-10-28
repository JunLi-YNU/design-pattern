package songleton_pattern;

import javax.naming.spi.Resolver;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableInnerClassSingleton implements Serializable {

    static final long serialVersionUID = 1L;
    private static class InnerClassHolder{
        private static SerializableInnerClassSingleton instance = new SerializableInnerClassSingleton();
    }

    private SerializableInnerClassSingleton(){
        if(InnerClassHolder.instance != null){
            throw new RuntimeException("单例类不允许创建多个对象");
        }
    }

    public static SerializableInnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }

    //序列化可读性
    Object readResolve() throws ObjectStreamException{
        return InnerClassHolder.instance;
    }
}
