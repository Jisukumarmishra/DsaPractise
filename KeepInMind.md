str = str.substring(0, str.length() - 1); // for the removin the last elment form the strig

Java jab String ke saath + dekhti hai to doosri value ko String me convert kar deti hai.
eg:=
str += s.charAt(i);

String str = "abc";
char ch = 'd';

str += ch;
str = "abc" + 'd';
//op:== "abcd"