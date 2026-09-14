# To Convert Given int x = 3 into LL Node

Node newNode = new Node(x);
// now its become Node x ;

# int → String

String.valueOf()  
Works for all primitive types, not just int.

Integer.toString()  
Specifically for integers, very clear in intent.

Concatenation  
num + "" → quick trick, but less readable.

String.format()  
Useful when formatting numbers into strings.

# String → int

Integer.parseInt()  
Most common method, returns primitive int.

Integer.valueOf()  
Returns Integer object (auto-unboxed to int).
