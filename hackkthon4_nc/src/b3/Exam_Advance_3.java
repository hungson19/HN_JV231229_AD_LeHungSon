package b3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_Advance_3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên khách hàng chờ mua vé xem phim");
            System.out.println("2. Khách tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String customerName = scanner.nextLine();
                    queue.add(customerName);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Khách hàng tiếp theo: " + queue.poll());
                    } else {
                        System.out.println("Danh sách khách hàng rỗng.");
                    }
                    break;
                case 3:
                    System.out.println("Thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

