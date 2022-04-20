package fr.arolla;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

public class        MyClassTest {

    @Test
    public void test() {
        final var sut = new MyClass();

        final var result = sut.isOne();

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testReflectivite() throws NoSuchMethodException {
        Method isOne = MyClass.class.getMethod("isOne", null);

        assertThat(isOne).isNotNull();
    }
}
