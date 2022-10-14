package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step1 {
    public static final Target TXT_FIRST_NAME = Target.the("Ingresar nombre").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Ingresar apellido").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Ingresar correo").located(By.id("email"));
    public static final Target TXT_MONTH = Target.the("Selecciona el campo del mes").located(By.id("birthMonth"));
    public static final Target TXT_SELECT_MONTH = Target.the("Selecciona el campo del mes").located(By.xpath("//option[text()='April']"));
    public static final Target TXT_DAY = Target.the("Selecciona el dia").located(By.id("birthDay"));
    public static final Target TXT_SELECT_DAY = Target.the("Selecciona el dia").located(By.xpath("//option[text()='10']"));
    public static final Target TXT_YEAR = Target.the("Selecciona el ano").located(By.id("birthYear"));
    public static final Target TXT_SELECT_YEAR = Target.the("Selecciona el ano").located(By.xpath("//option[text()='1986']"));
    public static final Target BTN_NEXT = Target.the("Siguiente").located(By.xpath("//a[@class='btn btn-blue']"));
}
