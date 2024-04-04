package b1_ra.bussinessImp;


import b1_ra.bussiness.IShop;

import java.util.Scanner;

public class Author implements IShop {
    private int authorId;
    public String authorName;
    private boolean sex;
    private int year;

    public Author() {}

    public Author(int authorId, String authorName, boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID tác giả: ");
        authorId = scanner.nextInt();
        System.out.print("Nhập tên tác giả: ");
        scanner.nextLine(); // Consume newline
        authorName = scanner.nextLine();
        System.out.print("Nhập giới tính (true cho nam, false cho nữ): ");
        sex = scanner.nextBoolean();
        System.out.print("Nhập năm sinh: ");
        year = scanner.nextInt();
    }

    @Override
    public void displayData() {
        System.out.println("ID tác giả: " + authorId);
        System.out.println("Tên tác giả: " + authorName);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Năm sinh: " + year);
    }
}

