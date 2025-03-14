package com.ybh.designpattern.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Singleton1Test {
    @Test
    void singleton1() {
        // given
        Singleton1 singleton1 = Singleton1.getSingleton1();
        Singleton1 singleton11 = Singleton1.getSingleton1();

        // when
        // then
        Assertions.assertThat(singleton1).isSameAs(singleton11);
    }

}