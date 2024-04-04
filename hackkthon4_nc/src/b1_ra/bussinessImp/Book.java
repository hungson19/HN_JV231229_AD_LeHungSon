package b1_ra.bussinessImp;

import b1_ra.bussiness.IShop;

import java.util.Scanner;

public class Book implements IShop {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    public Author author;
    private float importPrice;
    public float exportPrice;
    private int quantity;
    private boolean bookStatus;

    public Book() {}

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author, float importPrice, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sách: ");
        bookId = scanner.nextInt();
        System.out.print("Nhập tên sách: ");
        scanner.nextLine(); // Consume newline
        bookName = scanner.nextLine();
        System.out.print("Nhập tiêu đề: ");
        title = scanner.nextLine();
        System.out.print("Nhập số trang: ");
        numberOfPages = scanner.nextInt();
        System.out.print("Nhập giá : ");
        importPrice = scanner.nextFloat();
        exportPrice = importPrice * IShop.RATE;
        System.out.print("Nhập số lượng: ");
        quantity = scanner.nextInt();
        System.out.print("Nhập tình trạng sách (true/false): ");
        bookStatus = scanner.nextBoolean();
        System.out.println("Nhập chi tiết tác giả:");
        author = new Author();
        author.inputData();
    }

    @Override
    public void displayData() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tên tác giả: " + author.authorName);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Tình trạng sách: " + bookStatus);
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }
}

