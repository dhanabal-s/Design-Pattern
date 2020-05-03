# Adapter Pattern
Adapter Pattern convert the interface of a class into another interface the clients expert. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## Example 
Suppose you have __*Dragon*__ class with run() and fire() methods. Now, you're decided to create a new __*Dragon*__ called __*FlyingDragon*__. For that you needed a fly() method. But, existing interface don't have a fly() method. So, you're needed to change old code. At that time, something stricked on your mind. That is you have a class __*Bird*__ with fly() method. So, you decided to use that class in your __*FlyingDragon*__ class. But, __*Dragon*__ and __*Bird*__ classes are incomptiable(like, us plugin and indian plug point).

__*How to connect tham?*__

Yes, you're right. __*Adapter*__.

So, to connect __*Dragon*__ and __*Bird*__ classes we class create adapter class. which give you flexibility to access the __*Bird*__ class methods through class the __*Dragon*__ object. For, better understanding see the implementation.
