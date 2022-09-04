public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        System.out.println(" ");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println(" ");
        int clientOs = 1;
        int clientDeviceYear = 2018;
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOs == 1) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
            // Задание 3
            System.out.println(" ");
            System.out.println("Задание 3");
            System.out.println(" ");
            int year = 2020;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " является високосным.");
            }
            else {
                System.out.println(year + " не является високосным.");
            }
            // Задание 4
            System.out.println(" ");
            System.out.println("Задание 4");
            System.out.println(" ");
            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance > 20) {
                days = days + 1; }
            if (deliveryDistance > 60) {
                days = days +1;
            }
            {   System.out.println("Потребуется дней: " + days);
            }
            // Задание 5
            System.out.println(" ");
            System.out.println("Задание 5");
            System.out.println(" ");
            int monthNumber = 17;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
            }
    }
}

