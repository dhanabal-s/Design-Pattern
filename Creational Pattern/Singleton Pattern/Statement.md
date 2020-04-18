# Singleton Pattern

Single Pattern ensure the class has **only one instance** and provide global point to access it.

# Problem 
Just think about _online store_.

It have two type of contributors

1) _Producer (or) Seller_
2) _Consumer (or) Buyer_
    
    We have class for online store calles _Shop_.
 _shop_ have a various methods and varables like _addProduct(), sellProduct(), productCategory, totalProducts and etc_.
 Just imagine we allocate a new _object (or) instance_ for a each and every _seller and buyer_.
 
 **What happen?**
       Every _seller and buyer_ have indiviual variable and methods in _Shop_. If customer enter the _Shop_ class it look like a fresh _shop_ which means _seller_ modifited data's are not reflected to _buyer_. So, every customer enter the _Shop_ it shows empty. It cause our  _Store_ failure. To shortout this we use the _Singleton Pattern_. Using _Singleton_ all other class access the _Shop_ through single object so every changes in _Shop_ is reflected to the all the _consumer and producer's Shop object_.
    
**Stops to achieve Singleton Pattern**
    We achieve it through two methods    
   1) Early Instantiation: creation of instance at load time.
   2) Lazy Instantiation: creation of instance when required.
