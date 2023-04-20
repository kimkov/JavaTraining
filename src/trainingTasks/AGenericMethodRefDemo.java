package trainingTasks;

/*Демонстрация использования ссылки на обобщенный метод, объявленный внутри необобщенного класса. 
 * Функциональный интерфейс, который работает с массивом и значением и возвращает результат int.*/
interface MyFunc1<T> {
	int func1(T[] vals, T v);
}

/*В этом классе определен метод по имени countMatching(), который возвращает количество элементов 
 * в массиве, равных указанному значению. Обратите внимание, что метод countMatching() 
 * является обобщенным, но класс MyArrayOps - нет.*/

class myArrayOps {
	static<T> int countMatching(T[] vals, T v) {
		int count = 0;
		for(int i = 0; i < vals.length; i++) {
			if(vals[i] == v) {
				count++;
			}
		}
		return count;
	}
}

public class AGenericMethodRefDemo {

/* Первый параметр этого метода имеет тип функционального интерфейса MyFunc. 
 * В остальных двух параметрах он принимает массив и значение, оба типа Т.*/
	static <T> int myOp(MyFunc1<T> f, T[] vals, T v) {
		return f.func1(vals, v);
	}
	
	public static void main(String[] args) {
		Integer[] vals = {1,2,3,4,2,3,4,4,5};
		String[] strs = {"one", "two", "three", "two"};
		int count;
		
		count = myOp(myArrayOps::<Integer>countMatching, vals, 4);
		System.out.println("Amount of '4' in vals is: " + count);
		
		count = myOp(myArrayOps::<String>countMatching, strs, "two");
		System.out.println("Amount of 'two' in strs is: " + count);
		
	}
}
