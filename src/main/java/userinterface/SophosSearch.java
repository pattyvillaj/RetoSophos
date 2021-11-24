package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SophosSearch {
    public static final Target OPTION_SEARCH =Target.the("The button Search").located(By.id("s"));
}
