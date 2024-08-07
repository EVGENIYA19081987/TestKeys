package providers;

import java.util.ResourceBundle;

public class ConfigProviders {

    public static final Integer EXPLICITY_WAIT = Integer.parseInt(getValue("explicity_wait"));

    private static final String CONFIG = "config";

    private static String getValue(String key) {
        return ResourceBundle.getBundle(ConfigProviders.CONFIG).getString(key);
    }
}
