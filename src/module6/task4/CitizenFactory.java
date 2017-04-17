package module6.task4;

/**
 * Создайте интерфейс Citizen с методом sayHello().

 Создайте класс-фабрику CitizenFactory, который будет статически генерировать граждан разных стран.
 Используйте для этого следующие вложенные классы:
 Englishman
 Chinese
 Russian
 Italian

 Каждый из вложенных классов реализует интерфейс Citizen. Метод sayHello() должен выводить фразу «Привет» на соответствующем языке.
 Удостоверьтесь, что вложенные классы недоступны вне класса-фабрики.

 Создайте класс CitizenMain с методом main, где проверьте работу CitizenFactory.
 */
public class CitizenFactory {

    private static CitizenFactory instance = null;

    private CitizenFactory() {
    }

    private static CitizenFactory getInstance (){
        if (instance == null){
            synchronized (CitizenFactory.class){
                instance = new CitizenFactory();
            }
        }
        return instance;
    }

    private static class Englishman implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Hello!");
        }
    }

    private static class Chinese implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Ni hao!");
        }
    }

    private static class Russian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Привет!");
        }
    }

    private static class Italian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Ciao!");
        }
    }


    public static Citizen createCitizen (CitizenType citizenType){
        switch (citizenType){
            case Englishman:
                return new Englishman ();
            case Chinese:
                return new Chinese();
            case Russian:
                return new Russian();
            case Italian:
                return new Italian();
        }
        return null;
    }

}
