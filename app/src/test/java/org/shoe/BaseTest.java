package org.shoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BaseTest {
    @BeforeEach
    void init() {
        System.out.println("Base Setup");
    }

    @Test
    void test1() {
        System.out.println("test 1");
    }
}
