package providers;
// todo лишняя строка

import java.util.ResourceBundle;
// todo лишняя строка
// todo лишняя строка

public class ConfigProviders {
    // todo неиспользуемый код
    public static final String BROWSER=getValue("browser");
    // todo неиспользуемый код
    public static final Integer IMPLICITY_WAIT=Integer.parseInt(getValue("implicity_wait"));

    public static final Integer EXPLICITY_WAIT=Integer.parseInt(getValue("explicity_wait"));
    private static final String CONFIG="config";
    // todo лишняя строка

    private static String getValue(String key){
        return ResourceBundle.getBundle(ConfigProviders.CONFIG).getString(key);
    }
// todo лишняя строка
// todo лишняя строка
// todo лишняя строка
// todo лишняя строка
}
