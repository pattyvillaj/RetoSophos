package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.SophosOpenUpPage;

public class OpenUpPage implements Task {
    private SophosOpenUpPage sophosOpenUpPage;

    public static OpenUpPage thePage() {
        return Tasks.instrumented(OpenUpPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(sophosOpenUpPage));
    }
}


