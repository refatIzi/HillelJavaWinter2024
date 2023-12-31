package lesson_8;

public class Main {

    public static void main(String[] args) {
        Service subService = new Service();
        subService.checkCityTalkTime(SubsArray.getSubscribers(), 200);
        subService.checkLongDistanceCallTime(SubsArray.getSubscribers());
        subService.checkInfoByLetter(SubsArray.getSubscribers(), 'E');
        System.out.println("Суммарний трафік: " +
                subService.checkInternetTrafficCity(SubsArray.getSubscribers(), "Kyiv"));
        System.out.println();
        System.out.println("Кількість абонентів с негативним балансом: " +
                subService.checkNegativeBalance(SubsArray.getSubscribers()));
    }
}
