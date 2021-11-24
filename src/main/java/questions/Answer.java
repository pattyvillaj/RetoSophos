package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import userinterface.SophosPrintOffers;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Answer implements Question {


    public static Answer toThe() {
        return new Answer();
    }

    @Override
    public Object answeredBy(Actor actor) {

        List<WebElementFacade> itemLabels = BrowseTheWeb.as(actor)
                .findAll(SophosPrintOffers.OPTIONS_DRAWER);

        if(itemLabels.size()==0){
            System.out.println(Text.of(SophosPrintOffers.FIND_NOT_OFFER).viewedBy(actor).asString());
            return false;
        }

        AtomicInteger position = new AtomicInteger(1);
        itemLabels.forEach(item ->{

            System.out.println(item.getWrappedElement().findElement(SophosPrintOffers.findTitle(position)).getText());//title
            System.out.println(item.getWrappedElement().findElement(SophosPrintOffers.findDate(position)).getText()); //date
            System.out.println(item.getWrappedElement().findElement(SophosPrintOffers.findDescription(position)).getText()); //description
            position.getAndIncrement();
        });

        return true;
    }
}
