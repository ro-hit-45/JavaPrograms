//WRITE A JAVA PROGRAM TO PRINT  STAR;  
class Stars {
    public static void main(String[] args) {
        int row, column;
        for (row = 1; row <= 10; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}