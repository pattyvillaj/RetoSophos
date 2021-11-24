package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SophosWorkWithUsButton {

    public static final Target WORK_BOTTON = Target.the("The button Work with us").located(By.xpath("//li[contains(@id,'mega-menu-item-1541')]/a[contains(.,'Trabaja Con Nosotros')]"));
    public static final Target POP_UP = Target.the("Popup").located(By.xpath("//div[contains(@class,'sg-popup-builder-content')]"));
}
