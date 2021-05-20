package newgrand.day01.single;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 单例：属Java设计模式之一，提供了一种创建对象的最佳方式。这个类只需要提供唯一的实例。外部只能访问这个类，不能实例化这个类。
 *      概括：
 *          1.构造方法私有化
 *          2.静态属性指向实例
 *          3.public static的 getInstance方法，返回第二步的静态属性
 *
 *      种类：
 *          1. 枚举
 *          2. 饿汉式
 *          3. 懒汉式
 *
 */
public class MySingleTest {

    public static void main(String[] args) {
//        System.out.println(Single.INSTANCE);
//        System.out.println(EHan1.INSTANCE);
//        System.out.println(EHan2.getInstance());
//        System.out.println("------------");
//        System.out.println(SingleLazy1.getInstance());
        for (int i = 0; i <=10 ; i++) {
            new Thread(()->{
                System.out.println(SingleLazy3.getInstance());
            }).start();
        }
        for (int i = 0; i <=10 ; i++) {
            new Thread(()->{
                System.out.println(SingleLazy2.getInstance());
            }).start();
        }


    }
}

enum Single{
    INSTANCE
}

class EHan1{
    public static final EHan1 INSTANCE = new EHan1();

    private EHan1(){}
}

class EHan2{
    private static EHan2 INSTANCE = new EHan2();

    private EHan2(){}

    public static EHan2 getInstance(){
        return INSTANCE;
    }

}

/**
 * 最普通的懒汉式，被调用时才实例化
 */
class SingleLazy1{
    private static SingleLazy1 instance;
    private SingleLazy1(){}

    public static SingleLazy1 getInstance(){
        if(instance == null){
            instance = new SingleLazy1();
        }
        return instance;
    }
}

/**
 * 第一种改良，给获取方法上锁，防止有多个线程进入“获取方法”造成反复进行instance的赋值操作。
 */
class SingleLazy2{
    private static SingleLazy2 instance;

    private SingleLazy2(){}

    public static synchronized SingleLazy2 getInstance(){
        if(instance == null){
            instance = new SingleLazy2();
        }
        return instance;
    }
}

class SingleLazy3{
    private static SingleLazy3 instance;

    private SingleLazy3(){}

    public static SingleLazy3 getInstance(){
        if(instance == null){
            synchronized (SingleLazy3.class){
                if(instance == null)
                    instance = new SingleLazy3();
            }
        }
        return instance;
    }
}

/**
 * 静态内部类的形式
 */
class SingleLazy4{
    private SingleLazy4() {

    }
    private static class Inner{
        public static final SingleLazy4 INSTANCE = new SingleLazy4();
    }

    public static SingleLazy4 getInstance() {
        return Inner.INSTANCE;
    }

}
