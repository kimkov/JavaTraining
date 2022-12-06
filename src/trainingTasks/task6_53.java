package trainingTasks;

class CNum {
    int x, n, r;
    boolean r1;

    CNum(int x) {
        this.x = x;
    }

    boolean GetCNum() {
    	r1 = false;
    	while (x / 10 != 0) {
    		n = x % 10;
    		x /= 10;
            r = x % 10;
            if (n >= r) {
                r1 = false;
                break;
            } else {
                r1 = true;
            }
        }
    	return r1;
    }
}

public class task6_53 {
    public static void main(String[] args) {
        int x = 654321;

        CNum cn = new CNum(x);
        System.out.println(cn.GetCNum() ? "OK" : "NOT OK");
    }
}
