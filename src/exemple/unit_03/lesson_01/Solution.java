package exemple.unit_03.lesson_01;

/**
 * Created by Vitalii on 15.02.2017.
 *
 * You must add a sing method to the Bird class, then modify the main method accordingly
 * so that the code prints the following lines:
 I am walking
 I am flying
 I am singing
 I am Bird
 */
public class Solution {
    public static void main(String[] args) {
        String[] words = {"walking", "flying", "singing", "Bird"};
        Bird bird = new Bird();
        for (String s : words) {
            bird.sing(s);
        }
    }
}
