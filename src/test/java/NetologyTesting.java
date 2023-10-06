import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.Main;

public class NetologyTesting {
    @BeforeAll
    public static void greeting() {
        System.out.println("Начинаем тестирование кода");
    }

    @ParameterizedTest
    @CsvSource({"ABBCCCDD, 2, true", "ABBCCCDD, 3, false"})
    void testRepeats(String source, int size, boolean isTrue) {
        Assertions.assertEquals(Main.hasRepeats(source, size), isTrue);


    }

    @AfterAll
    public static void bye_bye() {
        System.out.println("Tesing is finished. Bye!");
    }
}
