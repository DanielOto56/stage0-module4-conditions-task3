package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary <= 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            System.out.println(salary * 0.85F);
        } else if (salary <= 20000) {
            System.out.println(salary * 0.82F);
        } else  {
            System.out.println(salary * 0.80F);
        }
    }

//    public static void main(String[] args) {
//        SalaryCalculator salaryCalculator = new SalaryCalculator();
//        salaryCalculator.calculateSalary(5000);
//        System.out.println(salaryCalculator);
//    }
}