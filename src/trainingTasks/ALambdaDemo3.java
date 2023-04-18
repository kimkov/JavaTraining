package trainingTasks;

// использование лямбда-выражений в качестве аргумента метода
interface StringFunc1 {
	String func(String n);
}

public class ALambdaDemo3 {
	/* Типом первого параметра этого метода является функциональный интерфейс.
	 * Таким образом, ему можно передавать ссылку на любой экземпляр реализации
	 * данного интерфейса, в том числе экземпляр, созданный лямбда-выражением.
	 * Во втором параметре указывается строка, с которой нужно работать*/
	
	static String StringOp(StringFunc1 sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String OutStr;
		
		System.out.println("Initial string: " + inStr);
		
		// Простое одиночное лямбда-выражение, которое переводит 
		// в верхний регистр строку, переданную методу stringOp().
		OutStr = StringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("Initial string in upper-case: " + OutStr);
		
		// Передать блочное лямбда-выражение, которое удаляет пробелы.
		OutStr = StringOp((str) -> {
			String result = "";
			for(int i = 0; i <= str.length() - 1; i++) {
				if(str.charAt(i) != ' ') {
					result += str.charAt(i);
				}
			}
			return result;
		}, inStr);
		
		System.out.println("Initial string after deleting all backspaces: " + OutStr);
		
		// Конечно, можно также передавать экземпляр StringFunc, заблаговременно 
		// созданный лямбда-выражением. Например, после выполнения следующего 
		// объявления reverse будет ссылаться на экземпляр StringFunc.
		
		StringFunc1 reverse = (str) -> {
			String result = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		// Теперь reverse можно передать в первом параметре методу stringOp(), 
		// поскольку этот параметр является ссылкой на объект StringFunc.
		System.out.println("Initial string in reverse order: " + StringOp(reverse, inStr));
	}
}
