public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        boolean AndroidOS = (clientOS == 1);
        if (AndroidOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2
        int newClientOS = 1;
        int clientDeviceYear = 2010;
        boolean newAndroidVersion = (newClientOS == 1 && clientDeviceYear >= 2015);
        if (newAndroidVersion) {
            System.out.println("Установите приложение на Android");
        } else if (newClientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченное приложение на Android");
        }
        if (newClientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение на iOS");
        }
        if (newClientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченное приложение на iOS");
        }

        //Задание 3
        int year = 2022;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год является високосным");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Год не является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 30;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день доставки");
        }
        if (deliveryDistance >=20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 суток доставки");
        }
        if (deliveryDistance >=60 && deliveryDistance <=100) {
            System.out.println("Потребуется 3 суток доставки");
        }

        //Задание 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - зимний месяц");
                break;
            case 2:
                System.out.println("Февраль - зимний месяц");
                break;
            case 3:
                System.out.println("Март - весенний месяц");
                break;
            case 4:
                System.out.println("Апрель - весенний месяц");
                break;
            case 5:
                System.out.println("Май - весенний месяц");
                break;
            case 6:
                System.out.println("Июнь - летний месяц");
                break;
            case 7:
                System.out.println("Июль - летний месяц");
                break;
            case 8:
                System.out.println("Август - летний месяц");
                break;
            case 9:
                System.out.println("Сентябрь - осенний месяц");
                break;
            case 10:
                System.out.println("Октябрь - осенний месяц");
                break;
            case 11:
                System.out.println("Ноябрь - осенний месяц");
                break;
            case 12:
                System.out.println("Декабрь - зимний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}