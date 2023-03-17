public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);

        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
