package providers;

import java.util.Locale;
import java.util.ResourceBundle;

public class DataProviders {

    public static final String URL = getValue("url");
    public static final String LOGIN = getValue("login");
    public static final String PASSWORD = getValue("password");
    private static final String DATA = "data";

    private static String getValue(String key) {
        return ResourceBundle.getBundle(DataProviders.DATA, Locale.getDefault()).getString(key);
    }


}
