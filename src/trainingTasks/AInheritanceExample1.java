package trainingTasks;

class Box11 {
	private double width;
	private double height;
	private double depth;
	
	Box11(Box11 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box11(double w, double h, double d) {
		width = w;
		height = h;
		 depth = d;
	}
	
	Box11() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box11(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}
}

class BoxWeight11 extends Box11 {
	double weight;
	
	BoxWeight11(BoxWeight11 ob) {
		super(ob);
		weight = ob.weight;
	}
	
	BoxWeight11(double w, double h, double d, double m) {
		super(w,h,d);
		weight = m;
	}
	
	BoxWeight11() {
		super();
		weight = -1;
	}
	
	BoxWeight11(double len, double m) {
		super(len);
		weight = m;
	}
}

public class AInheritanceExample1 {
	public static void main(String[] args) {
		BoxWeight11 box1 = new BoxWeight11(10, 20, 15, 34.3);
		BoxWeight11 box2 = new BoxWeight11(2, 3, 4, 0.076);
		BoxWeight11 box3 = new BoxWeight11();
		BoxWeight11 boxCube = new BoxWeight11(3, 2);
		BoxWeight11 boxClone = new BoxWeight11(box1);
		
		double vol;
		
		vol = box1.volume();
		System.out.println("Volume of the box 1 is: " + vol);
		System.out.println("Weight of the box 1 is: " + box1.weight);
		System.out.println();
		
		vol = box2.volume();
		System.out.println("Volume of the box 2 is: " + vol);
		System.out.println("Weight os the box 2 is: " + box2.weight);
		System.out.println();
		
		vol = box3.volume();
		System.out.println("Volume of the box 3 is: " + vol);
		System.out.println("Weight of the box 3 is: " + box3.weight);
		System.out.println();
		
		vol = boxClone.volume();
		System.out.println("Volume of the box clone is: " + vol);
		System.out.println("Weight of the box clone is: " + boxClone.weight);
		System.out.println();
		
		vol = boxCube.volume();
		System.out.println("Volume of the box cube is: " + vol);
		System.out.println("Weight of the box cube is: " + boxCube.weight);
	}
}
