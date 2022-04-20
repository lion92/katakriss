package fr.arolla;

import org.assertj.core.internal.Strings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(int input, String expected) {
        //When
        String result = new FizzBuzz().fizzBuzz(input);
        //Then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(3, "Fizz"),
                Arguments.of(5,"Buzz"),
                Arguments.of(15,"FizzBuzz"),
                Arguments.of(17,"17")
        );
    }
    @Test
    public void should_return_exception_when_inferieur_ou_egal_a_zero(){
        //Given
        int number=-1;
        // When
        assertThatThrownBy(() -> new FizzBuzz().fizzBuzz(number))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
