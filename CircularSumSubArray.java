## Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

// Approach:
// This code is designed to find the maximum sum of a subarray, considering both circular and non-circular subarrays within the given array 'nums'. It follows these main steps:

// Calculate the maximum subarray sum using Kadane's algorithm for the non-circular subarray. This algorithm efficiently computes the maximum sum of a subarray within a linear scan.

// Calculate the total sum of all elements in the 'nums' array while negating each element. This step prepares the array for finding the minimum subarray sum within a circular subarray.

// Calculate the maximum subarray sum for the circular subarray. This is done by adding the total sum (which is now negative) to the maximum subarray sum using Kadane's algorithm applied to the negated 'nums' array. The idea here is to find the minimum subarray sum within the circular subarray, which is equivalent to finding the maximum subarray sum in the negated array.

// Compare the results of the maximum non-circular subarray sum and the maximum circular subarray sum. If the circular subarray sum is zero (indicating that all elements in 'nums' are negative), then the non-circular subarray sum is returned. Otherwise, the maximum between the circular and non-circular sums is returned as the final result.

// This approach works because it considers both circular and non-circular subarrays and efficiently finds their maximum sums. The final result is the maximum possible subarray sum within the given array 'nums,' considering the circular nature of the problem.

  class CircularSumSubArray{

  public int circularArray(int[] nums){

    int nonCircular = kadanesAlgo(nums);

    int tot = 0;

    for(int i=0; i<nums.length; i++){

      tot += nums[i];
      nums[i] = -nums[i];
    }

    int circular = tot + kadanesAlgo(nums);

    if(circular == 0)return nonCircular;

    return Math.max(nonCircular, circular);
    
  }

  public int kadanesAlgo(int[] nums){

   int curr = nums[0];
    int max = nums[0];

    for(int i=1; i<nums.length; i++){

      if(curr <= 0){

        curr = nums[i];
      } else {

        curr += nums[i];
        
      }
      max = Math.max(max, curr);
    }
    return max;
  }

  
  }
