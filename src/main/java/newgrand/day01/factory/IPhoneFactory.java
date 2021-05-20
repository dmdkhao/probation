package newgrand.day01.factory;

import newgrand.day01.target.IPhone;
import newgrand.day01.target.MAC;
import newgrand.day01.target.PC;
import newgrand.day01.target.Phone;

public class IPhoneFactory implements AbstractFactory {
    @Override
    public Phone getPhone() {
        return new IPhone();
    }

    @Override
    public PC getPC() {
        return new MAC();
    }
}
