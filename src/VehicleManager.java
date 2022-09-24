public class VehicleManager implements CreditManager {
    @Override
    public void calculate() {
        System.out.println("Arac kredisi hesaplandi");
    }

    @Override
    public void add() {
        System.out.println("Arac kredisi eklendi");
    }
}
