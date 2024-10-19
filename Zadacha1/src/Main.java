//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.processOrder("clothing", "T-shirt", 20.0, order);
        orderProcessor.processOrder("shoes", "Sneakers", 50.0, order);
        orderProcessor.processOrder("electronics", "Smartphone", 300.0, order);

        order.printOrder();
    }
}