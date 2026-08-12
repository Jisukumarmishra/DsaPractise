# for → jab tumhe pata ho ki kitni baar loop chalana hai.

for(int i = 0; i < n; i++) {
// n times
}

# while → jab tumhe nahi pata ki kitni baar loop chalega, bas ek condition tak kaam karna hai.

while(freq[i] > k) {
freq[i] = freq[i] / 2;
}

"Mujhe pata hai kitni baar?" → for
"Mujhe pata nahi, condition false hone tak karna hai?" → while

for(int i = 0; i < n; i++) { // array ke elements → pata hai n times

    while(freq[i] > k) {           // division → kitni baar? pata nahi
        freq[i] /= 2;
    }

}

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

# Array me number se uska value acceess karna

int arr [] = {1, 2, 3, 4, 5}
int index = -1;

for (int i = 0; i < arr.length; i++) {
if (arr[i] == 5) {
index = i;
break;
}
}

# continue = "Is baar chhod, agle par ja."

# break = "Bas, loop khatam."

for (int i = 1; i <= 5; i++) {
if (i == 3) {
continue;
}
System.out.println(i);
}

// op:-
1
2
4
5

//for (int i = 1; i <= 5; i++) {
if (i == 3) {
break;
}
System.out.println(i);
}

//op:-
1
2

# from given string to calculate the freq array of each charc

int [] freq = new int [26];

for( char ch : s.toCharArray()) {
freq[ch-'a'] ++ ;
}

# Fastet and Optimal Way To Calculate The freq Array

HashMap<Integer, Integer> freq = new HashMap<>();

freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

# second Way

int freq[] = new int[n];
for(int i =0; i<n ; i++) {
freq[nums[i]]++;
}
