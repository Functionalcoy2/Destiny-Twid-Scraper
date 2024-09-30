import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the URL of the website to scrape: ");
        String url = scanner.nextLine();

        try {
            // Connect to the website and parse the HTML
            Document doc = Jsoup.connect(url).get();

            // Extract all text
            String text = doc.body().text();
            System.out.println("\nScraped Text:\n");
            System.out.println(text);

        } catch (IOException e) {
            System.out.println("Error while fetching the website: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
