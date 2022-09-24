public class OfficerManager implements CreditManager {
    @Override
    public void calculate() {
        System.out.println("Officer kredisi hesaplandi");
    }

    @Override
    public void add() {
        System.out.println("Officer kredisi eklendi");
    }
}
