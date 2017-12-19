package com.csoftz.test.spring.spock

import com.csoftz.test.spring.spock.service.MessageService
import spock.lang.Specification

class UnCategorizedSpec extends Specification {

    def messageService = new MessageService()

    def 'Should not be run'() {
        expect: 'Should return the correct message'
        messageService.getMessage() == 'Hello World!'
    }
}