package songleton_pattern;

/**
 * 饿汉式：利用JVM的类加载机制实现
 *
 * 类加载机制：
 * 1.将二进制文件进行加载，生成Class的数据结构
 * 2.1⃣️验证 2⃣️准备（静态变量赋初始值） 3⃣️解析
 * 3.初始化 （给静态变量赋值）
 *
 * 示例：Runtime
 */

public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){
        if(instance != null){
            throw new RuntimeException("单例类不允许创建多个实例！");
        }
    }

    public static  HungrySingleton getInstance(){
        return instance;
    }

}
