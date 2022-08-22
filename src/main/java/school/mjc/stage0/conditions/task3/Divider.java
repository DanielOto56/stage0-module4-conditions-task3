package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        int result1 = number % 5;
        int result2 = number % 11;

        if (number == 0) {
            System.out.println("cannot divide by zero");
        } else if (result1 == 0 && result2 == 0) {
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
    }


//    public static void main(String[] args) {
//        Divider divider = new Divider();
//        divider.isDividableBy5And11(55);
//    }
}



