import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class parameterCIUTest {

    private String emailAProbar;
    private boolean resultadoEsperado;

    public parameterCIUTest(String email, boolean resultado) {
        this.emailAProbar = email;
        this.resultadoEsperado = resultado;
    }

    @Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {"jorgesys@tototita.com", true},
            {"jorgesys@tototitacom", false},
            {"jorgesystototita.com", false},
            {"@jorgesystototita.com", false},
            {".jorgesystototita@com", false}
        });
    }

    public static boolean ValidarMail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-_]+(\\.[A-Za-z0-9-_]+)*@[A-Za-z0-9-_]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    @Test
    public void testValidarEmail() {
        System.out.println("Testeando email: " + emailAProbar + " | Esperado: " + resultadoEsperado);
        assertEquals(resultadoEsperado, ValidarMail(emailAProbar));
    }
}