package trainingTasks;

import java.lang.annotation.*;
import java.lang.reflect.*;

// объявление аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}

public class AAnnotation {
		// Аннотировать метод
		@MyAnno(str = "Annotation Example", val = 100)
		public static void myMeth() {
			AAnnotation ob = new AAnnotation();
			
			// Получить аннотацию для этого метода и отобразить значени ее членов
			try {
				// сначала получить объект Class, который представляет данный класс
				Class<?> c = ob.getClass();
				
				// теперь получить объект Method, который представляет данный метод
				Method m = c.getMethod("myMeth");
				
				// Далее получить аннотацию для этого класса
				MyAnno anno = m.getAnnotation(MyAnno.class);
				
				// В заключении вывести значения
				System.out.println(anno.str() + " " + anno.val());
			} catch(NoSuchMethodException exc) {
				System.out.println("Method not found");
			}
		}
		
	public static void main(String[] args) {
		myMeth();
	}
}
