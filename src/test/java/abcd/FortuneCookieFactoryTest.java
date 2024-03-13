package abcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ttt.FortuneConfig;
import ttt.FortuneCookieFactory;

import java.util.ArrayList;

public class FortuneCookieFactoryTest {

    // ��������, ��� ������� ������� � ������� ������������� �� ������� ����� ����� ���������� ��������.
    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        java.util.ArrayList<String> goodFortune = new ArrayList<>();
        goodFortune.add("�������1");
        goodFortune.add("�������2");
        ArrayList<String> badFortune = new ArrayList<>();
        badFortune.add("�������1");
        badFortune.add("�������2");
        FortuneCookieFactory fortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(false),
                goodFortune,
                badFortune
        );
        fortuneCookieFactory.bakeFortuneCookie();
        Assertions.assertEquals(1, fortuneCookieFactory.getCookiesBaked());

    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        java.util.ArrayList<String> goodFortune = new ArrayList<>();
        goodFortune.add("�������1");
        goodFortune.add("�������2");
        ArrayList<String> badFortune = new ArrayList<>();
        badFortune.add("�������1");
        badFortune.add("�������2");
        FortuneCookieFactory fortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(false),
                goodFortune,
                badFortune
        );
        fortuneCookieFactory.bakeFortuneCookie();
        fortuneCookieFactory.bakeFortuneCookie();
        Assertions.assertEquals(2, fortuneCookieFactory.getCookiesBaked());


    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        java.util.ArrayList<String> goodFortune = new ArrayList<>();
        goodFortune.add("�������1");
        goodFortune.add("�������2");
        ArrayList<String> badFortune = new ArrayList<>();
        badFortune.add("�������1");
        badFortune.add("�������2");
        FortuneCookieFactory fortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(false),
                goodFortune,
                badFortune
        );
        fortuneCookieFactory.bakeFortuneCookie();
        fortuneCookieFactory.bakeFortuneCookie();
        fortuneCookieFactory.resetCookiesCreated();
        Assertions.assertEquals(0, fortuneCookieFactory.getCookiesBaked());
    }
}
