# Unit 05 - Writing Classes
- Public and private affect the access of classes, data, constructors and methods.
- private restricts access to the declaring class, while public allows access from classes outside the declasring class
## 5.1 - Anatomy of a Class
- Classes and constructors are designated public
- instance variables are designated public
## 5.2 - Constructors
- An object's state refers to its attributes and their values at a given time and is defined by instance variables belonging to the object. This creates a "has-a" relationship between the obect and its instance variables
- Constructors are used to set the initial state of an object, which should include intitial values for all instance variables
## 5.3 - Documentation with Comments
- three types of comments in java: 
- '/* */' which generates a block of comments
- // which generates a comment on one line
- /** */ which are Javadoc comments and are used to create API documantation
## 5.4 - Accessor Methods
- An accessor method allows othr objects to obtain the vlaue of instance variables or static variables. 
- A non- void method returnd a single value . Its header includes the return type in place of the keyword void.
- In non-void methods, a return expression compatible with the return type is evaluated, and a copy of that value is returned. That is referred to as "return by value."
## 5.5 - Mutator Methods
- A void method does not return a value. its header contains the keyword void before the method name. 
- A mutator (modifier) method is often a void method that changes the values of instance variables or static variables.
## 5.6 - Writing Methods
- Methods can only access the private data and methods of a parameter that is a reference to an object when the parameter is the same type as the method's enclosing class.
- Non-void methods with parameters receive values through parameters, use those values, and return a computed value of the specified type.
- when an actual parameter is a primitive value, the formal parameter is initialized with a copuy of that value. Changes to the formal parameter have no effect on the corresponding actual parameter.
## 5.7 - Static Variables and Methods
- Static methods are associated with the class, not objects of the class.
- Static mehtods include the keyword 'static' in the header befor the method name.
- Static methods cannot access or change the values of instance variables.
- Static methods do not have a 'this' reference and are unable to use the class's instance variables or call non-static methods.
- Static variables can be designated as either public or private and are designeated with the static keyword befor the variable type.
## 5.8 - Scope and Access
- Local variables can be declared in the body of constructors and methods. These variables may only be used within the constructor or method and cannot be declared to be 'public' or 'private'.
- When there is a local variable with the same name as an instance variable, the variable name will refer to the local variable instead of the instanc variable
## 5.9 - `this` Keyword
- Within a non-static method or a constructor, the keyword this is a reference ot the current object - the object whose method or constructor  is being called.
## 5.10 - Ethical and Social Implications of Computing Systems
- The creation of programs has impacts on society, economies, and culture. These impacts can be beneficial and/or harmful.