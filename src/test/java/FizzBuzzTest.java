import org.junit.*;

public class FizzBuzzTest {

    @Test
    public void should_return_buzz_when_number_is_divisible_by_3() {
        String value = FizzBuzz.check(3);

        Assert.assertEquals("Fizz", value);
    }

    @Test
    public void should_return_buzz_when_number_is_divisible_by_5() {
        String value = FizzBuzz.check(5);

        Assert.assertEquals("Buzz", value);
    }

    @Test
    public void should_return_buzz_when_number_is_divisible_by_3_and_5() {
        String value = FizzBuzz.check(15);

        Assert.assertEquals("FizzBuzz", value);
    }

    @Test
    public void should_return_empty_when_number_is_not_divisible_by_3_or_5() {
        String value = FizzBuzz.check(17);

        Assert.assertEquals("", value);
    }

    /*
        TODO: 2
        Write tests to find convert "Fizz, Buzz or FizzBuzz to it's minimum number."
        For Fizz, the number is 3
        For Buzz, the number is 5
        For FizzBuzz, the number is 3 * 5
     */

}
