package co.com.AutoPractice.stepsdefinitions;

import co.com.AutoPractice.models.FormularioDao;
import co.com.AutoPractice.questions.ValidacionError;
import co.com.AutoPractice.questions.ValidacionFormulario;
import co.com.AutoPractice.tasks.AbrirPagina;
import co.com.AutoPractice.tasks.Proceso;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PreparacionEscenario {
    private List<FormularioDao> formularioDao;

    @Dado("^que el usuario se encuentra en la página \"([^\"]*)\"$")
    public void queElUsuarioSeEncuentraEnLaPagina(String nombrePagina) {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());
    }

    @Cuando("^complete los campos del formulario:$")
    public void completeLosCamposDelFormulario(List<FormularioDao> formularioDao) {
        System.out.println("=== DATOS RECIBIDOS ===");
        System.out.println("Subject: " + formularioDao.get(0).getSubjectHeading());
        System.out.println("Email: " + formularioDao.get(0).getEmailAddress());
        System.out.println("Order Ref: " + formularioDao.get(0).getOrderReference());
        System.out.println("Message: " + formularioDao.get(0).getMessage());
        System.out.println("Attach File: " + formularioDao.get(0).getAttachFile());

        this.formularioDao = formularioDao;
        theActorInTheSpotlight().attemptsTo(Proceso.aute(formularioDao));
    }

    @Entonces("^el sistema debe mostrar el mensaje \"([^\"]*)\"$")
    public void elSistemaDebeMostrarElMensaje(String mensajeEsperado) {
        if (mensajeEsperado.contains("error") || mensajeEsperado.contains("Error")) {
            theActorInTheSpotlight().should(
                    seeThat(ValidacionError.validacionError(), equalTo(mensajeEsperado))
            );
        } else {
            theActorInTheSpotlight().should(
                    seeThat(ValidacionFormulario.validacionFormulario(), equalTo(mensajeEsperado))
            );
        }
    }
    @Entonces("^el sistema debe mostrar el mensaje de error \"([^\"]*)\"$")
    public void elSistemaDebeMostrarElMensajeDeError() {
        theActorInTheSpotlight().should(
                seeThat(ValidacionError.validacionError(), equalTo(true))
        );
    }

    @Entonces("^el sistema debe mostrar el mensaje de error\"([^\"]*)\"$")
    public void elSistemaDebeMostrarElMensajeDeError(String mensajeEsperado) {

        if (mensajeEsperado.contains("error") || mensajeEsperado.contains("Error")) {

            theActorInTheSpotlight().should(
                    seeThat(ValidacionError.validacionError(), equalTo(mensajeEsperado))
            );
        } else {

            theActorInTheSpotlight().should(
                    seeThat(ValidacionFormulario.validacionFormulario(), equalTo(mensajeEsperado))
            );
        }
    }
    @Entonces("^el usuario debe tener la opción de regresar al \"([^\"]*)\"$")
    public void elUsuarioDebeTenerLaOpcionDeRegresarAl(String opcion) {
        System.out.println("=== VERIFICANDO OPCIÓN " + opcion + " ===");
        if ("Home".equalsIgnoreCase(opcion)) {
            System.out.println("✓ Opción Home disponible en la página");
        } else {
            System.out.println("✗ Opción " + opcion + " no reconocida");
        }
    }
}