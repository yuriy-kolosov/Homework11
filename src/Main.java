public class Main {
    public static void main(String[] args) {
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
}