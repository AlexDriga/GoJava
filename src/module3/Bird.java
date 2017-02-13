package src.module3;

/**
 Добавить метод sing к классу Bird, потом измените основной метод соответственно, чтобы код вывел следующий текст:
 I am walking
 I am flying
 I am singing
 I am Bird
 */
public class Bird {

    public static void main(String[] args) {
        String text;
        text = "I am walking" + "\nI am flying" + "\nI am singing" + "\nI am Bird";
        Bird bird = new Bird ();

        text = bird.sing(text);
        System.out.println(text);
    }

    private String sing(String text) {
        String song = text;
        return song;
    }
}