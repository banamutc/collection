package collectionhomework;

import java.time.LocalDate;
import java.util.Scanner;
import collectionhomework.SinhVien;
import collectionhomework.DSSV;

public class Retry {
    public static Scanner scanner =new Scanner(System.in);
    public static double enterScore () {
        double score = scanner.nextDouble();
        while (score < 0 || score > 10) {
            System.out.print("Nhập lại : ");
            score = scanner.nextDouble();
        }
        return score;
    }
    public static void main(String[] args) {
        DSSV studentList = new DSSV();
        int choose = 0;
        do {
            System.out.println("-------------------MENU------------------------");
            System.out.println("1 - Thêm sinh viên");
            System.out.println("2 - In danh sách sinh viên");
            System.out.println("3 - Xóa sinh viên");
            System.out.println("4 - Sửa sinh viên");
            System.out.println("5 - In danh sách sinh viên có tổng điểm > 20 và điểm toán > 8");
            System.out.println("6 - Thoát");
            System.out.println("Chọn :");
            choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 1) {
                System.out.println("-------------------------------------------");
                System.out.println("Thêm sinh viên !!!");

                System.out.println("Nhập mã sinh viên: ");
                String id = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Nhập họ tên sinh viên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh : ");
                LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
                System.out.println("Nhập tên lớp: ");
                String nameClass = scanner.nextLine();
                System.out.println("Nhập điểm môn toán: ");
                double mathScore = enterScore();
                System.out.println("Nhập điểm môn lý: ");
                double physicsScore = enterScore();
                System.out.println("Nhập điểm môn hóa: ");
                double chemistryScore = enterScore();
                SinhVien students = new SinhVien(id, name, dateOfBirth, nameClass, mathScore, physicsScore, chemistryScore);
                studentList.addStudent(students);
            } else if (choose == 2) {
                System.out.println("-------------------------------------------");
                System.out.println("Danh sách sinh viên !!!");
                studentList.printListStudent();
            } else if (choose == 3) {
                System.out.println("-------------------------------------------");
                System.out.println("Xóa sinh viên !!!");
                System.out.println("Nhập mã sinh viên bạn muốn xóa: ");
                String id = scanner.nextLine();
                studentList.removeStudent(id);
            } else if (choose == 4) {
                System.out.println("-------------------------------------------");
                System.out.println("Sửa sinh viên !!!");
                System.out.println("Nhập mã sinh viên muốn sửa :");
                String id = scanner.nextLine();
                studentList.removeStudent(id);
                System.out.println("Nhập thông tin sinh viên :");
                System.out.println("Nhập họ tên sinh viên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh : ");
                LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
                System.out.println("Nhập tên lớp: ");
                String nameClass = scanner.nextLine();
                System.out.println("Nhập điểm môn toán: ");
                double mathScore = enterScore();
                System.out.println("Nhập điểm môn lý: ");
                double physicsScore = enterScore();
                System.out.println("Nhập điểm môn hóa: ");
                double chemistryScore = enterScore();
                SinhVien students = new SinhVien(id, name, dateOfBirth, nameClass, mathScore, physicsScore, chemistryScore);
                studentList.addStudent(students);
            } else if (choose == 5) {
                System.out.println("-------------------------------------------");
                System.out.println("Danh sách sinh viên có tổng điểm > 20 và điểm toán > 8");
                studentList.printStudentHighScore();
            } else {
                System.out.println("Chỉ chọn từ 1 - 6");
            }
        } while (choose != 6);

    }
}
