public class Main {
    public static void main(String[] args) {
        VeredaGT veredaGT = new VeredaGT("123455-KKK", 100, 100, 19 );
        System.out.println("Nivel de energía actual: " + veredaGT.energyLevel());
        for (int i = 0; i < 7; i++) {
            veredaGT.move();
        }
        System.out.println(veredaGT.status());
        veredaGT.recharge();
        System.out.println(veredaGT.status());
    }
}