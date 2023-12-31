package lesson_8;

public class Service implements SubscriberService {

    @Override
    public void checkCityTalkTime(Subscriber[] subscribers, int cityTalkTime) {
        System.out.println("Виведення абонентів, у яких час міських розмов перевищує " + cityTalkTime + ":");
        for (Subscriber s : subscribers) {
            if (s.getCityTalkTime() > cityTalkTime) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    @Override
    public void checkLongDistanceCallTime(Subscriber[] subscribers) {
        System.out.println("Виведення абонентів, які користувалися міжміським зв'язком:");
        for (Subscriber s : subscribers) {
            if (s.getLongDistanceCallTime() > 0) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    @Override
    public void checkInfoByLetter(Subscriber[] subscribers, char letter) {
        System.out.println("Виведення абонентів, прізвище яких починається на букву " + letter + ":");
        for (Subscriber s : subscribers) {
            char[] arrLastName = s.getLastName().toCharArray();
            if (arrLastName[0] == letter) {
                System.out.println("Прізвище: " + s.getLastName() + ". Ім'я: " +
                        s.getFirstName() + ". По батькові: " + s.getPatronymic() +
                        ". Номер телефону: " + s.getNumberPhone() + ". Баланс: " + s.getBalance());
            }
        }
        System.out.println();
    }

    @Override
    public int checkInternetTrafficCity(Subscriber[] subscribers, String city) {
        System.out.println("Виведення сумарного трафіку міста " + city + ":");
        int sumTraffic = 0;
        for (Subscriber s : subscribers) {
            if (s.getCity().equals(city)) {
                sumTraffic += s.getInternetTraffic();
            }
        }
        return sumTraffic;
    }

    @Override
    public int checkNegativeBalance(Subscriber[] subscribers) {
        System.out.println("Виведення абонентів з негативним балансом: ");
        int counter = 0;
        for (Subscriber s : subscribers) {
            if (s.getBalance() < 0) {
                ++counter;
            }
        }
        return counter;
    }
}