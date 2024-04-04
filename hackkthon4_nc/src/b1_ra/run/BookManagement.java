package b1_ra.run;
import b1_ra.bussiness.IShop;
import b1_ra.bussinessImp.Author;
import b1_ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    private static List<IShop> itemList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("0. Hiển thị thông tin");
            System.out.println("1. Nhập số tác giả và nhập thông tin các tác giả");
            System.out.println("2. Nhập số sách và nhập thông tin các sách");
            System.out.println("3. Sắp xếp sách theo giá xuất sách tăng dần");
            System.out.println("4. Tìm kiếm sách theo tên tác giả sách");
            System.out.println("5. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    displayBooks();
                    break;
                case 1:
                    inputAuthors();
                    break;
                case 2:
                    inputBooks();
                    break;
                case 3:
                    sortBooksByExportPrice();
                    displayBooks();
                    break;
                case 4:
                    searchBooksByAuthorName();
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }

    private static void inputAuthors() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng tác giả: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin tác giả cho tác giả " + (i + 1) + ":");
            Author author = new Author();
            author.inputData();
            itemList.add(author);
        }
        displayAuthors();
    }

    private static void inputBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập chi tiết sách cho sách " + (i + 1) + ":");
            Book book = new Book();
            book.inputData();
            itemList.add(book);
        }
    }

    private static void sortBooksByExportPrice() {
        Collections.sort(itemList, new Comparator<IShop>() {
            @Override
            public int compare(IShop item1, IShop item2) {
                if (item1 instanceof Book && item2 instanceof Book) {
                    float exportPrice1 = ((Book) item1).getExportPrice();
                    float exportPrice2 = ((Book) item2).getExportPrice();
                    return Float.compare(exportPrice1, exportPrice2);
                }
                return 0;
            }
        });
        System.out.println("Sắp xếp thành công.");
    }


    private static void searchBooksByAuthorName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên tác giả để tìm kiếm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (IShop item : itemList) {
            if (item instanceof Book && ((Book) item).author.authorName.equalsIgnoreCase(name)) {
                item.displayData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách của tác giả có tên \"" + name + "\".");
        }
    }
    private static void displayAuthors() {
        System.out.println("Danh sách tác giả:");
        for (IShop item : itemList) {
            if (item instanceof Author) {
                ((Author) item).displayData();
                System.out.println();
            }
        }
    }

    private static void displayBooks() {
        System.out.println("Danh sách sách:");
        for (IShop item : itemList) {
            if (item instanceof Book) {
                ((Book) item).displayData();
                System.out.println();
            }
        }
    }

}

