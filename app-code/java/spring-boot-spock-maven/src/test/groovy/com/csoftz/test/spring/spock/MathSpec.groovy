package com.csoftz.test.spring.spock

import spock.lang.Specification

@Category(UnitTest.class)
class MathSpec extends Specification {

    def 'Get the bigger number'() {

        expect: 'Should return the bigger number'
        Math.max(1, 0) == 1
        Math.max(2, 3) == 3
    }

    def 'Get the bigger number 2'() {

        expect: 'Should return the bigger number'
        Math.max(a, b) == c

        where:
        a | b || c
        1 | 0 || 1
        2 | 3 || 3
    }

    def 'Get the bigger number 3'() {

        expect: 'Should return the bigger number'
        Math.max(a, b) == c

        where:
        a << [1, 2]
        b << [0, 3]
        c << [1, 3]
    }
}