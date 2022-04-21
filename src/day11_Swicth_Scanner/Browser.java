package day11_Swicth_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName= "firefox";
        switch(browserName) {
            case "chrome":
                System.out.println("Chrome");
                break;
            case "firefox":
                System.out.println("firefox");
                break;
            case "opera":
                System.out.println("Opera");
                break;
            case "safari":
                System.out.println("safari");
                break;
            case "edge":
                System.out.println("edge");

            default:
                System.out.println("invalid browser");
        }
        }
    }

