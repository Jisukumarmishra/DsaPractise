# str.indexOf():=kisi character ya string ki position find karta hai
ArrayList<String> list  = new ArrayList<>(); // list = ["ab", "abc", ------ ]

// calcualte all substring og the given string s
s = "abcde"

a
ab
abc
abcd
abcde

b
bc
bcd
bcde

c
cd
cde

d
de

e


 for (int i =0; i<n; i++) {
    for(int j =i+1; j<=n; j++) {
        list.add(s.substring(i, j));
    }
}

for(String str : list) {
    if(str.indexOf("a") != -1 && str.indexOf("b") != -1 && str.indexOf("c") !=-1) {
        count++;
    }
}



lastIndexOf() := Find Last Occurence
str.toLowerCase()
str.toUpparCase()
str.toCharArray(); //Converts string → char array.

map.getOrDefault(key, defaultValue) // for generaly using the occurence of the elemnt in array
//If key exists → return its value
//If key doesn't exist → return defaultValue

HashMap<Integer,Integer> map = new HashMap<>();
System.out.println(
    map.getOrDefault(2, 0)
);
// op:= 0 because 2 doen not exist






String s = "abcdef"; // extract part of string
System.out.println(s.substring(1,4));
ans:= bcd


trim()
Removes spaces from start/end.

.isLowerCase()
.isUpperCase()


str.valueOf() // Converts other datatype → String.



compareTo()
Lexicographical comparison.


Character.isDigit(ch)

Character.isLetter(ch)
