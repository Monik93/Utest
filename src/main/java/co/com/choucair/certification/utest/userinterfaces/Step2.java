package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step2 {
    public static final Target TXT_CITY = Target.the("Campo ciudad").located(By.id("city"));
    public static final Target TXT_ZIP = Target.the("Campo ZIP").located(By.id("zip"));
    public static final Target BTN_CITY = Target.the("boton siguiente").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
