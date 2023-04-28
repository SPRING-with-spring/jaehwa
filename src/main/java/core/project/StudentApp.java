package core.project;

import core.project.rank.RankPolicy;
import core.project.student.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        ApplicationContext ac = new
                AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = ac.getBean(StudentService.class);
        Student a = new Student(1L, "a",230 ,Grade.First,55);
        Student b = new Student(2L, "b",250 ,Grade.First,65);
        Student c = new Student(3L, "c",227 ,Grade.Second,45);
        Student d = new Student(4L, "d",235 ,Grade.Fifth,25);
        Student e = new Student(5L, "e",210 ,Grade.Third,95);
        Student f = new Student(6L, "f",145 ,Grade.Fifth,50);
        Student g = new Student(7L, "g",430 ,Grade.Fourth,18);
        Student h = new Student(8L, "h",500 ,Grade.Sixth,28);
        Student i = new Student(9L, "i",377 ,Grade.Fourth,53);
        Student j = new Student(10L, "j",167 ,Grade.Fourth,24);
        Student k = new Student(11L, "k",234 ,Grade.Seventh,54);
        Student l = new Student(12L, "l",123 ,Grade.Second,46);
        Student m = new Student(13L, "m",456 ,Grade.Ninth,13);
        Student n = new Student(14L, "n",33 ,Grade.Eighth,25);
        Student o = new Student(15L, "o",284 ,Grade.First,1);
        Student p = new Student(16L, "p",114 ,Grade.Seventh,99);
        Student q = new Student(17L, "q",147 ,Grade.Sixth,68);
        Student r = new Student(18L, "r",369 ,Grade.Fifth,75);
        Student s = new Student(19L, "s",159 ,Grade.Eighth,36);
        Student t = new Student(20L, "t",346 ,Grade.Seventh,21);
        Student u = new Student(21L, "u",254 ,Grade.Sixth,67);
        Student v = new Student(22L, "v",195 ,Grade.Ninth,3);
        Student w = new Student(23L, "w",25 ,Grade.Third,4);
        Student x = new Student(24L, "x",7 ,Grade.Fourth,34);
        Student y = new Student(25L, "y",46 ,Grade.Second,22);
        Student z = new Student(26L, "z",389 ,Grade.First,11);
        Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z).forEach(studentService::register);
        String[] rankPolicy = {"gradeRankPolicy", "scoreRankPolicy", "percentileRankPolicy"};
        System.out.println("1 : grade, 2: score, 3: percentile");
        Scanner sc = new Scanner(System.in);
        int rp = sc.nextInt();
        RankPolicy policy = ac.getBean(rankPolicy[rp-1], RankPolicy.class);
        studentService.setRankPolicy(policy);

        Student student = studentService.findStudent(1l);
        System.out.println(student);
        System.out.println("---------------" +rankPolicy[rp-1] + " Rank---------------");
        ArrayList<Student> arrayList = studentService.findTotalRank();
        arrayList.forEach((value)->{
            System.out.println(value);
        });
        System.out.println("student C's rank': " + studentService.rank(c));

    }
}
