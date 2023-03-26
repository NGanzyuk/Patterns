import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Программа запущена");
        System.out.println("Добрый день");
        System.out.println("Введите размер списка");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        logger.log("Размер списка: " + n);
        System.out.println("Введите верхнюю границу значений элементов в списке");
        int m = scanner.nextInt();
        logger.log("Верхняя граница: " + m);
        List<Integer> list = new Random()
                .ints(0, m)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Введите число для фильтрации списка");
        int f = scanner.nextInt();
        scanner.close();
        logger.log("Фильтр: " + f);
        Filter filter = new Filter(f);
        System.out.println("Итоговый список " + filter.filterOut(list).toString());
        logger.log("Завершаем программу");
    }
}