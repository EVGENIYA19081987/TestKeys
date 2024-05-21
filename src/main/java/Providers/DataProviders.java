package Providers;

import java.util.ResourceBundle;

public class DataProviders {

    public static final String URL=getValue("url");
    public static final String LOGIN=getValue("login");
    public static final String PASSWORD=getValue("password");
    public static final String DATA=getValue("data");

            public static String getValue(String key){
        return ResourceBundle.getBundle(DataProviders.URL).getString(key);
            }
}
