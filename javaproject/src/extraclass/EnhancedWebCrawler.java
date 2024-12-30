package extraclass;

import java.util.*;

public class EnhancedWebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a starting URL: ");
        String startingURL = input.nextLine();

        // Start crawling from the starting URL
        crawl(startingURL);
    }

    public static void crawl(String startingURL) {
        Map<String, List<String>> urlHierarchy = new HashMap<>(); // Stores URLs and their sub-URLs
        Set<String> traversedURLs = new HashSet<>(); // Keeps track of visited URLs
        Queue<String> pendingURLs = new LinkedList<>(); // Queue for URLs to process

        pendingURLs.add(startingURL);
        traversedURLs.add(startingURL);

        while (!pendingURLs.isEmpty() && traversedURLs.size() <= 100) {
            String currentURL = pendingURLs.poll();
            System.out.println("Crawling: " + currentURL);

            List<String> subURLs = getSubURLs(currentURL);
            urlHierarchy.put(currentURL, subURLs);

            for (String subURL : subURLs) {
                if (!traversedURLs.contains(subURL)) {
                    pendingURLs.add(subURL);
                    traversedURLs.add(subURL);
                }
            }
        }

        // Print the hierarchy
        System.out.println("\nURL Hierarchy:");
        printHierarchy(urlHierarchy, startingURL, 0);
    }

    public static List<String> getSubURLs(String urlString) {
        List<String> subURLs = new ArrayList<>();
        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());

            while (input.hasNextLine()) {
                String line = input.nextLine();
                int currentIndex = 0;

                while ((currentIndex = line.indexOf("http", currentIndex)) != -1) {
                    int endIndex = line.indexOf("\"", currentIndex);
                    if (endIndex > 0) {
                        String subURL = line.substring(currentIndex, endIndex);
                        subURLs.add(subURL);
                        currentIndex = endIndex;
                    } else {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading from URL: " + urlString);
        }

        return subURLs;
    }

    public static void printHierarchy(Map<String, List<String>> hierarchy, String currentURL, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  "); // Indent to show hierarchy
        }
        System.out.println(currentURL);

        List<String> subURLs = hierarchy.get(currentURL);
        if (subURLs != null) {
            for (String subURL : subURLs) {
                printHierarchy(hierarchy, subURL, depth + 1);
            }
        }
    }
}
