package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {

        int result = first % second;
        if (result == 0) {
            System.out.println("Not aliquot"); }
            else {
                System.out.println("Aliquot");
            }
        }


        //pogooglic modulus



//    public static void main(String[] args) {
//        AliquotNumbers aliquotNumbers = new AliquotNumbers();
//        aliquotNumbers.isFirstAliquot(5, 15);
//    }
    }

