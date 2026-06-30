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