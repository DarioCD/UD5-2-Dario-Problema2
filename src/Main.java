public class Main {
    public static void main(String[] args) {
        VeredaGT veredaGT = new VeredaGT("123455-KKK", 100, 100, 19 );
        veredaGT.energyLevel();
        veredaGT.move();
        veredaGT.move();
        veredaGT.move();
        veredaGT.status();
        veredaGT.recharge();
        veredaGT.status();
    }
}