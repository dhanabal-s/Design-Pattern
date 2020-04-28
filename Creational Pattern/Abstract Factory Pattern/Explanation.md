# Abstract Factory Pattern
It provides an interface (or abstract class) for creating families of related or dependent objects without specifying their concrete classes. 

Abstract Factory Pattern is almost similar to Factory Pattern with one more abstraction layer over factory pattern and this layer provides the factory of the factories.

For example, we have two or more _Factory classes(Factory Pattern)_ and we should choose one of them at runtime, at here _Abstract Factory_ helps to create one of them.

## Example
   Think we have a __*ShowRoom*__. In the __*ShowRoom*__ we have two segments. One is __*PetrolEngineFactory*__ and another one is __*DieselEngineFactory*__.
In the both segments we have _Car and Bike segments_. If you want to see a _Car or Bike_, first you should choose that is  __*PetrolEngine*__ or _DieselEngine_,then can access any one of it. At here, we should assign resposibility to __*PetrolEngineFactory*__ to return the object of __*PetrolCar or PetrolBike*__, as well as __*DieselEngineFactory*__. Like __*PetrolEngineFactory*__, we should assign resposibility __*ShowRoomFactory*__ to return the object of __*PetrolEngineFactory or DieselEngineFactory*__. Here, We create the __*Factory*__ class called __*ShowRoom*__ for returning object of another __*Factory*__ , that's why we call itas an __*Abstract Factory Pattern*__.
