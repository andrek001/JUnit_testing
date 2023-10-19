package ru.netology;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
    @BeforeAll
    public static void greeting() {
        System.out.println("Начинаем тестирование кода");
    }

    @ParameterizedTest
    @CsvSource({"ABBCCCDD, 2, true", "ABBCCCDD, 3, false"})
    void test_hasRepeats_CSV(String source, int size, boolean isTrue) {
        Assertions.assertEquals(Main.hasRepeats(source, size), isTrue);


    }
    @Test
    void test_hasRepeats_Positive() {
        Assertions.assertTrue(Main.hasRepeats("ABFFFDAB", 2));
    }

    @AfterAll
    public static void bye_bye() {
        System.out.println("Tesing is finished. Bye!");
    }
}
