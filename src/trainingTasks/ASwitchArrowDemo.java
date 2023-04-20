package trainingTasks;

public class ASwitchArrowDemo {
	public static void main(String[] args) {
		boolean stopNow;
		int eventCode = 9300;
		
/* Использовать блоки в операторах case со стрелками. Снова обратите внимание, 
 * что для предотвращения сквозного выполнения оператор break не нужен (да и не разрешен).
 * Поскольку целью -> является блок, для предоставления значения должен применяться 
 * оператор yield.*/
		
		int priorityLevel = switch(eventCode) {
			case 1000, 1205, 8900 -> {
				stopNow = false;
				System.out.println("Alarm");
				yield 1;
			}
			
			case 2000, 6010, 9128 -> {
				stopNow = false;
				System.out.println("Awarning");
				yield 2;
			}
			
			case 1002, 7023, 9300 -> {
				stopNow = true;
				System.out.println("Danger");
				yield 3;
			}
			
			default -> {
				stopNow = false;
				System.out.println("OK!");
				yield 0;
			}
		};
		System.out.println("Priority level for event " + eventCode + " is " + priorityLevel);
		if(stopNow) {
			System.out.println("Stop is required");
		}
	}
}
