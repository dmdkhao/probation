package newgrand.day01.target;

public class MAC implements PC{

    public MAC(){
        System.out.println("MAC made");
    }

    @Override
    public void use() {
        System.out.println("using MAC");
    }
}
