public class OrderQueue {
       
    /* add your code here */
  
    public static void main(String[] args) {
        OrderQueue tracker = new OrderQueue();
        tracker.addOrder(new Order(new String[]{"Laptop", "Monitor"}, "Fahad", "A001"));
        tracker.addOrder(new Order(new String[]{"Earrings", "Bracelets", "Necklaces"}, "Noura", "A002"));
        tracker.addOrder(new Order(new String[]{"UNO", "Monopoly"}, "Sara", "A003"));

        tracker.printFirstOrder();
        tracker.printTotalOrders();

        tracker.processOrder();

        tracker.printFirstOrder();
        tracker.printTotalOrders();
    }
}
