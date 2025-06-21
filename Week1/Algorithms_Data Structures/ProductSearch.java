import java.util.*;

public class ProductSearch {

    public static List<String> searchProducts(List<String> products, String query) {
        List<String> result = new ArrayList<>();
        String lowerQuery = query.toLowerCase();

        for (String product : products) {
            if (product.toLowerCase().contains(lowerQuery)) {
                result.add(product);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList("iPhone", "iPad", "MacBook", "AirPods", "Charger");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search query: ");
        String query = scanner.nextLine();

        List<String> matches = searchProducts(products, query);

        if (matches.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            System.out.println("Matching products: " + matches);
        }
    }
}
