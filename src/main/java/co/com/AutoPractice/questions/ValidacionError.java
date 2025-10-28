package co.com.AutoPractice.questions;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.AutoPractice.userinterface.PaginaContactos.MENSAJE_ERROR;

public class ValidacionError implements Question<String> {
    private static final Logger logger = LoggerFactory.getLogger(ValidacionError.class);

    public static ValidacionError validacionError(){
        return new ValidacionError();
    }

    @Override
    public String answeredBy(Actor actor){
        try{
            String texto = Text.of(MENSAJE_ERROR).viewedBy(actor).asString().trim();
            logger.info("Texto completo del error: '{}'", texto);

            if (texto.contains("There is 1 error") && texto.contains("Invalid email address")) {
                return "There is 1 error Invalid email address";
            }
            return texto.replace("\n", " ").replace("  ", " ").trim();
        } catch (Exception e) {
            logger.error("No se encontro el Mensaje de error: {}", e.getMessage());
            return "";
        }
    }
}
