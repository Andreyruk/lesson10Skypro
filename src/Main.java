import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String ar = Arrays.toString(arr);
        //System.out.println(ar);

        //generateRandomArray();
        int[] arr = generateRandomArray();

        task1(arr);
        task2(arr);
        task3(arr);
        task4(arr);
    }

    //int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        // Домашнее задание 10
        System.out.println("Домашнее задание 10");
        // Задача 1 (вар.1)
        // Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат в формате:
        // «Сумма трат за месяц составила … рублей».
        System.out.println("Задача 1 (вар.1)");
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        return arr;
    }

    public static void task1(int[] arr) {
        // Задача 1 (вар.2)
        System.out.println("Задача 1 (вар.2)");
        double sum1 = 0;
        for (int vaiue : arr) {   //vaiue = arr[i] - объявление переменной
            sum1 += vaiue;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей");
    }

    public static void task2(int[] arr) {
        // Задача 2 (вар.1)
        // Следующая задача — найти минимальную и максимальную трату за день.
        // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        System.out.println("Задача 2 (вар.1)");
        String ar = Arrays.toString(arr);
        System.out.println(ar);
        //или
        //System.out.println(Arrays.toString(arr));
        int minSum = 200000;
        //for (int i = 0; i < arr.length; i++) {
        //    if (arr[i] < minSum) {
        //        minSum = arr[i];
        //    }
        //}  или
        for (int j : arr) {
            if (j < minSum) {
                minSum = j;
            }
        }
        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {    //for - когда подсвечен можно заменить, на то что после "или"
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        // или
        //for (int j : arr) {
        //    if (j > maxSum) {
        //        maxSum = j;
        //    }
        //}
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
        // Задача 2 (вар.2)
        System.out.println("Задача 2 (вар.2)");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3(int[] arr) {
        // Задача 3 (вар.1)
        // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        // Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        // поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        System.out.println("Задача 3 (вар.1)");
        System.out.println(Arrays.toString(arr));
        double sum = 0;
        int day = 30;
        double sumAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            sumAverage = sum / day;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", sumAverage);//%.2f -означает кол-во знаков после запятой
        // Задача 3 (вар.2)
        System.out.println("Задача 3 (вар.2)");
        System.out.println(Arrays.toString(arr));
        int sumAverage1 = 0;
        for (int i : arr) {
            sumAverage1 += i;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", sumAverage1 / (double) arr.length);
        //%.2f -означает кол-во знаков после запятой
    }

    public static void task4(int[] arr) {
        // Задача 4
        // В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в
        // обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        // Данные с именами сотрудников хранятся в виде массива символов (char[]). Напишите код, который в случае такого
        // бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        // char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // В результате в консоль должно быть выведено "Ivanov Ivan".
        // **Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по
        // массиву циклом и распечатать его элементы в правильном порядке.
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //for (int i = reverseFullName.length - 1; i >= 0; i--) {
        //или
        int i = reverseFullName.length - 1;
        while (i >= 0) {
            System.out.print(reverseFullName[i]);
            i--;
        }
        System.out.println();
    }
}