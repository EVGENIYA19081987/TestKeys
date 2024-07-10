package providers;


import java.util.ResourceBundle;



public class ConfigProviders {
    public static final String BROWSER=getValue("browser");
    public static final Integer IMPLICITY_WAIT=Integer.parseInt(getValue("implicity_wait"));

    public static final Integer EXPLICITY_WAIT=Integer.parseInt(getValue("explicity_wait"));
    private static final String CONFIG="config";


    private static String getValue(String key){
        return ResourceBundle.getBundle(ConfigProviders.CONFIG).getString(key);
    }




}
