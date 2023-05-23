public class Question75 {
    public static void main(String[] args) {
        int[] num = { 3, 4, 8, 5, 9 };
        int toFind = 9;
        boolean present = false;
        for (int n : num) {
            if (n == toFind) {
                present = true;
                break;

            }
        }
        if (present) {
            System.out.println(toFind + "is present");

        } else {
            System.out.println(toFind + "is not present");
        }
    }
}