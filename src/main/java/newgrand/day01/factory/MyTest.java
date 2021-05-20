package newgrand.day01.factory;

import newgrand.day01.target.PC;
import newgrand.day01.target.Phone;

/**
 * 普通工厂模式
 *      构成： 统一接口、普通类、工厂类
 *      原理：
 *          1.统一接口中规定了普通类们共同需要实现的方法
 *          2.普通类要实现统一接口，普通类为即将要从工厂类中获取的对象
 *          3.工厂类中提供“根据参数内容返回对应普通类对象”的功能
 */
public class MyTest {

    public static void main(String[] args) {
        //普通工厂
//        PhoneFactory factory = new PhoneFactory();
//        Phone miPhone = factory.getPhone("MiPhone");
//        miPhone.use();
//        Phone iPhone = factory.getPhone("IPhone");
//        iPhone.use();

        //抽象方法工厂模式
//        IPhoneFactory iPhoneFactory = new IPhoneFactory();
//        Phone iphone = iPhoneFactory.getPhone();
//        iphone.use();
//        MiPhoneFactory miPhoneFactory = new MiPhoneFactory();
//        Phone miphone = miPhoneFactory.getPhone();
//        miphone.use();

        //抽象方法工厂模式
        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        Phone iphone = iPhoneFactory.getPhone();
        iphone.use();
        PC mac = iPhoneFactory.getPC();
        mac.use();

        System.out.println("------------");

        MiPhoneFactory miPhoneFactory = new MiPhoneFactory();
        Phone miphone = miPhoneFactory.getPhone();
        miphone.use();
        PC miPC = miPhoneFactory.getPC();
        miPC.use();


    }



}









