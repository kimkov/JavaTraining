package trainingTasks;

class IndexAndValue {
    double sumR;
    int indBefore;
    double valueBefore;
    int indAfter;
    double valueAfter;
}

class GetSum {
    int i = 0;
    IndexAndValue d = new IndexAndValue();

    double GetSumR(double[] x, double n) {
        while (x[i] < n) {
            d.sumR += x[i];
            i++;
        }
        return d.sumR;
    }
}

class GetIndexBefore {
    int i = 0;
    IndexAndValue s = new IndexAndValue();

    int GetIndBefore(double[] x, double n) {
        while (x[i] <= n) {
            s.indBefore = i;
            i++;
        }
        return s.indBefore;
    }
}

class GetValueBefore {
    int i = 0;
    IndexAndValue r = new IndexAndValue();

    double GetValBefore(double[] x, double n) {
        while (x[i] <= n) {
            r.valueBefore = x[i];
            i++;
        }
        return r.valueBefore;
    }
}

class GetIndAfter {
    int i = 0;
    IndexAndValue a = new IndexAndValue();

    int GetIndexAfter(double[] x, double n) {
        while (!(x[i] > n)) {
            i++;
            a.indAfter = i;
        }
        return a.indAfter;
    }
}

class GetValAfter {
    int i = 0;
    IndexAndValue t = new IndexAndValue();
    double GetValueAfter(double[] x, double n) {
        while (!(x[i] > n)) {
            i++;
            t.valueAfter = x[i];
        }
        return t.valueAfter;
    }
}

public class task6_6 {

    public static void main(String[] args) {
        double[] x = new double[] {1.3, 3.7, 5.2, 5.4, 6.9, 8.3, 9.2, 10.8, 11.2, 12.5};
        double n = 4.7;

        GetSum result = new GetSum();
        GetIndexBefore resultIndexBefore = new GetIndexBefore();
        GetValueBefore resultValB = new GetValueBefore();
        GetIndAfter resultIndA = new GetIndAfter();
        GetValAfter resultValA = new GetValAfter();

        System.out.println("Sum of all numbers which smaller than n " + n + " is - " + result.GetSumR(x, n));
        System.out.println("Index of the number which locates before n " + n + " is - " + resultIndexBefore.GetIndBefore(x, n));
        System.out.println("Value of the number which locates before n " + n + " is - " + resultValB.GetValBefore(x, n));
        System.out.println("Index of the number which locates after n " + n + " is - " + resultIndA.GetIndexAfter(x, n));
        System.out.println("Value of the number which locates after n " + n + " is - " + resultValA.GetValueAfter(x, n));
    }
}
