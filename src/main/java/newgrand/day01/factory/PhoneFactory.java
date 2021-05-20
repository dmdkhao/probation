package newgrand.day01.factory;

import newgrand.day01.target.IPhone;
import newgrand.day01.target.MiPhone;
import newgrand.day01.target.Phone;

/**
 *  普通工厂，通过传入的值来判断创建对象的类型
 */
public class PhoneFactory {
    public Phone getPhone(String className){
        if("".equals(className)){
            return null;
        }else if(className.equalsIgnoreCase("MiPhone")){
            return new MiPhone();
        }else if(className.equalsIgnoreCase("IPhone")){
            return new IPhone();
        }else{
            return null;
        }
    }
}
