package co.com.choucair.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.certification.utest.userinterfaces.LastPage.LBL_MENS;

public class ValidateMens implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return "Welcome to the world's largest community of freelance software testers!".equals(Text.of(LBL_MENS).viewedBy(actor).asString());
    }

    public static ValidateMens valMens(){
        return new ValidateMens();
    }
}
