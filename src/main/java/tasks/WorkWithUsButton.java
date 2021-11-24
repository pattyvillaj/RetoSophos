package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SophosWorkWithUsButton;

public class WorkWithUsButton implements Task {
    private SophosWorkWithUsButton sophosWorkWithUsButton;

    public static WorkWithUsButton onThePage() {
        return Tasks.instrumented(WorkWithUsButton.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(sophosWorkWithUsButton.POP_UP),
                         Click.on(sophosWorkWithUsButton.WORK_BOTTON));

    }
}
