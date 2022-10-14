package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step3 {
    public static final Target BTN_DEVICES = Target.the("boton de dispositivos").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
