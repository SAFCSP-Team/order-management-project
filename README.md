# Order Management Project

### Objective
Use fundamental data structures and algorithms to solve real-world problems with a queue data structure.


### Problem
An e-commerce company needs a system to manage online orders during the shipping process. The system should be able to add new orders to a waiting queue and process them in the order they are received.

### Implementation
- Create a class called `Order` that holds the details of an order, such as:
  - `products`: an array of ordered product names.
  - `customer`: the customer name.
  - `id`: the order ID.
- Create an `OrderQueue` class to manage the queue of orders, supporting these operations:
  - Add a new order to the queue.
  - Process (ship) the first order in the queue and remove it from the queue.
  - Print the total number of orders currently in the queue.
  - Print the details of the first order in the queue.
 
### Test Case
```java
public static void main(String[] args) {
    OrderQueue tracker = new OrderQueue();
    tracker.addOrder(new Order(new String[]{"Laptop", "Monitor"}, "Fahad", "A001"));
    tracker.addOrder(new Order(new String[]{"Earrings", "Bracelets", "Necklaces"}, "Noura", "A002"));
    tracker.addOrder(new Order(new String[]{"UNO", "Monopoly"}, "Sara", "A003"));

    tracker.firstOrder();
    tracker.totalOrders();

    tracker.processOrder();

    tracker.firstOrder();
    tracker.totalOrders();
}
```
```
Order Products: Laptop, Monitor
Customer Name: Fahad
Order ID: A001

Total Orders: 3

Processing Order:
Order Products: Laptop, Monitor
Customer Name: Fahad
Order ID: A001

Order Products: Earrings, Bracelets, Necklaces
Customer Name: Noura
Order ID: A002

Total Orders: 2
```
### Qualification to pass
- [ ] The code should run successfully.
- [ ] All required functions must be implemented correctly.
- [ ] Completely define the `Order` class.
- [ ] Completely define  the `OrderQueue` class.
