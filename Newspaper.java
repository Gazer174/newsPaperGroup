import java.util.Date;

public class Newspaper {
    private String paperName;
    private int paperId;
    private String date;
    private int pages;
    private double price;
    private String articles;

    public Newspaper(String paperName, String date, int pages, double price) {
        this.paperName = paperName;
        this.paperId = Main.paperIdTracker++;
        this.date = date;
        this.pages = pages;
        this.price = price;
        this.articles = articles;
    }
    public Newspaper(String paperName){
        this.paperName = paperName;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = String.valueOf(date);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticles() {
        return articles;
    }

    public void setArticles(String articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "paperName='" + paperName + '\'' +
                ", paperId=" + paperId +
                ", date=" + date +
                ", pages=" + pages +
                ", price=" + price +
                ", articles='" + articles + '\'' +
                '}';
    }
}
