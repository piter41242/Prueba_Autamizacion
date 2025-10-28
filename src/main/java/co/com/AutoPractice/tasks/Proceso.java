package co.com.AutoPractice.tasks;

import co.com.AutoPractice.models.FormularioDao;

import co.com.AutoPractice.userinterface.PaginaContactos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Proceso implements Task {
    private List<FormularioDao> formularioDao;

    public Proceso(List<FormularioDao> formularioDao) {
        this.formularioDao = formularioDao;
    }

    public static Proceso aute(List<FormularioDao> formularioDao) {
        return Instrumented.instanceOf(Proceso.class).withProperties(formularioDao);
    }

    String Numero = RandomStringUtils.random(2, false, true);

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PaginaContactos.SELECT_SUBJECT_HEADING),
                SelectFromOptions.byVisibleText(formularioDao.get(0).getSubjectHeading()).from(PaginaContactos.SELECT_SUBJECT_HEADING),
                Click.on(PaginaContactos.INPUT_EMAIL),
                Enter.theValue(formularioDao.get(0).getEmailAddress()).into(PaginaContactos.INPUT_EMAIL),
                Click.on(PaginaContactos.INPUT_ORDER_REFERENCE),
                Enter.theValue(formularioDao.get(0).getOrderReference()).into(PaginaContactos.INPUT_ORDER_REFERENCE),
                subirArchivoSiExiste(formularioDao.get(0).getAttachFile()),
                Click.on(PaginaContactos.TEXTAREA_MESSAGE),
                Enter.theValue(formularioDao.get(0).getMessage()).into(PaginaContactos.TEXTAREA_MESSAGE),


                Click.on(PaginaContactos.BTN_SEND)
        );


        theActorInTheSpotlight().remember("email_enviado", formularioDao.get(0).getEmailAddress());
        theActorInTheSpotlight().remember("mensaje_enviado", formularioDao.get(0).getMessage());
        theActorInTheSpotlight().remember("subject_heading", formularioDao.get(0).getSubjectHeading());
    }
    private Task subirArchivoSiExiste(String nombreArchivo) {
        if (nombreArchivo != null && !nombreArchivo.trim().isEmpty()) {
            try {
                File archive = new File("src/test/resources/files/" + nombreArchivo);
                if (archive.exists()) {
                    System.out.println("=== SUBIENDO ARCHIVO: " + nombreArchivo + " ===");

                    return new Task() {
                        @Override
                        public <T extends Actor> void performAs(T actor) {
                            Upload.theFile(archive.toPath())
                                    .to(PaginaContactos.INPUT_ATTACH_FILE)
                                    .performAs(actor);
                        }
                    };
                } else {
                    System.out.println("=== ARCHIVO NO ENCONTRADO: " + nombreArchivo + " ===");
                }
            } catch (Exception e) {
                System.out.println("=== ERROR AL SUBIR ARCHIVO: " + e.getMessage() + " ===");
            }
        }
        return Task.where("No se subió archivo: " + nombreArchivo);
    }
}
