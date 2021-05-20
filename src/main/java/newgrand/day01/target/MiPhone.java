package newgrand.day01.target;

public class MiPhone implements Phone{

    public MiPhone(){
        System.out.println("MiPhone made");
    }

    @Override
    public void use() {
        System.out.println("use MiPhone");
    }
}