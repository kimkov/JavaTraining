package javaLangTR;

public class BinarySearchRecurMain {
	public static void main(String[] args) {
		BinarySearchRecur bsr = new BinarySearchRecur();
		
		bsr.rInsert(2);
		bsr.rInsert(1);
		bsr.rInsert(3);
		
		System.out.println("/nRoot: " + bsr.root.value);
		System.out.println("/nRoot -> left: " + bsr.root.left.value);
		System.out.println("/nRoot -> right: " + bsr.root.right.value);
		
		System.out.println();
		
		bsr.deleteNode(2);
		System.out.println("/nRoot: " + bsr.root.value);
		System.out.println("/nRoot -> Left: " + bsr.root.left.value);
		System.out.println("/nRoot -> Right: " + bsr.root.right);
	}
}
