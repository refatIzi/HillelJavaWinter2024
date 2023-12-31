package lesson_8;


public class SubsArray {
    public static Subscriber[] subscribers = new Subscriber[15];
    private static final Subscriber Noah = new Subscriber(1, "Noah", "Smith", "Smith",
            "Kyiv", "0979533936", "7896547825142368",
            -5, 35, 22, 200);
    private static final Subscriber Liam = new Subscriber(2, "Liam", "Johnson", "Mason",
            "Kyiv", "0634568521", "5164789315842536",
            13, 65, 50, 150);
    private static final Subscriber Mason = new Subscriber(3, "Mason", "Williams", "Jacob",
            "Kyiv", "0978794563", "9649751325478964",
            67, 135, 13, 316);
    private static final Subscriber Jacob = new Subscriber(4, "Jacob", "Jones", "James",
            "Kyiv", "0965551135", "6488741417859346",
            74, 400, 0, 500);
    private static final Subscriber James = new Subscriber(5, "James", "Brown", "Benjamin",
            "Kyiv", "0959654123", "9659847412457863",
            -15, 0, 120, 410);
    private static final Subscriber Benjamin = new Subscriber(6, "Benjamin", "Davis", "Michael",
            "Kyiv", "0664785214", "3134659845613278",
            36, 44, 99, 369);
    private static final Subscriber Michael = new Subscriber(7, "Michael", "Miller", "Elijah",
            "Kyiv", "0977456395", "9646451525287843",
            -10, 39, 0, 221);
    private static final Subscriber Elijah = new Subscriber(8, "Elijah", "Wilson", "Ethan",
            "Kyiv", "0668794563", "3635314275471398",
            73, 98, 90, 55);
    private static final Subscriber Ethan = new Subscriber(9, "Ethan", "Moore", "Ethan",
            "Kyiv", "0950991475", "8318479648517523",
            22, 256, 0, 346);
    private static final Subscriber Emma = new Subscriber(10, "Emma", "Taylor", "Nolland",
            "Kyiv", "0660258964", "5458613654785312",
            40, 0, 28, 459);
    private static final Subscriber Nolland = new Subscriber(11, "Nolland", "Anderson", "Ethan",
            "Kyiv", "0503489315", "2123696854718319",
            100, 365, 55, 100);
    private static final Subscriber Abigail = new Subscriber(12, "Abigail", "Thomas", "Harper",
            "Kyiv", "0771843651", "4236538945128735",
            13, 123, 96, 152);
    private static final Subscriber Harper = new Subscriber(13,"Harper", "Jackson", "Harris",
            "Kyiv", "0989431257", "3694687152368456",
            150, 25, 144, 222);
    private static final Subscriber Barbara = new Subscriber(14, "Barbara", "White", "Branin",
            "Kyiv", "0999441175", "9441475821515448",
            30, 15, 155, 364);
    private static final Subscriber Branin = new Subscriber(15, "Branin", "Harris", "Ethan",
            "Kyiv", "0509974463", "3699852456982311",
            50, 47, 320, 95);

    public static Subscriber[] getSubscribers() {
        subscribers[0] = Noah;
        subscribers[1] = Liam;
        subscribers[2] = Mason;
        subscribers[3] = Jacob;
        subscribers[4] = James;
        subscribers[5] = Benjamin;
        subscribers[6] = Michael;
        subscribers[7] = Elijah;
        subscribers[8] = Ethan;
        subscribers[9] = Emma;
        subscribers[10] = Nolland;
        subscribers[11] = Abigail;
        subscribers[12] = Harper;
        subscribers[13] = Barbara;
        subscribers[14] = Branin;
        return subscribers;
    }
}