# Enums workshop

## Intro

### Enumeration

Special class, that represents a group of 'constants'.
```java
enum Weather {
    SUNNY, CLOUDY, RAINY, SNOWY, WINDY
}
//....
for(Weather w: Weather.values()) {
    System.out.println(w);
}
```

Can have fields and methods.
Can't extend other classes, but can implement interfaces.

#### Tasks
A washmachine can operate on 3 heat levels, with 3 different color programs. Examine the behaviour of the program in package `com.codecool.enums.task1`!

1. What happens when the current implementation is called with invalid values? How would the caller know?
2. Implement a solution in `task2`, without enums, how could this be fixed? (hint: think constants, with private constructors)
3. Implement a solution in `task3`, with enums!


## State machine with enums

### State Machines

A finite state machine is a mathematical abstraction used to design algorithms.

A state machine will read a series of inputs. When it reads an input, it will switch to a different state.
Each state specifies which state to switch to, for a given input.

Can be represented by a graph, or a state transition table.

#### Tasks

4. Create a java program, that implements below state machine:
```mermaid
stateDiagram-v2
[*] --> Start
Start --> A :  a
A --> 2A : a
2A --> 3A: a
3A --> Start: a
3A --> B : b
Start --> B : b
B --> [*]
```

5. [Extra] Create a java program, that implements below state machine:
```mermaid
stateDiagram-v2
    [*] --> order_created 
    order_created --> payment_pending: order accepted
    payment_pending --> manufacture_pending: order payed
    manufacture_pending --> stock_pending: product manufactured
    stock_pending --> delivery_pending: product dispatched
    delivery_pending --> confirmation_pending: product delivered
    confirmation_pending --> order_confirmed: delivery confirmed
    order_confirmed --> [*]
    payment_pending --> order_cancelled: order withdrawn
    order_cancelled --> [*]
    manufacture_pending --> refund_pending: manufacture failed
    refund_pending --> order_cancelled: refund completed
    delivery_pending --> refund_pending: product lost
    confirmation_pending --> dispute_negotiation_pending: dispute opened
    dispute_negotiation_pending --> refund_pending: negotiation failed
    dispute_negotiation_pending --> order_confirmed: negotiation succeeded
```

[Examples](https://gamedevelopment.tutsplus.com/tutorials/finite-state-machines-theory-and-implementation--gamedev-11867)