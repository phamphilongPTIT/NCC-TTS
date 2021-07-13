package com.ncc.tts.final_static;

public class TypeStaticDemo {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    static void change() {
        // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
        college = "Đại Học Công Nghệ";
    }

    TypeStaticDemo(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        TypeStaticDemo.change();

        TypeStaticDemo s1 = new TypeStaticDemo(111, "Thông");
        TypeStaticDemo s2 = new TypeStaticDemo(222, "Minh");
        TypeStaticDemo s3 = new TypeStaticDemo(333, "Anh");

        s1.display();
        s2.display();
        s3.display();
    }
}
