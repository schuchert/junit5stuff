package org.shoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DerivedSameNameTest extends BaseTest {
    @BeforeEach
    void init() {
        System.out.println("Derived Setup");
    }

    @Test
    void test2() {
        System.out.println("test 2");
    }
}
