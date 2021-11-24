package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.concurrent.atomic.AtomicInteger;

public class SophosPrintOffers {



    public static By findTitle(AtomicInteger position){
        return By.xpath("(//div[@class='elementor-post__card'])["+position+"]/div/h3/a");
    }
    public static By findDate(AtomicInteger position){
        return By.xpath("(//div[@class='elementor-post__card'])["+position+"]/div/span[1]");
    }
    public static By findDescription(AtomicInteger position){
        return By.xpath("(//div[@class='elementor-post__card'])["+position+"]/div/div/p");
    }
    public static final Target FIND_NOT_OFFER = Target.the("It seems we can not find what you're looking").located(By.xpath("//div[@class='elementor-posts-nothing-found']"));
    public static final By OPTIONS_DRAWER = By.xpath("(//div[@class='elementor-post__card'])");
}


