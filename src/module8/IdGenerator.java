package module8;

/**
 * Создайте класс-утилиту IdGenerator,
 * который будет генерировать и возвращать уникальный идентификатор (реализацию продумайте самостоятельно).
 */
public final class IdGenerator {
    private static long id = 1000;

    private IdGenerator() {
    }

    public static long generetedId (){
        long foodId = ++id;
        return foodId;
    }
}
