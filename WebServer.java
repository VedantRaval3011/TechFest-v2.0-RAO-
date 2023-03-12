import java.util.*;

class Website implements Comparable<Website> {
    public int text_content;
    public int images;
    public int forms;

    public Website(int text_content, int images, int forms) {
        this.text_content = text_content;
        this.images = images;
        this.forms = forms;
    }

    public int compareTo(Website other) {
        if (text_content == other.text_content) {
            return Integer.compare(other.images, images);
        }
        return Integer.compare(text_content, other.text_content);
    }
}

public class WebServer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Website> websites = new ArrayList<>();

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            websites.add(new Website(A, B, C));
        }

        // sort websites by priority
        Collections.sort(websites);

        // output website data
        for (Website website : websites) {
            System.out.println(website.text_content + "," + website.images + "," + website.forms);
        }
    }
}
