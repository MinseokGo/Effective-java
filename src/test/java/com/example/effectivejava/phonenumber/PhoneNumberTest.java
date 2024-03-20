package com.example.effectivejava.phonenumber;

import static org.assertj.core.api.Assertions.*;

import com.example.effectivejava.ch3.item10.PhoneNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PhoneNumberTest {
    private static final PhoneNumber phoneNumber1 = new PhoneNumber((short) 123, (short) 456, (short) 789);
    private static final PhoneNumber phoneNumber2 = new PhoneNumber((short) 123, (short) 456, (short) 789);
    private static final PhoneNumber phoneNumber3 = new PhoneNumber((short) 124, (short) 456, (short) 789);

    @Test
    @DisplayName("동치성을 가진 두 객체는 같다.")
    void test1() {
        assertThat(phoneNumber1.equals(phoneNumber2)).isEqualTo(true);
    }

    @Test
    @DisplayName("동치성을 갖지 못한 두 객체는 다르다.")
    void test2() {
        assertThat(phoneNumber1.equals(phoneNumber3)).isEqualTo(false);
    }
}
