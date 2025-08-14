public class OrderQueue {

  
    public static void main(String[] args) {
        OrderQueue tracker = new OrderQueue();
        tracker.addOrder(new Order(["Laptop", "Monitor"], "Fahad", "A001"));
        tracker.addOrder(new Order(["Earrings", "Bracelets", "Necklaces"], "Noura", "A002"));
        tracker.addOrder(new Order(["UNO", "Monopoly"], "Sara", "A003"));

        tracker.firstOrder();
        tracker.totalOrders();

        tracker.processOrder();

        tracker.firstOrder();
       tracker.totalOrders();
    }
}
