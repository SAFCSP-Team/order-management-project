# Order Management Project

### Objective
Use fundamental data structures and algorithms to solve real-world problems with a queue data structure.


### Problem
An e-commerce company needs a system to manage online orders during the shipping process. The system should be able to add new orders to a waiting queue and process them in the order they are received.

### Implementation
- Create a class called `Order` that holds the details of an order, such as `orderType`, `customerName`, and `orderNumber`.
- Create an `OrderQueue` class to manage the queue of orders, supporting these operations:
  - Add a new order to the queue.
  - Process (ship) the first order in the queue and remove it from the queue.
  - Print the total number of orders currently in the queue.
  - Print the details of the first order in the queue.
 
### Test Case
```java
public static void main(String[] args) {
    OrderQueue tracker = new OrderQueue();
    tracker.addOrder(new Order("Electronics", "Fahad", "A001"));
    tracker.addOrder(new Order("Clothing", "Noura", "A002"));
    tracker.addOrder(new Order("Books", "Sara", "A003"));

    tracker.printFirstOrder();
    tracker.printTotalOrders();

    tracker.processOrder();

    tracker.printFirstOrder();
    tracker.printTotalOrders();
}
```
```
Order Type: Electronics
Customer Name: Fahad
Order Number: A001

Total Orders: 3

Processing Order:
Order Type: Electronics
Customer Name: Fahad
Order Number: A001

Order Type: Clothing
Customer Name: Noura
Order Number: A002

Total Orders: 2
```
### Qualification to pass
- [ ] The code should run successfully.
- [ ] All required functions must be implemented correctly.
- [ ] Completely define the `Order` class.
- [ ] Completely define  the `OrderQueue` class.
