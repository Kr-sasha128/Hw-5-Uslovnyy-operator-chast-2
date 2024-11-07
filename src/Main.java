public class Main {
    public static void main(String[] args) {
        int age = 10;
        if (age == 18) {
            System.out.println("С окончанием школы");
        } else if (age == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }
        char color = 'l';
        switch (color) {
            case 'r':
                System.out.println("Красный! Ехать нельзя!");
                break;
            case 'y':
                System.out.println("Желтый. Внимание.");
                break;
            case 'g':
                System.out.println("Зеленый! Проезд разрешен.");
                break;
            case 'l':
                System.out.println("Поворот налево");
                break;
            default:
                System.out.println("Светофор сломался");
        }
//        Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//           Задача 2
        int clientDeviceYear = 2017;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//        Задача 3
        int year = 2021;
        if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else if (year < 1584) {
            System.out.println("В " + year + " году посчёты не велись");
        } else {
            System.out.println(year + " год не является високосным");
        }
//        Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней 3");
        } else {
            System.out.println("Доставки нет");
        }
//        Задача 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
        }
    }
}