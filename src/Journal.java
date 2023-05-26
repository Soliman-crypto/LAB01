public class Journal {
    private double price;
    private int pageCount;
    private int issueCount;
    private int stockLevel;
    private String editor;
    private String frequency;


    public Journal(double price, int pageCount, int issueCount, int stockLevel, String editor, String frequency) {
        this.price = price;
        this.pageCount = pageCount;
        this.issueCount = issueCount;
        this.stockLevel = stockLevel;
        this.editor = editor;
        this.frequency = frequency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(int issueCount) {
        this.issueCount = issueCount;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void displayProductInformation() {
        System.out.println("Price: $" + price);
        System.out.println("Page count: " + pageCount);
        System.out.println("Issue count: " + issueCount);
        System.out.println("Stock level: " + stockLevel);
        System.out.println("Editor: " + editor);
        System.out.println("Frequency: " + frequency);
    }
}