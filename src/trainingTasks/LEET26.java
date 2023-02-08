package trainingTasks;

class S26 {
	private int[] numsa;
	
	S26(int[] numsa) {
		this.numsa = numsa;
	}
	
	public void setNums(int[] numsa) {
		this.numsa = numsa;
	}
	
	public int[] getNums() {
		return numsa;
	}
	
    public int removeDuplicates(int[] numsa) {
        int insertIndex = 1;
        for(int i = 1; i < numsa.length; i++){
            // We skip to next index if we see a duplicate element
            if(numsa[i - 1] != numsa[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                numsa[insertIndex] = numsa[i];     
                insertIndex++;
            }
        }
        return insertIndex;
    }
}

public class LEET26 {
	public static void main(String[] args) {
		int[] numsa = new int[] {0,0,1,1,1,2,2,3,3,4};
		
		S26 sl = new S26(numsa);
		
		System.out.println(sl.removeDuplicates(numsa));
	}
}
