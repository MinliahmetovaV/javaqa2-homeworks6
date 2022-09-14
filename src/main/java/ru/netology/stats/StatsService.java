package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public long averageSales(long[] sales) {
        return sum(sales) / sales.length;

    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        long averSales = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averSales) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSales(long[] sales) {
        long averSales = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averSales) {
                count++;
            }
        }
        return count;
    }

}
