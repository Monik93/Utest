package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LastPage {
    public static final Target LBL_MENS = Target.the("boton de ingreso").located(By.xpath("//div[@class='image-box-header']"));
}
