package com.csoftz.test.spring.spock

import org.junit.experimental.categories.Category
import spock.lang.Specification

@Category(UnitTest.class)
class SimpleConditionSpec extends Specification {

    def 'Write an assertion in the then block'() {

        when: 'We create a new list'
        def list = []

        then: 'Should create an empty list'
        list.isEmpty()
        list.size() == 0
    }

    def 'Write an assertion in the expect block'() {

        expect: 'Should return the bigger number'
        Math.max(1, 2) == 2
    }
}