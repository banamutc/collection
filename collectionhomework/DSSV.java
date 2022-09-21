package collectionhomework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class DSSV {
    private ArrayList<SinhVien> studentArrayList;

    public DSSV() {
        this.studentArrayList = new ArrayList<SinhVien>();
    }

    public DSSV(ArrayList<SinhVien> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public void addStudent(SinhVien student) {
        this.studentArrayList.add(student);
    }

    public void removeStudent(String id) {
        SinhVien student = null;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId().equals(id)) {
                student = studentArrayList.get(i);
                break;
            }
        }
        if (student != null) {
            studentArrayList.remove(student);
        } else {
            System.out.println("Ko tồn tại sinh viên có id " + id);
        }
    }

    public boolean checkExistence(SinhVien student) {
        return this.studentArrayList.contains(student);
    }

    public void printListStudent() {
        for (SinhVien elem : studentArrayList) {
            System.out.println(elem.toString());
        }
    }

    public void printStudentHighScore() {
        for (SinhVien student : studentArrayList) {
            if (student.sumScore() >= 20 && student.getMathScore() > 8) {
                System.out.println(student);
            }
        }
    }
}
