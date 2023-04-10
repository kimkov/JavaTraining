package trainingTasks;
// Отображение всех аннотаций

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}

@What(description = "Annotation of class")
@MyAnno1(str = "Meta2", val = 99)

public class AAnotationAll {
	@What(description = "Annotation of method")
	@MyAnno1(str = "Testing", val = 100)
	
	public static void myMeth() {
		AAnotationAll ob = new AAnotationAll();
		
		try {
			Annotation[] annos = ob.getClass().getAnnotations();
			
			// Отобразить все аннотации для Meta2
			System.out.println("All annotations for class Meta2");
			for(Annotation a : annos) {
				System.out.println(a);
				}
			System.out.println();
			
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			System.out.println("All annotations for method myMeth: ");
			for(Annotation a : annos) {
				System.out.println(a);
				} 
			} catch(NoSuchMethodException exc) {
				System.out.println("Method not found");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
