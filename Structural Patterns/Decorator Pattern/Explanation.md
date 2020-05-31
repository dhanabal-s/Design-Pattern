# Decorator Pattern
 The Decorator Pattern attaches additional responsibilities to an object dynamically.Decorators provide a flexible alternative to
subclassing for extending functionality.

Decorator design patterns allow us to add functionality to an object at runtime, and we can apply this customized functionality to an individual object based on our requirement and choice.

## Example
Suppose, We build a __*Pizza*__ ordering application(like zomato). In it, you have to derive multiple classes for differnent type of Pizza's.

At now, you are derived a classes for Pizza's. Think, in the application user can specify the ingredient by own(like add extra cheese or toppings). But, they have to pay for all of the additional thing.

__How you calculate the price?__

Now, you are thing just define the variable for all ingredients and calculate the price.

But, we have a problem in it. what you do, if anyone or more ingredients price is change or you should add new ingredient. You have to change the existing code. But, It is not perferable way. Because it need more effects and you should need  to know the working of the full code in under the class.

Using Decorator pattern we add additional responsibilities to the class without affecting existing code.

Just split the different functionality of class into different classes.

So, we can add or change the ingredients just implementing new class or change the specific class.

look the code for better understanding.


