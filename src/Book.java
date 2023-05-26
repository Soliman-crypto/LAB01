class Book {
    private double price;
    private int pageCount;
    private int wordCount;
    private int stockLevel;
    private String author;
    private String isbn;

    public Book(double price, int pageCount, int wordCount, int stockLevel, String author, String isbn) {
        this.price = price;
        this.pageCount = pageCount;
        this.wordCount = wordCount;
        this.stockLevel = stockLevel;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayProductInformation() {
        System.out.println("Price: $" + price);
        System.out.println("Page count: " + pageCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Stock level: " + stockLevel);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
