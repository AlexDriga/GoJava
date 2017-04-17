package exemple.unit_06.citizen;

/**
 * Created by Vitalii on 19.03.2017.
 */
public class CitizenFactoryEx {
    public static void main(String[] args) {
        CitizenFactory factory = CitizenFactory.getInstance();

        Locale[] locales = Locale.values();

        for (Locale locale : locales) {
            factory.getCitizen(locale).sayHello();
        }
    }
}
