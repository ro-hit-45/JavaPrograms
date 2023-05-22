/*METHOD OVERLOADING */
public class Question74 {
    void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }

    void add(int x, double y) {
        double c;
        c = x + y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Question74 r = new Question74();
        r.add();
        r.add(100, 200);
        r.add(50, 40.56);
    }
}
