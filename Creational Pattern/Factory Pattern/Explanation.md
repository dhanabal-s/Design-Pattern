# Factory Pattern
   In Factory pattern, we create object without exposing the creation logic to client and the client use the same common interface to create new type of object.
   
   When we want to return one sub-class object from multiple sub-classes using an input, should use Factory design pattern.
   
## Example
   We're building a travel site. In the site we can book train ticket as well bus tickets and flight ticket. In this case we should create an only one class object depends upon the users choice(travel by Bus, Train or Flight). So, we should create an object of specific class depends on the user choice. For this, we create another class __*Factory*__. Which returns the object of the specific class depends upon the user choice.
   
   
   
