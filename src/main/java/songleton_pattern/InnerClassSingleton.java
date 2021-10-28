package songleton_pattern;

/**
 * 静态内部类模式:
 * 1.同懒汉式一样，利用的是JVM的类加载机制实现单例的创建
 * 2.是一种懒加载模式：当静态变量被访问的时候才进行加载
 */
public class InnerClassSingleton {
    //1.创建静态内部类持用单例对象
    private static class InnerClassHolder{
        private static InnerClassSingleton instance= new InnerClassSingleton();
    }
    //2.创建私有构造函数，禁止外部床架对象
    private InnerClassSingleton(){
        if(InnerClassHolder.instance != null){
            throw new RuntimeException("单例类不允许创建多个实例！");
        }
    }
    //3.提供公有静态访问接口
    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }

}
