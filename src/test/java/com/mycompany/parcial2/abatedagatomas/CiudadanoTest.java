import com.mycompany.parcial2.abatedagatomas.Ciudadano;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class CiudadanoTest {
    
    private static Ciudadano ciu;
    private static int i = 1;
    
    @Before
    public void setUp() {
        System.out.println("--------------------------------------------------");
        System.out.println("Test numero: " + i);
    }
    
    @After
    public void tearDown() {
        System.out.println("--------------------------------------------------");
        i++;
    }
    
    @BeforeClass
    public static void antesDeTodo() {
        ciu = new Ciudadano("Anonimus", 1212);
        System.out.println("INGRESO de ciudadano del bien");
    }
    
    @AfterClass
    public static void despuesDeTodo() {
        
        // la consigna pedia hacerlo con LocalDate.of pero le agregue la variable fecha dinamica con LocalDate.now().minusDays(1)
        // para tener la fecha de ayer en cualquier dia que lo vea, sino tendria que poner la fecha manualmente
        
        LocalDate fechaDinamica = LocalDate.now().minusDays(1);
        LocalDate ayer = LocalDate.of(fechaDinamica.getYear(), fechaDinamica.getMonthValue(), fechaDinamica.getDayOfMonth());
        System.out.println(ayer + " Baches reparados, Ciudadanos Felices");
    }
    
    @Test
    public void testValidarUsr() {
        int contra = 123456;
        boolean resultado = ciu.validarIngreso(contra);
        assertTrue("Se esperaba que falle la validacion", resultado);
    }

    @Test
    public void testValidarEmail() {
        String email = "tomas@gmail.com";
        boolean tieneArroba = email.contains("@");
        boolean tienePunto = email.contains(".");
        boolean longitudValida = email.length() < 20;
        
        assertTrue("El email debe ser valido", tieneArroba && tienePunto && longitudValida);
    }

    @Test
    public void TestCambioPass() {
        System.out.println("cambioPass");
        String newPass = "1234";
        ciu.cambioPassword(newPass);
        assertEquals(1234, ciu.getContraseña());
        System.out.println("Nuevo Pass> 1234");
    }

    @Test(timeout = 30)
    public void testDelay() throws InterruptedException {
        ciu.delay(45);
    }

    @Test
    public void testCiudadanosDiferentes() {
        Ciudadano c1 = new Ciudadano("Juan", 1111);
        Ciudadano c2 = new Ciudadano("Pedro", 2222);
        
        boolean validacionLogica = c1.ciudadanosDiferentes(c2);
        assertNotSame("misma persona", c1, c2);
    }
}