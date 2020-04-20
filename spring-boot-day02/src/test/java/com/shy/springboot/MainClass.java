package com.shy.springboot;

/**
 * @author 石皓岩
 * @create 2020-03-12 17:56
 * 描述：
 */
public class MainClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        double add = teacher.add(1.0, 2.0);
        double sub = teacher.sub(3.0, 2.0);
        System.out.println("add="+add+"   sub="+sub);
        Student student = new Student();
        student.speak();

    }
}
