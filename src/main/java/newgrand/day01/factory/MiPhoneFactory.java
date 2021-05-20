package newgrand.day01.factory;

import newgrand.day01.target.MiPC;
import newgrand.day01.target.MiPhone;
import newgrand.day01.target.PC;
import newgrand.day01.target.Phone;

public class MiPhoneFactory implements AbstractFactory{
    @Override
    public Phone getPhone() {
        return new MiPhone();
    }

    @Override
    public PC getPC() {
        return new MiPC();
    }
}
