package trainingTasks;

abstract class AreaFigure {
	double dim1;
	double dim2;
	AreaFigure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	// метод area объявляется абстрактным
	abstract double area();
}

class AreaRectangle extends AreaFigure {
	AreaRectangle(double a, double b) {
		super(a, b);
	}
	double area() {
		System.out.println("В области четырехугольника");
		return dim1 * dim2;
	}
}

class AreaTriangle extends AreaFigure {
	AreaTriangle(double a, double b) {
		super(a, b);
	}
	
	// Переопределить метод area для треугольника
	
	double area() {
		System.out.println("В области треугольника");
		return dim1 * dim2 / 2;
	}
}

public class AAbstarctAreas {
	public static void main(String[] args) {
		
		// Figure f = new Figure (1O, 10); -  теперь недопустимо
		AreaRectangle r = new AreaRectangle(9, 5);
		AreaTriangle t = new AreaTriangle(10, 8);
		
		AreaFigure figref; // верно, но объект не создается
		
		figref = r;
		System.out.println("Площадь равна " + figref.area());
		
		figref = t;
		System.out.println("Площадь равна " + figref.area());
	}
}
