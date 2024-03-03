package Lesson_18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> productList1 = Arrays.asList(
                new Product("Book", 200),
                new Product("Book", 300),
                new Product("Book", 400),
                new Product("Pen", 150),
                new Product("Book", 1000)
        );

        List<Product> expensiveBooks = Product.getExpensiveBooks(productList1,250);
        expensiveBooks.forEach(product -> System.out.println("Type: " + product.getType() + ", Price: " + product.getPrice()));

        List<Product> productList = Arrays.asList(
                new Product("Book", 200, true),
                new Product("Book", 300, true),
                new Product("Book", 400, false),
                new Product("Pen", 150, true),
                new Product("Book", 1000, true)
        );

        List<Product> discountedBooks2 = Product.getDiscountedBooks(productList);
        discountedBooks2.forEach(product -> System.out.println("Type: " + product.getType() + ", Discounted Price: " + product.getDiscountedPrice()));


        List<Product> productList2 = Arrays.asList(
                new Product("Book", 200),
                new Product("Book", 300),
                new Product("Book", 400),
                new Product("Pen", 150),
                new Product("Book", 1000)
        );

        Product cheapestBook2 = Product.findCheapestBook(productList2);
        System.out.println("Cheapest Book - Type: " + cheapestBook2.getType() + ", Price: " + cheapestBook2.getPrice());

        List<Product> productList3 = Arrays.asList(
                new Product("Book", 200, true, LocalDateTime.now().minusDays(2)),
                new Product("Book", 300, true, LocalDateTime.now().minusDays(1)),
                new Product("Book", 400, false, LocalDateTime.now()),
                new Product("Pen", 150, true, LocalDateTime.now().minusDays(3)),
                new Product("Book", 1000, true, LocalDateTime.now())
        );

        List<Product> lastThreeAddedProducts = Product.getLastThreeAddedProducts(productList3);
        lastThreeAddedProducts.forEach(product -> System.out.println("Type: " + product.getType() + ", Date Added: " + product.getDateAdded()));

        List<Product> productList4 = Arrays.asList(
                new Product("Book", 50, true, LocalDateTime.of(2024, 3, 1,12,12)),
                new Product("Book", 100, true, LocalDateTime.of(2023, 5, 10,12,12)),
                new Product("Book", 200, true, LocalDateTime.of(2024, 1, 15,12,12)),
                new Product("Pen", 150, true, LocalDateTime.of(2024, 3, 3,12,12)),
                new Product("Book", 70, true, LocalDateTime.of(2024, 4, 20,12,12))
        );


        double totalCost = Product.calculateTotalCost(productList4,75);
        System.out.println("Total Cost of Books added in current year with price <= 75: " + totalCost);

        List<Product> productList5 = Arrays.asList(
                new Product(1, "Book", 200, true, LocalDateTime.now().minusDays(2)),
                new Product(2, "Pen", 50, false, LocalDateTime.now().minusDays(1)),
                new Product(3, "Book", 300, true, LocalDateTime.now()),
                new Product(4, "Book", 150, true, LocalDateTime.now().minusDays(3)),
                new Product(5, "Pen", 100, true, LocalDateTime.now())
        );

        Map<String, List<Product>> groupedProducts = Product.groupProductsByType(productList5);
        groupedProducts.forEach((type, products) -> {
            System.out.println("Type: " + type);
            products.forEach(product -> System.out.println("   ID: " + product.getId() + ", Price: " + product.getPrice()));
        });

    }
}
