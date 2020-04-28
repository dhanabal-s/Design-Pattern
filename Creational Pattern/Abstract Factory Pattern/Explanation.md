# Abstract Factory Pattern
It provides an interface (or abstract class) for creating families of related or dependent objects without specifying their concrete classes. 

Abstract Factory Pattern is almost similar to Factory Pattern with one more abstraction layer over factory pattern and this layer provides the factory of the factories.

For example, we have two or more _Factory classes(Factory Pattern)_ and we should choose one of them at runtime, at here _Abstract Factory_ helps to create one of them.

## Example
   Think we have a _ShowRoom_. In the _ShowRoom_ we have two segments. One is _PetrolEngineFactory_ and another one is _DieselEngineFactory_.
In the both segments we have _Car and Bike segments_. If you want to see a _Car or Bike_, first you should choose that is  _PetrolEngine_ or _DieselEngine_,then can access any one of it. At here, we should assign resposibility to _PetrolEngineFactory_ to return the object of _PetrolCar or PetrolBike_, as well as _DieselEngineFactory_. Like _PetrolEngineFactory_, we should assign resposibility _ShowRoomFactory_ to return the object of _PetrolEngineFactory or DieselEngineFactory_. Here, We create the _Factory_ class called _ShowRoom_ for returning object of another _Factory_ , that's why we call itas an __*Abstract Factory Pattern*__.
