package songleton_pattern;

/**
 * 枚举单例模式：
 * 1.天然的支持反序列化
 * 2.不可以进行反射获取，对反射攻击具有天的屏蔽
 */
public enum EnumSingleton {
    INSTANCE;
}
