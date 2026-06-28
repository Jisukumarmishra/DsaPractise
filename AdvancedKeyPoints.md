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
while(l < r ) [
  swap(nums[l], nums[r]);
  l++;
  r--;
]