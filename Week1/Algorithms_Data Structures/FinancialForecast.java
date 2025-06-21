import java.util.*;

public class FinancialForecast {

    public static double averageDailyChange(List<Integer> transactions) {
        int sum = 0;
        for (int t : transactions) {
            sum += t;
        }
        return (double) sum / transactions.size();
    }

    public static List<Double> forecastFutureBalance(List<Integer> transactions, int days) {
        List<Double> forecast = new ArrayList<>();
        double avgChange = averageDailyChange(transactions);

        for (int i = 0; i < days; i++) {
            forecast.add(avgChange);
        }

        return forecast;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> transactions = Arrays.asList(1000, -200, 300, -100, 400);

        System.out.print("Enter number of future days to forecast: ");
        int k = scanner.nextInt();

        List<Double> forecast = forecastFutureBalance(transactions, k);
        double totalForecast = forecast.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Forecasted daily changes:");
        for (int i = 0; i < forecast.size(); i++) {
            System.out.printf("Day %d: %.2f\n", i + 1, forecast.get(i));
        }

        System.out.printf("Total Forecast for next %d days: %.2f\n", k, totalForecast);
    }
}
