package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.SophosSearch;

public class Search implements Task {
    private String keyWord;

    public Search (String keyWord){
        this.keyWord = keyWord;

    }


    public static Search theUser(String keyWord){
        return Tasks.instrumented(Search.class, keyWord);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.keyWord).into(SophosSearch.OPTION_SEARCH),
                Hit.the(Keys.ENTER).into(SophosSearch.OPTION_SEARCH)
        );

    }
}
