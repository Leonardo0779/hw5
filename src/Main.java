//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\ntask1");

        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }

        System.out.println("task2");

        int clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }
        System.out.println("task3");

        int year = 1010;
        if (year > 1584 && (year % 4 ==0 && year % 100 != 0 || year % 400 ==0)) {
            System.out.printf("%s год является високосным",year);
        } else {
            System.out.printf("%s год не является високосным\n",year);
        }
        System.out.println("\ntask4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.printf("Потребуется дней %s",days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = days =1;
            System.out.printf("Потребуется дней %s",days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = days +2;
            System.out.printf("Потребуется дней %s",days);
        } else {
            System.out.printf("Доставки нет %s",days);
        }
        System.out.println("\ntask5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
        }


    }
}