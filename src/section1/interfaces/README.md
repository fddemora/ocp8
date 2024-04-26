<h2 align=center>Interface Guide</h2>



<h4>Interface Method Rules:</h4> 

- Interface methods are implicitly public abstract. 
- Interface methods are not implicitly abstract when using default or static. 
- Interface methods cannot be marked final, strictfb, or native.
- Default methods are declared by using the default keyword. The default keyword can be used only with interface method signatures, not class method signatures.
- Default methods are public by definition, and the public modifier is optional.
- Default methods cannot be marked as private, protected, static, final, or abstract.
- Default methods must have a concrete method body.
- Static interface methods are declared by using the static keyword.
- Static interface methods are public, by default, and the public modifier is optional.
- Static interface methods cannot be marked as private, protected, final, or abstract.
- Static interface methods must have a concrete method body.
- When invoking a static interface body, the method's type (interface name) MUST be included in the invocation.  

<h4>Interface Variable Rules:</h4>

- All variables must be public static and final.
- All variables are implicitly public static final if not declared as. 

<h4>Object-Orient</h4>

- An interface can extend one or more other interfaces.
- An interface can't extend anything but another interface.
- An interface can't implement another interface or class.

<h4>Other Rules</h4>

- An interface must be declared with the keyword interface.
- There is only one public interface per file.
- Interfaces are implicitly default abstract
- Interface types can be used polymorphically

  
