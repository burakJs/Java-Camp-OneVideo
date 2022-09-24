public class MortgageManager implements CreditManager {
    @Override
    public void calculate() {
        System.out.println("Mortgage kredisi hesaplandi");
    }

    @Override
    public void add() {
        System.out.println("Mortgage kredisi eklendi");
    }
}
