package b2;

import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập URL muốn truy cập");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập URL muốn truy cập: ");
                    String url = scanner.nextLine();
                    history.push(url);
                    break;
                case 2:
                    if (!history.isEmpty()) {
                        System.out.println("Quay lại URL trước đó: " + history.pop());
                    } else {
                        System.out.println("Lịch sử trống.");
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

