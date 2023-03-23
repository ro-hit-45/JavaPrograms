class Main {
    public static void main(String[] args) {

        // create first string
        String first = "i";
        System.out.println("First String: " + first);

        // create second
        String second = "am";
        System.out.println("Second String: " + second);
        // create third
        String third = "Coder";
        System.out.println("Third String:" + third);
        // join three strings
        String joinedString = first.concat(second);
        String joinedString2 = second.concat(third);
        System.out.println("Joined String: " + joinedString2);
    }
}