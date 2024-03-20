package com.example.effectivejava.ch3.item10.point;

import java.awt.Color;

public class PointExample {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        ColorPoint cp2 = new ColorPoint(1, 2, Color.BLUE);

        // 대칭성은 지켜지지만
        System.out.println(p.equals(cp));
        System.out.println(p.equals(cp2));
        System.out.println(cp.equals(p));

        // 추이성이 위배됨 (추이성 : x와 y가 같고 y와 z가 같으면 x와 z는 같다.)
        // p는 cp와 cp2와 대칭을 이루지만
        // cp는 cp2와 추이성을 이루지 못함
        System.out.println(cp.equals(cp2));

        // 무한 재귀 위험
        SmellPoint sp = new SmellPoint(1, 2, Smell.WEAK);
        // ColorPoint.equals 는 SmellPoint.equals 를
        // SmellPoint.equals 는 ColorPoint.equals 를 호출 하기 때문에 재귀에 빠짐
        // StackOverflowError!!
        //System.out.println(cp.equals(sp));
    }
}
