package trainingTasks;

//Демонстрация использования ссылки на статический метод. 
//Функциональный интерфейс для операций над строками.
interface StringFunc4 {
	String func4(String n);
}

//В этом классе определен статический метод по имени strReverse(). 
class MyStringOps {
	// Статический метод, который изменяет порядок следования символов на противоположный.
	static String strReverse(String str) {
		String result = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}

public class AMethodRefDemo {
	// Первый параметр этого метода имеет тип функционального интерфейса. 
	// Таким образом, ему можно передать любой экземпляр реализации 
	// интерфейса StringFunc, включая ссылку на метод. 
	
	static String stringOp(StringFunc4 sf, String s) {
		return sf.func4(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to java";
		String outStr = "";
		// Передать в stringOp() ссылку на статический метод strReverse().
		outStr = stringOp(MyStringOps::strReverse, inStr);
		System.out.println("Initial string: " + inStr);
		System.out.println("Reversed string: " + outStr);
	}
}
