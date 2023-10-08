package baitap.baitap2;

import baitap.baitap1.Main;

public record SortingStudent() {
    public static Student[] bubbleSort(Student[] students) {
        for (int i = 0; i <students.length-1 ; i++) {
            for (int j = 0; j < students.length-i-1; j++) {
                      if(students[j+1].getScore() > students[j].getScore()) {
                                swap1(students, j+1,j);
                      }
            }
        }
        return students;
    }

    public  static  Student[]  SelectionSort(Student[] students){
        for (int i = 0; i < students.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < students.length; j++) {
                if (students[j].getScore() > students[minIndex].getScore()) {
                    minIndex = j;
                }
            }
            swap1(students, minIndex, i);

        }
        return  students;
    }


       public  static  Student[] InsertionSort(Student[] students) {
           for (int i = 1; i < students.length; i++) {
               for (int j = i; j > 0 && students[j-1].getScore() < students[j].getScore(); j--) {
                   swap1(students, j - 1, j);
               }
           }
           return students;
       }
    private static void swap1(Student[] student, int i1, int i2) {
        Student temp = student[i1];
        student[i1] = student[i2];
        student[i2] = temp;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Toản", 3);
        students[1] = new Student(2, "Tiến", 10);
        students[2] = new Student(3, "Nam", 9);



        System.out.println("Danh sách học viên trước khi sắp xếp:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
        bubbleSort(students);
        System.out.println("Danh sách sau khi sắp xếp nổi bọt: ");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }

        SelectionSort(students);
        System.out.println("Danh sách sau khi sắp xếp lựa chọn: ");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
        InsertionSort(students);
        System.out.println("Danh sách sau khi sắp xếp chèn: ");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}
