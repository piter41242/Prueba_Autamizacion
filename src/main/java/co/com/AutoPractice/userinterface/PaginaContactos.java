package co.com.AutoPractice.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class PaginaContactos {

    public static Target SELECT_SUBJECT_HEADING = Target.the("Seleccionar Subject Heading")
            .located(By.id("id_contact"));

    public static Target INPUT_EMAIL = Target.the("Ingresar email")
            .located(By.id("email"));

    public static Target INPUT_ORDER_REFERENCE = Target.the("Ingresar order reference")
            .located(By.id("id_order"));

    public static Target INPUT_ATTACH_FILE = Target.the("Seleccionar archivo")
            .located(By.id("fileUpload"));

    public static Target TEXTAREA_MESSAGE = Target.the("Ingresar mensaje")
            .located(By.id("message"));

    public static Target BTN_SEND = Target.the("Botón Send")
            .located(By.id("submitMessage"));

    public static Target MENSAJE_CONFIRMACION = Target.the("Mensaje de confirmación")
            .located(By.cssSelector("p.alert.alert-success"));

    public static final Target MENSAJE_ERROR = Target.the("Mensaje de error")
            .located(By.cssSelector("div.alert.alert-danger"));

}
