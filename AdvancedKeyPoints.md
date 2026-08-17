# To Reverse An Array

int left = 0;
int right = nums.length - 1;

while (left < right) {
int temp = nums[left];
nums[left] = nums[right];
nums[right] = temp;

    left++;
    right--;

}

// or
int l = 0;
int r = n-1;
while(l < r ) {
swap(nums[l], nums[r]);
l++;
r--;
}

// For Loop Reverse Of anray

for(int l =0, r = n-1; l<r; l++,r--) {
int temp = nums[l];
nums[l] = nums[r];
nums[r] = temp;
return ;
}

# To Access All SubString

// subarray bhi same hi hota hai substring ki tarahe dono me sequence matter karti hai

for(int i = 0; i < m; i++) {
for(int j = i + 1; j <= m; j++) {
list.add(word.substring(i, j));
}
}

# To Access All THe SubArray

for(int i=0; i<n; i++){
for(int j =i; j<m; j++) {
for(int k =i; k<=j; k++) {

    }

}
}

# How To Decide The Dp State

stone game -5

6. DP state decide karne ka golden rule

Apne aap se 3 questions pucho:

Question 1

Current situation kya hai?

For this problem:

Kaunsa portion abhi available hai?

Answer:

l and r

Therefore:

dp[l][r]
Question 2

Future decisions kis information par depend karte hain?

Yahan future decisions depend karte hain:

remaining stones

Aur remaining stones contiguous hain:

[l ... r]

Isliye l aur r enough hain.

Question 3

Kya mujhe aur information chahiye?

For example, kya mujhe Alice ka current score state mein store karna padega?

No.

Kyun?

Because:

dp[l][r]

already tells us:

Is remaining range se maximum additional score kitna kama sakte hain.

Current accumulated score ko state mein rakhne ki zarurat nahi.

# Dp State

Now the DP state rule you should remember

When solving any DP problem, don't start by thinking 1D DP, 2D DP, 3D DP.

First ask:

"If I pause the game/process at some point, what information completely describes the remaining problem?"

For this problem:

Remaining problem = stones from l to r

Therefore:

state = (l,r)

Hence:

dp[l][r]
A general state checklist

# For any DP problem:

1. What is changing?
   ↓
2. What decisions have already been made?
   ↓
3. What information affects future decisions?
   ↓
4. Store ONLY that information in state.
   ↓
5. Define dp[state] in one exact sentence.
   ↓
6. Find choices/transitions.
   ↓
7. Find base case.
