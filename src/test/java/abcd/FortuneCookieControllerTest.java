package abcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ttt.FortuneConfig;
import ttt.FortuneCookie;
import ttt.FortuneCookieFactory;

import java.util.ArrayList;

public class FortuneCookieControllerTest {
    @Test
    public void shouldReturnPositiveFortune() {
        java.util.ArrayList<String> goodFortune = new ArrayList<>();
        goodFortune.add("позитив1");
        goodFortune.add("позитив2");
        ArrayList<String> badFortune = new ArrayList<>();
        badFortune.add("негатив1");
        badFortune.add("негатив2");
        FortuneCookieFactory fortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(true),
                goodFortune,
                badFortune
        );
        FortuneCookie fortuneCookie = fortuneCookieFactory.bakeFortuneCookie();
        Assertions.assertTrue(goodFortune.contains(fortuneCookie.getFortuneText()));
    }

    @Test
    public void shouldReturnNegativeFortune() {
        java.util.ArrayList<String> goodFortune = new ArrayList<>();
        goodFortune.add("позитив1");
        goodFortune.add("позитив2");
        ArrayList<String> badFortune = new ArrayList<>();
        badFortune.add("негатив1");
        badFortune.add("негатив2");
        FortuneCookieFactory fortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(false),
                goodFortune,
                badFortune
        );
        FortuneCookie fortuneCookie = fortuneCookieFactory.bakeFortuneCookie();
        Assertions.assertTrue(badFortune.contains(fortuneCookie.getFortuneText()));
    }
}