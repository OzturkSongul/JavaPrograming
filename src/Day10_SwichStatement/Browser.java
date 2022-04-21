package Day10_SwichStatement;

public class Browser {
    public static void main(String[] args) {
        String BrowserName = "chrome";
        String result = "";//temporary variable

        boolean ValidBrowser = BrowserName == "chrome" || BrowserName == "firefox"
                || BrowserName == "opera" || BrowserName == "safari";
        if (ValidBrowser) {
            //4 option
            if (BrowserName == "chrome") {
                result = "Chrome Browser is Selected";
            } else if (BrowserName == "firefox") {
                result = "firefox is selected";
            } else if (BrowserName == "opera") {
                result = "opera is selected";

            } else {
                result = "safari is selected";
            }


        } else {
            result = "Invalid Browser Name";
        }

            System.out.println(result);
        }
    }

