// learn sorting,Bit Manipulation 

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // --------------        // [TimeComplexity]/[SpaceComplexity] --------------------
// BruteForce___[O(n^2)]/O(1)_____
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         System.out.println(nums[i]+"h"+nums[j]);
        //         if(nums[i]==nums[j]){
        //            return true;
        //         }
        //     }
        // }
        // return false;



// Sorting___[O(n logn)]/[O(1)____
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

// Set____[O(n)]/[O(n)]______
//  i===>
        // Set<Integer> numbers = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     numbers.add(nums[i]);
        // }
        // return numbers.size()<nums.length?true:false;
//  ii===>
        // Set<Integer> numbers = new HashSet<>();
        // for(int num:nums){true if !set.add(num)} return false or
        // for(int i=0;i<nums.length;i++){
        //     if(!numbers.add(nums[i])){
        //         return true;
        //     }
        // }
        // return false;
//  iii===>      
//         Set<Integer> numbers = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//           if (numbers.contains(nums[i])) {
//                 return true;
//             }
//             numbers.add(nums[i]);
//         }
//         return false;
//     }
        

// HashMap___[O(n)]/[O(n)]____
        // HashMap<Integer,Integer> numbers = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //      if(numbers.containsKey(nums[i])){
        //         return true;
        //      }
        //     numbers.put(nums[i],i);
        // }
        // return false;



        return false;
    }
}
