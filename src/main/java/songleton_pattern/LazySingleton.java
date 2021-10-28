package songleton_pattern;

/**
 * 懒汉式：利用同步锁synchronized() 加双重判断实现
 *
 * 劣势:不可以避免进行反射攻击
 */
public class LazySingleton {
    //volatile 原子性操作，避免JIT和CPU进行指令重排而发生的创建多个对象
    private volatile static  LazySingleton lazySingletonInstance;

    private LazySingleton(){

    }

    //同步锁：避免多线程的创建多个实例
    public  static LazySingleton getInstance(){
        //第一次检测对象是否存在
        if(lazySingletonInstance == null){
            //在这里加同步锁的原因是：1.线程安全 2.减少性能消耗（避免在每次调用方法的时侯都去检测锁）延迟加锁
            synchronized (LazySingleton.class){
                //避免多线程下多次创建对象
                if(lazySingletonInstance == null){
                    lazySingletonInstance = new LazySingleton();
                    //在字节码层面，JIT（及时编译器）或 CPU会对指令进行排序，命令窗口javap汇编反编译
                    // 所以初始化和引用赋值会发生顺序颠倒，从而导致NullLPointer的出现。
                    //1.分配空间
                    //2.初始化
                    //3.引用赋值
                }
            }
        }
        return lazySingletonInstance;
    }
}
