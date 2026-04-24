import java.util.Scanner;

class ReviewAnalyzer {
    private String review;

    public ReviewAnalyzer(String review) {
        this.review = review;
    }

    // Count words
    public int getWordCount() {
        if (review.trim().isEmpty()) return 0;
        return review.trim().split("\\s+").length;
    }

    // Count characters
    public int getCharCount() {
        return review.length();
    }

    // Normalize text (lowercase)
    public String toLowerCase() {
        return review.toLowerCase();
    }

    // Normalize text (uppercase)
    public String toUpperCase() {
        return review.toUpperCase();
    }

    // Reverse text
    public String getReversed() {
        return new StringBuilder(review).reverse().toString();
    }

    // Palindrome check
    public boolean isPalindrome() {
        String normalized = review.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    // Display all features
    public void displayAnalysis() {
        System.out.println("\n--- Review Analysis ---");
        System.out.println("Original Review: " + review);
        System.out.println("Word Count: " + getWordCount());
        System.out.println("Character Count: " + getCharCount());
        System.out.println("Lowercase: " + toLowerCase());
        System.out.println("Uppercase: " + toUpperCase());
        System.out.println("Reversed: " + getReversed());
        System.out.println("Palindrome: " + (isPalindrome() ? "Yes" : "No"));
    }
}

public class EcommerceReviewApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a customer review:");
        String inputReview = sc.nextLine();

        ReviewAnalyzer analyzer = new ReviewAnalyzer(inputReview);
        analyzer.displayAnalysis();

        sc.close();
    }
}
