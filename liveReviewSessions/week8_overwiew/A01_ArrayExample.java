package week8_overwiew;

public class A01_ArrayExample {
    public static void main(String[] args) {

        int code = 200;
        int[] codes = new int[8];//my codes array holds 8 elements, they are all int
        System.out.println("...............size of any array.............");

        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};

        System.out.println("the size of our array: " + statusCodes.length);
        int sizeOfArray = statusCodes.length;// use it for creating loop

        String[] responseType = new String[]{"ok", "created", "No content", "Bad Request", "forbidden", "not found", "internal server Error"};

        for (int i = 0; i < sizeOfArray; i++) {
            String text = statusCodes[i] + " : " + responseType[i];
            System.out.println("each status codes means=" + text);

        }
    }



    }

