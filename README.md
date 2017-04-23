# WaffleShop

## 1.Statement of the Work
Waffle Shop is a café that sells waffles and drinks. When customers arrive at this cafe, they design the waffle they want according to the kinds of waffles, their ingredients and their prices. In addition, customers can order hot or cold beverages from the menu. The waitress delivers these orders to the cook from the customer. The cook is responsible for making the waffle and preparing the drink according to the order.

## 2.Proposed Pattern
Many design patterrns are applied for solving existing problems in the project. These design patterns are Command Pattern, Simple Factory Pattern, Template Method Pattern and Decorator Pattern.

Firstly, customers create a waffle (Waffle Order) or beverage (Beverage Order) order and the waitress (Invoker) delivers these orders to the cook (Receiver). The cook works with Waffle Factory for waffle and with Beverage Factory for beverage. To do this, the cook uses makeWaffle() and makeBeverage() methods (Simple Factory Pattern).

Waffle Factory create waffle and to do this create Waffle interface. There are two kinds of waffles such as Circular and Square in Waffle Shop and these waffle types implement Waffle interface. The customers had chosen waffle ingredients according to the waffle they had previously wanted. The waffle is decorated according to these waffle ingredients (Decorator Pattern). There are 3 Decorator classes for waffle decoration such as Chocolate Decorator, Fruit Decorator and Condiment Decorator. Cost of the waffle is calculated according to decoration ingredients. 

Finally, Beverage Factory is responsible for hot and cold beverages creation and creates Beverage interface. Hot Beverage and Cold Beverage classes implement this interface. Subclasses such as tea, coffee, cola etc. extend these classes. The distinction between them is the difference in the preparation of hot and cold beverages (Template Method Pattern). Also, there are some differences in subclasses. Finally, hook() is used for each beverage and the customer is asked if some extra condiments are wanted. 

## 3.Class Diagram
![general](https://cloud.githubusercontent.com/assets/21054424/25312908/20adf99a-282d-11e7-843d-fed5350c1111.PNG)



