public class Main {
    public static void main(String[] args) {
        Factory factoryPlayer = new FactoryPlayer();
        Player Support = factoryPlayer.createSupport();
        Player Mid = factoryPlayer.createMid();
        Player Carry = factoryPlayer.createCarry();

        Support.action();
        Mid.action();
        Carry.action();
    }
}
