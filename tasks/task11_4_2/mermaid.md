# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    Customer -- Order : place
    Order -- OrderItem : includes

    class Customer{
        name
        address
        placeOrder()  
    }
    class Order {
        orderNumber
        datePlaced
        delivertDate
        checkStock()
        takePayment()
    }
    class OrderItem {
        name
        description
    }
  note "Placeholder for a real class diagram"
```




[mer]: https://mermaid.js.org/
