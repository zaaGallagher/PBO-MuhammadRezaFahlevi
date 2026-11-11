package JS10;

public class WebPage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override
    public String getPrintableContent() {
        String temp = "URL: " + url + "\n";
        temp += "Title: " + title + "\n";
        // Menghilangkan tag HTML
        temp += content.replaceAll("<[^>]*>", ""); 
        return temp;
    }
}
