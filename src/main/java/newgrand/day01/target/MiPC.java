package newgrand.day01.target;

public class MiPC implements PC{

    public MiPC(){
        System.out.println("MiPC made");
    }

    @Override
    public void use() {
        System.out.println("using MiPC");
    }
}
