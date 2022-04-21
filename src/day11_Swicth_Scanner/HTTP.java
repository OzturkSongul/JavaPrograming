package day11_Swicth_Scanner;

public class HTTP {
    public static void main(String[] args) {

        int statusCode= 202;
        String result= "";
        switch (statusCode) {
            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                result = "Moved Premanently";
                break;
            default:
                result = "See Other";}
                System.out.println(result);

        }
        }


