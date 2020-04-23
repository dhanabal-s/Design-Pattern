# Factory Pattern
   In Factory pattern, we create object without exposing the creation logic to client and the client use the same common interface to create new type of object.
   
   When we want to return one sub-class object from multiple sub-classes using an input, should use Factory design pattern.
   
# Example
   In travel site, we can book train ticket as well bus tickets and flight ticket. In this case user can only required a single class object depends upon the users choice of travel medium(Bus, Train or Flight). So, we have to create a object for specific class depends on the user input. For this, we create another class __*Factory*__. Which returns the object of the specific class depends upon the user request.
   
   
   
