package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step4 {

    public static final Target TXT_PASS = Target.the("PASS").located(By.id("password"));
    public static final Target TXT_CONF_PASS = Target.the("PASS").located(By.id("confirmPassword"));
    public static final Target CHK_INFO = Target.the("PASS").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CHK_TERMS = Target.the("PASS").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CHK_PRIV = Target.the("PASS").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));

    public static final Target BTN_CONTINUE = Target.the("PASS").located(By.xpath("//a[@class='btn btn-blue']"));
}
