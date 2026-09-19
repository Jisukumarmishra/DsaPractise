# Authentications

Means Who Are You ??

eg:-- login, username , password

# Authorization

What are you allowed to do?

eg:--
Admin → delete users
Normal user → cannot delete users

# Authentication = Identity

# Authorization = Permission

# Method Overloading :--->

Same method name, different parameter list.

add(int a, int b)
add(int a, int b, int c)

Compile-time polymorphism commonly associated with overloading.

# Overriding

Child class parent ke method ka implementation redefine karti hai.

class Animal {
void sound() {
System.out.println("Animal sound");
}
}

class Dog extends Animal {
@Override
void sound() {
System.out.println("Bark");
}
}

Runtime polymorphism is associated with overriding

# Interface

Contract/capability define karne ke liye.

interface Payment {
void pay();
}

# Abstract class

Common state + behavior provide kar sakti hai, along with abstract methods.

abstract class Animal {
abstract void sound();

    void eat() {
        System.out.println("Eating");
    }

}

# Concurrency → dealing with multiple tasks

# Parallelism → doing multiple tasks simultaneously

# Pass by Value

When calling a function, you give it a copy of the value.

void change(int x) {
x = 100;
}

int a = 10;

change(a);

System.out.println(a);

o/p:--- 10

# Pass by Reference

In pass-by-reference, the function receives a reference/alias to the original variable.

So both the caller and function refer to the same variable.

Java is strictly pass-by-value. For objects, the value being passed is a copy of the object's reference. Therefore, a method can modify the object's state through that copied reference, but it cannot change the caller's reference itself.

# static

static means the member belongs to the class rather than to individual objects.

Use static when the data/behavior logically belongs to the class itself, rather than to a particular object.

Java needs a way to invoke main() without first creating an object of your class.
Therefore main() is static.

Static Method Cannot Directly Access Non-Static Members
class Student {

    int age = 20;

    static void show() {
        System.out.println(age); // ERROR
    }

}

static int count = 10; // both is valid
count = 20;

// If you want a value that cannot be reassigned:
static final int MAX = 100;

static → belongs to class
final → cannot be reassigned
