import java.util.Scanner;
class Lesson11 {
    String word1 = "Orange";
    String word2 = "Banana";
    String word3 = "Apple";

    public void printThreeWords() {
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}

class Lesson12 {
    int a = 300, b = -100;
    int sum;

    public void checkSumSign() {
        sum = a + b;
        if (sum >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
}

class Lesson13 {
    int value = 110;

    public void printColor() {
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 & value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }
}

class Lesson14 {
    int a = 20, b = 547;

    public void compareNumbers() {
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}

class Lesson15 {
    public boolean wholeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        int sum = a + b;

        System.out.println("Их сумма равна " + sum);
        if (sum >= 10 & sum <= 20) return true;
        else return false;
    }
}

class Lesson16 {
    public boolean plusNumber1(int b) {
        if (b >= 0) return true;
        else return false;
    }
}

class Lesson17 {
    public boolean plusNumber(int a) {
        if (a >= 0) return false;
        else return true;
    }
}

class Lesson18 {
    public void lineNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Напечатейте строку");
        String line = in.nextLine();
        System.out.println("Напечатайте количество повторений");
        int a = in.nextInt();
        int n;
        n = a;
        for (n = 0; n < a; n++)
            System.out.println(line);
    }
}

class Lesson19 {
    public void leapYears() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");

        boolean leap;
        int year = in.nextInt();

        if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) leap = true;
        else leap = false;

        if (leap) System.out.println(year + " год - високосный");
        else System.out.println(year + " год - не високосный");
    }
}

class Lesson110 {
    public void changeArray() {
        int[] nums = {1, 1, 1, 0, 1, 0, 0};
        System.out.println("Исходный массив:");
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Измененный массив:");
        for (int x : nums) {
            if (x == 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
    }
}

class Lesson111 {
    public void fullArray() {
        int[] mus = new int[100];
        int i;
        System.out.println("Элементы массива:");
        for (i = 0; i < 100; i++)
            mus[i] = i + 1;
        for (i = 0; i < 100; i++)
            System.out.print(mus[i] + " ");
        System.out.println();
    }
}

class Lesson112 {
    public void doubleXArray() {
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Элементы массива:");
        for (int x : c) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Элементы нового массива:");
        for (int i : c) {
            if (i < 6) i = i * 2;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Lesson113 {
    public void diagonalArray() {
        int i, j;
        int x = 5, y = 5;
        int[][] dia = new int[x][y];
        for (i = 0; i < dia.length; i++) {
            for (j = 0; j < dia.length; j++) {
                dia[i][j] = 1;
                System.out.print(dia[i][i] + " ");
            }
            System.out.println();
        }
    }
}

class Lesson114 {
    public void lensValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = in.nextInt();
        System.out.println("Введите значение ячейки: ");
        int initialValue = in.nextInt();

        System.out.println("Полученный массив");
        int[] arr = new int[len];
        for (int i : arr) {
            i = initialValue;
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        Lesson11 words = new Lesson11();
        words.printThreeWords();

        System.out.println();
        System.out.println("Задание 2");
        Lesson12 sum = new Lesson12();
        sum.checkSumSign();

        System.out.println();
        System.out.println("Задание 3");
        Lesson13 color = new Lesson13();
        color.printColor();

        System.out.println();
        System.out.println("Задание 4");
        Lesson14 numbers = new Lesson14();
        numbers.compareNumbers();

        System.out.println();
        System.out.println("Задание 5");
        Lesson15 number = new Lesson15();
        number.wholeNumber();

        System.out.println();
        System.out.println("Задание 6");
        Lesson16 b = new Lesson16();
        if(b.plusNumber1(10)) System.out.println("10 - положительное число");
        if(b.plusNumber1(0)) System.out.println("0 - положительное число");
        if(b.plusNumber1(-10)) System.out.println("-10 - отрицательное число");

        System.out.println();
        System.out.println("Задание 7");
        Lesson17 c = new Lesson17();
        if(c.plusNumber(10)) System.out.println("10 - положительное число");
        if(c.plusNumber(0)) System.out.println("0 - положительное число");
        if(c.plusNumber(-10)) System.out.println("-10 - отрицательное число");

        System.out.println();
        System.out.println("Задание 8");
        Lesson18 line = new Lesson18();
        line.lineNumbers();

        System.out.println();
        System.out.println("Задание 9");
        Lesson19 years = new Lesson19();
        years.leapYears();

        System.out.println();
        System.out.println("Задание 10");
        Lesson110 change = new Lesson110();
        change.changeArray();

        System.out.println();
        System.out.println("Задание 11");
        Lesson111 full = new Lesson111();
        full.fullArray();

        System.out.println();
        System.out.println("Задание 12");
        Lesson112 doubleX = new Lesson112();
        doubleX.doubleXArray();

        System.out.println();
        System.out.println("Задание 13");
        Lesson113 diagonal = new Lesson113();
        diagonal.diagonalArray();

        System.out.println();
        System.out.println("Задание 14");
        Lesson114 lens = new Lesson114();
        lens.lensValue();
    }
}