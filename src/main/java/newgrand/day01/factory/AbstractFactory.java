package newgrand.day01.factory;

import newgrand.day01.target.PC;
import newgrand.day01.target.Phone;

public interface AbstractFactory {
    Phone getPhone();

    PC getPC();
}
