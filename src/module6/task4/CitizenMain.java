package module6.task4;


public class CitizenMain{
    public static void main(String[] args) {

        CitizenFactory.createCitizen(CitizenType.Englishman).sayHello();
        CitizenFactory.createCitizen(CitizenType.Chinese).sayHello();
        CitizenFactory.createCitizen(CitizenType.Italian).sayHello();
        CitizenFactory.createCitizen(CitizenType.Russian).sayHello();
    }

}
