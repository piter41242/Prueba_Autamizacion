package co.com.AutoPractice.questions;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.AutoPractice.userinterface.PaginaContactos.MENSAJE_CONFIRMACION;

public class ValidacionFormulario implements Question<String> {
    private static final Logger logger = LoggerFactory.getLogger(ValidacionFormulario.class);
    private static final String MENSAJE_ESPERADO = "Your message has been successfully sent to our team.";
    public static ValidacionFormulario validacionFormulario(){
        return new ValidacionFormulario();
    }

    @Override
    public String answeredBy(Actor actor){
        try{
            String texto = Text.of(MENSAJE_CONFIRMACION).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_CONFIRMACION: "+texto);
            return texto;
        } catch (Exception e) {
            logger.error("No se encontro el Mensaje: "+e.getMessage());
            return "";
        }
    }
}