package co.com.AutoPractice.utils.hooks;
import cucumber.api.java.Before;

import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
public class HooksEscenario {
    @Before
    public void sepUp(){
        setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }
}
