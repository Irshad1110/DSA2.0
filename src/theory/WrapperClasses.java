package theory;

public class WrapperClasses {

    /*
    * Autoboxing - for example - Integer is a class and if we do
    * Integer i = 10; it should not work as we are directly assigning value to it;
    * It should have been Integer i = new Integer(10);, as i is reference only and will
    * contain address of the object instead of direct value, but in java this is allowed
    * and java directly converts the value 10 into an object. this is called autoboxing.
    *
    * Unboxing - now we can do this also, int x = i;
    * it should not be possible as i is a reference, and we are assigning it to an int.
    * But in java , java converts the object directly to its value and assigns it to x. this is called unboxing.
    *
    * Wrapper classes are immutable in java
    * Integer x = 10;
        Integer y = x;   // y points to the same object as x
        x = x + 5;       // creates a new Integer(15) object

        System.out.println(x); // 15
        System.out.println(y); // 10
        *
        * All wrapper classes in Java are immutable because they were designed for thread safety, caching
        * efficiency, and reliable, consistent behavior when used as object equivalents of primitives.
    * */
}
