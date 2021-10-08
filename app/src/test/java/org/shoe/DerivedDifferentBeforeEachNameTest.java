package org.shoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DerivedDifferentBeforeEachNameTest extends BaseTest {
    @BeforeEach
    void differentName() {
        System.out.println("Derived Setup");
    }

    @Test
    void test2() {
        System.out.println("test 2");
    }

    @Test
    void assertAllExample() {
        Assertions.assertAll("Description",
                () -> Assertions.assertEquals(false, false),
                () -> Assertions.assertEquals(false, true),
                () -> Assertions.assertEquals(true, true),
                () -> Assertions.assertEquals(true, false)
        );
    }
}
