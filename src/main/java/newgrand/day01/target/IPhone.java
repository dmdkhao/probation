package newgrand.day01.target;

public class IPhone implements Phone{

    public IPhone(){
        System.out.println("IPhone made");
    }

    @Override
    public void use() {
        System.out.println("use IPhone");
    }
}
