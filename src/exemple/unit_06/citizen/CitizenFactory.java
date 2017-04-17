package exemple.unit_06.citizen;

/**
 * Created by Vitalii on 19.03.2017.
 */
public class CitizenFactory {

    private static CitizenFactory instance;

    private CitizenFactory() {

    }

    public static CitizenFactory getInstance() {
        if (instance == null) {
            instance = new CitizenFactory();
        }
        return instance;
    }

    public Citizen getCitizen(Locale locale) {
        switch (locale) {
            case ENG:
                return new Englishman();
            case CH:
                return new Chinese();
            case ITA:
                return new Italian();
            case RU:
                return new Russian();
        }
        throw new IllegalArgumentException("Unsupported locale");
    }

    private final class Englishman implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Hello");
        }
    }

    private final class Chinese implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("你好");
        }
    }

    private final class Russian implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    private final class Italian implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Ciao");
        }
    }
}
