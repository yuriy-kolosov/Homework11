public class Main {
    public static void main(String[] args) {
//
        System.out.println("Домашнее задание 11");
        System.out.println();
//
        System.out.println("          Задача 11-1");
        System.out.println();
        int checkYear;
        int year;
//
        System.out.println("        Проверка 11-1-1");
        year = 1583;
        System.out.print("Год " + year + " - ");
        checkYear = checkYearBissextile(year);
        printCheckYearBissextile(checkYear);
//
        System.out.println("        Проверка 11-1-2");
        year = 1600;
        System.out.print("Год " + year + " - ");
        checkYear = checkYearBissextile(year);
        printCheckYearBissextile(checkYear);
//
        System.out.println("        Проверка 11-1-3");
        year = 1785;
        System.out.print("Год " + year + " - ");
        checkYear = checkYearBissextile(year);
        printCheckYearBissextile(checkYear);
//
        System.out.println("        Проверка 11-1-4");
        year = 1900;
        System.out.print("Год " + year + " - ");
        checkYear = checkYearBissextile(year);
        printCheckYearBissextile(checkYear);
//
        System.out.println("        Проверка 11-1-5");
        year = 2000;
        System.out.print("Год " + year + " - ");
        checkYear = checkYearBissextile(year);
        printCheckYearBissextile(checkYear);
//
        System.out.println("        Проверка 11-1-6");
        year = 2005;
        System.out.print("Год " + year + " - ");
        checkYear = checkYearBissextile(year);
        printCheckYearBissextile(checkYear);
//
        System.out.println("        Проверка 11-1-7");
        year = 2024;
        System.out.print("Год " + year + " - ");
        checkYear = checkYearBissextile(year);
        printCheckYearBissextile(checkYear);
//
        System.out.println();
        System.out.println("          Задача 11-2");
        int typeOs;
        int issueYear;
//
        System.out.println();
        System.out.println("        Проверка 11-2-1");
        typeOs = 0;
        issueYear = 2014;
        System.out.println("Исходные параметры - " + typeOs + ", " + issueYear);
        checkOsApp(typeOs, issueYear);
//
        System.out.println();
        System.out.println("        Проверка 11-2-2");
        typeOs = 0;
        issueYear = 2016;
        System.out.println("Исходные параметры - " + typeOs + ", " + issueYear);
        checkOsApp(typeOs, issueYear);
//
        System.out.println();
        System.out.println("        Проверка 11-2-3");
        typeOs = 1;
        issueYear = 2011;
        System.out.println("Исходные параметры - " + typeOs + ", " + issueYear);
        checkOsApp(typeOs, issueYear);
//
        System.out.println();
        System.out.println("        Проверка 11-2-4");
        typeOs = 1;
        issueYear = 2019;
        System.out.println("Исходные параметры - " + typeOs + ", " + issueYear);
        checkOsApp(typeOs, issueYear);
//
        System.out.println();
        System.out.println("          Задача 11-3");
        int deliveryDistance;
        int deliveryTime;
//
        System.out.println();
        System.out.println("        Проверка 11-3-1");
        deliveryDistance = 5;
        System.out.println("Расстояние (км) = " + deliveryDistance);
        deliveryTime = checkDistance(deliveryDistance);
        if (deliveryTime > 0) {
            System.out.println("Время доставки (сутки) = " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
//
        System.out.println();
        System.out.println("        Проверка 11-3-2");
        deliveryDistance = 23;
        System.out.println("Расстояние (км) = " + deliveryDistance);
        deliveryTime = checkDistance(deliveryDistance);
        if (deliveryTime > 0) {
            System.out.println("Время доставки (сутки) = " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
//
        System.out.println();
        System.out.println("        Проверка 11-3-3");
        deliveryDistance = 87;
        System.out.println("Расстояние (км) = " + deliveryDistance);
        deliveryTime = checkDistance(deliveryDistance);
        if (deliveryTime > 0) {
            System.out.println("Время доставки (сутки) = " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
//
        System.out.println();
        System.out.println("        Проверка 11-3-4");
        deliveryDistance = 102;
        System.out.println("Расстояние (км) = " + deliveryDistance);
        deliveryTime = checkDistance(deliveryDistance);
        if (deliveryTime > 0) {
            System.out.println("Время доставки (сутки) = " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static int checkYearBissextile(int y) { //Проверка на високосный год
//
        int yearBissextile = -1; // Год не определен
//
        if (y >= 1584) {
            if (y % 400 == 0) {
                yearBissextile = 1; //  Год високосный
            } else if (y % 100 == 0) {
                yearBissextile = 0; // Год невисокосный
            } else if (y % 4 == 0) {
                yearBissextile = 1; //  Год високосный
            } else yearBissextile = 0; // Год невисокосный
        }
        return yearBissextile;
    }

    public static void printCheckYearBissextile(int cY) { //Вывод на печать результата проверки на високосный год
//
        switch (cY) {
            case 0:
                System.out.println("невисокосный");
                break;
            case 1:
                System.out.println("високосный");
                break;
            default:
                System.out.println("не определён");
        }
    }

    public static void checkOsApp(int tOs, int iYear) { // Проверка типа приложения для установки
        int clientDeviceYear = 2015;
        if (tOs == 1) { // Тип Android
            if (iYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (iYear >= 2015) { // Тип iOS
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int checkDistance(int dDist) { // Проверка расстояния для доставки
        int dTime = -1;
//
        if (dDist <= 100) {
            if (dDist > 60) {
                dTime = 3;
            } else if (dDist > 20) {
                dTime = 2;
            } else {
                dTime = 1;
            }
        }
        return dTime; // Время доставки в сутках
    }
}