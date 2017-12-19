package com.csoftz.test.spring.spock

import com.csoftz.test.spring.spock.UnitTest
import com.csoftz.test.spring.spock.service.MessageService
import org.junit.experimental.categories.Category
import spock.lang.Specification

@Category(UnitTest.class)
class MessageServiceSpec extends Specification {

    def messageService = new MessageService()

    def 'Get message'() {
        expect: 'Should return the correct message'
        messageService.getMessage() == 'Hello World!'
    }
}
