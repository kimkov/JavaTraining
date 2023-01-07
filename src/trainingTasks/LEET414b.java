//package trainingTasks;
//
//class S414b {
//	private int[] nums;
//	
//	S414b(int[] nums) {
//		this.nums = nums;
//	}
//	
//	int thirdMax3Pointers() {
//        PairNums<Integer, Boolean> firstMax = new PairNums<Integer, Boolean>(-1, false);
//        PairNums<Integer, Boolean> secondMax = new PairNums<Integer, Boolean>(-1, false);
//        PairNums<Integer, Boolean> thirdMax = new PairNums<Integer, Boolean>(-1, false);
//        
//        for (int num : nums) {
//            // If current number is already stored, skip it.
//            if ((firstMax.getValue() && firstMax.getKey() == num) || 
//                (secondMax.getValue() && secondMax.getKey() == num) || 
//                (thirdMax.getValue() && thirdMax.getKey() == num)) {
//                continue;
//            }
//            
//            // If we never stored any variable in firstMax
//            // or curr num is bigger than firstMax, then curr num is the biggest number.
//            if (!firstMax.getValue() || firstMax.getKey() <= num) {
//                thirdMax = secondMax;
//                secondMax = firstMax;
//                firstMax = new PairNums<Integer, Boolean>(num, true);
//            }
//            // If we never stored any variable in secondMax
//            // or curr num is bigger than secondMax, then curr num is 2nd biggest number.
//            else if (!secondMax.getValue() || secondMax.getKey() <= num) {
//                thirdMax = secondMax;
//                secondMax = new PairNums<Integer, Boolean>(num, true);
//            }
//            // If we never stored any variable in thirdMax
//            // or curr num is bigger than thirdMax, then curr num is 3rd biggest number.
//            else if (!thirdMax.getValue() || thirdMax.getKey() <= num) {
//                thirdMax = new PairNums<Integer, Boolean>(num, true);
//            }
//        }
//        
//        // If third max was never updated, it means we don't have 3 distinct numbers.
//        if (!thirdMax.getValue()) {
//            return firstMax.getKey();
//        }
//        
//        return thirdMax.getKey();
//	}
//}
//
//public class LEET414b {
//	public static void main(String[] args) {
//		int[] nums = new int[] {3, 2, 1};
//	}
//}
