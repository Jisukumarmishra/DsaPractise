str = str.substring(0, str.length() - 1); // for the removin the last elment form the strig

Java jab String ke saath + dekhti hai to doosri value ko String me convert kar deti hai.
eg:=
str += s.charAt(i);

String str = "abc";
char ch = 'd';

str += ch;
str = "abc" + 'd';
//op:== "abcd"

# DSA Trick

Jab bhi question me dekho:

Case 1
i < j

to likho

for(i=0...)
for(j=i+1...)

Case 2

i <= j

to likho

for(i=0...)
for(j=i...)

Case 3

i <= j <= k

to turant dimag me aana chahiye

for(i=0...)
for(j=i...)
for(k=j...)

Rule 1: Maximum (Largest) dhoondhna hai

Agar tum largest dhoondh rahe ho, to shuru mein value sabse chhoti possible honi chahiye.

int largest = Integer.MIN_VALUE; Or Tum int l = 0 bhi kar sakte hai when tum cnform ho ki array me sirf +ve num hai

Rule 2: Minimum (Smallest) dhoondhna hai

Agar tum smallest dhoondh rahe ho, to shuru mein value sabse badi possible honi chahiye.

int smallest = Integer.MAX_VALUE;
