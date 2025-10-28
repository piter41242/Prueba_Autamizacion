package co.com.AutoPractice.tasks;

import co.com.AutoPractice.userinterface.InicioPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    InicioPractice inicioPractice;

    public static AbrirPagina lapagina() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioPractice));
    }
}
