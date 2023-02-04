import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    //Задание 1. Сумма всех продаж
    @Test
    public void findSumMonth() {
        StatsService service = new StatsService();

        long[] sale = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonth = 180;
        long actualMonth = service.sumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    //Задание 2.  Средняя сумма продаж в месяц
    @Test
    public void findAverageSumMonth() {
        StatsService service = new StatsService();

        long[] sale = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonth = 15;
        long actualMonth = service.averageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    //Задание 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    public void findMaxMonth() {
        StatsService service = new StatsService();

        long[] sale = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    //Задание 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    public void findMinMonth() {
        StatsService service = new StatsService();

        long[] sale = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonth = 9;
        long actualMonth = service.minSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    //Задание 5. Количество месяцев, в которых продажи были ниже среднего
    @Test
    public void findLowAverageSumMonth() {
        StatsService service = new StatsService();

        long[] sale = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonth = 5;
        long actualMonth = service.lowAverageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    //Задание 6. Количество месяцев, в которых продажи были выше среднего
    @Test
    public void findUpAverageSumMonth() {
        StatsService service = new StatsService();

        long[] sale = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonth = 5;
        long actualMonth = service.upAverageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
