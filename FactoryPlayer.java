public class FactoryPlayer implements Factory{
    @Override
    public Player createSupport() {
        return new Support();
    }

    @Override
    public Player createMid() {
        return new Mid();
    }

    @Override
    public Player createCarry() {
        return new Carry();
    }
}
