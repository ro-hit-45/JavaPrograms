public class Question73 {
    void draw() {
        System.out.println("Ask me a question");
    }

}

class Answer extends Question73 {
    @Override
    void draw() {
        System.out.println("Give me answer..");
    }
}

class Demo {
    public static void main(String[] args) {
        Question73 r = new Answer();
        r.draw();

    }
}
