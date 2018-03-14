package task3;

public class BankApplication {
    public double resultSum = 25;
    public double percent = 0.2;
    public int countYear;
    public double startSum = 10;

    public int countYearsWithWhile() {
        while (startSum <= resultSum) {
            startSum += startSum * percent;
            countYear++;
        }
        return countYear;
    }

    public int countYearsWithDoWhile() {
        // at least one time it always does it's loop;
        do {
            startSum += startSum * percent;
            countYear++;
        } while (startSum <= resultSum);
        return countYear;
    }

    public int countYearsWithFor() {
        for (int i = 0; startSum <= resultSum; i++) {
            startSum += startSum * percent;
            countYear++;
        }
        return countYear;
    }

    public int countYearsWithBreak() {
        while (true) {
            startSum += startSum * percent;
            countYear++;
            if (startSum >= resultSum) {
                break;
            }
        }
        return countYear;
    }

    public int countYearsWithBreakWithLabel() {
        outer:
        {
            while (true) {
                startSum += startSum * percent;
                countYear++;
                if (startSum >= resultSum) {
                    break outer;
                }
            }
        }
        return countYear;
    }

    public void countYearsWithReturn() {
        while (true) {
            startSum += startSum * percent;
            countYear++;
            if (startSum >= resultSum) {
                return;
            }
        }
    }

    public void countYearsWithSystemExit() { //это не по документации, но по завершении программы в консоли в строке exit code будет количество лет.
        while (true) {
            startSum += startSum * percent;
            countYear++;
            if (startSum >= resultSum) {
                System.exit(countYear);
            }
        }
    }

    public void countYearsWithRecursion(){
        startSum += startSum* percent;
        countYear++;
        if(startSum < resultSum){
            countYearsWithRecursion();
        }else return;
    }


    public static void main(String[] args) {
        BankApplication app = new BankApplication(); //запускать методы по одному, для проверки. Если все запускать одновременно, будут некорректные цифры.
 //       System.out.println(app.countYearsWithWhile());
  //     System.out.println(app.countYearsWithDoWhile());
//        System.out.println(app.countYearsWithFor());
//        System.out.println(app.countYearsWithBreak());
//        System.out.println(app.countYearsWithBreakWithLabel());
//        app.countYearsWithReturn();
//        System.out.println(app.countYear);
  //      app.countYearsWithRecursion();
 //       System.out.println(app.countYear);
//        app.countYearsWithSystemExit();

    }
}
