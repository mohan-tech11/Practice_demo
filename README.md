Naming Convention(Camel casing)
ShowMyMarks() -- Camel Casing

class and interface and constuctors -- Start with Capital letters (Demo, Student, Super, Human() etc)
variables and methods -- all should be in small letters(name, age , marks etc)


constants -- All capital (PIE, BRAND, DATA etc)


new student(); //anonymous object(used only once), no reference variable

Method overriding -- multiple method with same name and same parameter in a different classes.
Method overloading -- multiple methods with same name but having a different parameter in a Same class.
Pakages -- whichever inbuild class you use in java is belongs to a packages(eg, java.util.ArrayList, java.io etc)

Every java file by default import java.lang.*; package(System class also belongs to the java.lang package, eg. System.out.println);

" * " in java package means import all the files in the file, like import java.util.*;
but in not import all the folders like import java.*; (Wrong way)


Access modifier -- 
1. public -- it can be access from anywhere in the project like in different packages also.
2. private -- it can only be acceesed in the the same class  inrespective of the package.
3. Defualt -- it can be access in the same package.(in same class, outside class but in same package)
4. Protected -- it can be access in the same package not out side the package(you can access outside the package also by create the subclass of the protected class outside the package)