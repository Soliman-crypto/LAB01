class Magazine {
    private double price;
    private int pageCount;
    private int issueCount;
    private int stockLevel;
    private String publisher;
    private String frequency;

    public Magazine(double price, int pageCount, int issueCount, int stockLevel, String publisher, String frequency) {
        this.price = price;
        this.pageCount = pageCount;
        this.issueCount = issueCount;
        this.stockLevel = stockLevel;
        this.publisher = publisher;
        this.frequency = frequency;
    }

    public void displayProductInformation() {
        System.out.println("Price: $" + price);
        System.out.println("Page count: " + pageCount);
        System.out.println("Issue count: " + issueCount);
        System.out.println("Stock level: " + stockLevel);
        System.out.println("Publisher: " + publisher);
        System.out.println("Frequency: " + frequency);
    }
}
