package week09;

public class EtsSearch {
    public static void main(String[] args) {
        System.out.println("----Starting UI Automation testing for etsy website----");
        openBrowers("chrome");
        navigetetoUrl("http://www.etsy.com");
        searchForItem("java");

        if(verifyItemIsDisplayed().equals("pass"));
        {
            System.out.println("your test case passed");
        }

    }






    public static void openBrowers(String browser) {
        System.out.println("launching " + browser + "browser");
    }
    public static void navigetetoUrl(String url) {
        System.out.println("navigating to " + url);
    }
    public static void searchForItem(String item) {
        System.out.println("pass: verify " + item + " exist");
        System.out.println("click on that " + item);
    }
    public static String verifyItemIsDisplayed(){
        String result= "pass";
        return result;
    }
}
