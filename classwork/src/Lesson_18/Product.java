package Lesson_18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDateTime dateAdded;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Product(String type, double price, boolean discountApplicable) {
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
    }


    public Product(String type, double price, boolean discountApplicable, LocalDateTime dateAdded) {
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.dateAdded = dateAdded;
    }
    public Product(int id, String type, double price, boolean discountApplicable, LocalDateTime dateAdded) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.dateAdded = dateAdded;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }


    public double getDiscountedPrice() {
        return discountApplicable ? price * 0.9 : price;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public static List<Product> getExpensiveBooks(List<Product> products,int costs) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > costs)
                .collect(Collectors.toList());
    }

    public static List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.discountApplicable)
                .map(product -> new Product(product.getType(), product.getDiscountedPrice(), false))
                .collect(Collectors.toList());
    }


    public static Product findCheapestBook(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min((product1, product2) -> Double.compare(product1.getPrice(), product2.getPrice()))
                .orElseThrow(() -> new NoSuchElementException("Книги не знайдені"));
    }

    public static List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted((product1, product2) -> product2.getDateAdded().compareTo(product1.getDateAdded()))
                .limit(3)
                .collect(Collectors.toList());
    }


    public static double calculateTotalCost(List<Product> products,int priceNotExc) {
        LocalDate currentDate = LocalDate.now();
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getDateAdded().getYear() == currentDate.getYear())
                .filter(product -> product.getPrice() <= priceNotExc)
                .mapToDouble(Product::getPrice)
                .sum();
    }



    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    public int getId() {
        return id;
    }
}
