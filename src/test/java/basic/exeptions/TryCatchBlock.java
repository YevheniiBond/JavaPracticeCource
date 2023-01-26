package basic.exeptions;

public class TryCatchBlock {
    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("U nas ye masuv");
        try {
            System.out.println(array[5]);
            System.out.println("Vsim garnogo dnia!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Piyimalu exeption:   " + e);
        }
    }
}
