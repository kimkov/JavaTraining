package trainingTasks;

class Box12 {
	private double width;
	private double height;
	private double depth;
	
	Box12(Box12 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box12(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	Box12() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box12(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}
}
	
class BoxWeight extends Box12 {
	double weight;
		
	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}
	
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}
	
	BoxWeight() {
		super();
		weight = -1;
	}
	
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

public class ADemoSuper {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight();
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Объем mybox1 равен - " + vol);
		System.out.println("Вес mybox1 равен - " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Объем mybox2 равен - " + vol);
		System.out.println("Вес mybox2 равен - " + mybox2.volume());
		System.out.println();
		
		vol = mybox3.volume();
		System.out.println("Объем mybox3 равен - " + vol);
		System.out.println("Вес mybox2 равен - " + mybox3.volume());
		System.out.println();
		
		vol = myclone.volume();
		System.out.println("Объем myclone равен - " + vol);
		System.out.println("Вес myclone равен - " + myclone.volume());
		System.out.println();
		
		vol= mycube.volume();
		System.out.println("Объем mycube равен - " + vol);
		System.out.println("Вес mycube равен - " + mycube.volume());
		System.out.println();
	}
}
