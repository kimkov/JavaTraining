package trainingTasks;

//Демонстрация использования ссылки на метод экземпляра. 
//Функциональный интерфейс для операций над строками.
interface StringFunc3 {
	String func(String n);
}

//Теперь в этом классе определен метод экземпляра по имени strReverse().
class MyStringOPs1 {
	String strReverse(String str) {
		String result = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}

public class AMethodRefDemo2 {
	// Первый параметр этого метода имеет тип функционального интерфейса. 
	// Таким образом, ему можно передавать любой экземпляр реализации 
	// интерфейса StringFunc, включая ссыпку на метод.
	static String stringOp(StringFunc3 sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] main) {
		String inStr = "Lambdas add power to java";
		String outStr;
		
		// Создать объект MyStringOps.
		MyStringOPs1 strOp = new MyStringOPs1();
		
		// Передать в stringOp() ссылку на метод экземпляра strReverse().
		outStr = stringOp(strOp::strReverse, inStr);
		
		System.out.println("Initial string: " + inStr);
		System.out.println("Reversed string: " + outStr);
	}
}
