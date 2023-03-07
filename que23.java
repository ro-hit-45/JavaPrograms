public class que23 {
    public static void main(String[] args) {
        String string = "Anurag";
        boolean x = true;

        string = string.toLowerCase();

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                x = false;
                break;
            }
        }
        if (x)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}