package org.example;
import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 22));
        System.out.println(hasTeen(22, 23, 13));
        System.out.println(isCatPlaying(true, 36));
        System.out.println(area(5,-1));
        System.out.println(area(5));
    }
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        boolean sonuc;
        if((clock>=8 && clock<=20) || clock>=23 || clock<=0) {
            sonuc = false;
        } else if ((clock<8 || clock>20) && isBarking == true) {
            sonuc = true;
        } else {
            sonuc = false;
        }
        return sonuc;
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        boolean sonuc;
        if((firstAge>=13 && firstAge<=19) || (secondAge>=13 && secondAge<=19) || (thirdAge>=13 && thirdAge<=19)) {
            sonuc = true;
        } else {
            sonuc = false;
        }
        return sonuc;
    }
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        boolean sonuc;
        if((isSummer == false && (temp>=25 && temp<=35)) || (isSummer == true && (temp>=25 && temp<=45))) {
            sonuc = true;
        } else {
            sonuc = false;
        }
        return sonuc;
    }
    public static double area(double width, double height) {
        double sonuc = width * height;
        if(width<0 || height<0) {
            sonuc = -1;
        }
        return sonuc;
    }
    public static double area(double radius) {
        double sonuc = radius * radius * PI;
        if(radius<0) {
            sonuc = -1;
        }
        return  sonuc;
    }
}
