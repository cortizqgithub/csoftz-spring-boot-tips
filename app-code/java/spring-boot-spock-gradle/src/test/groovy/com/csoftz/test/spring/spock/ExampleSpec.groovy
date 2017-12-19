package com.csoftz.test.spring.spock

import com.csoftz.test.spring.spock.service.MessageService
import org.junit.experimental.categories.Category
import spock.lang.Shared
import spock.lang.Specification

@Category(UnitTest.class)
class ExampleSpec {
    //Constants
    static MESSAGE = 'Hello World!'
    def messageService = new MessageService()
    @Shared sharedObject = new Object()

    //Fields
    //Fixture methods
    def setupSpec() {
        println 'Before the first feature method'
    }

    def setup() {
        println 'Before every feature method'
    }

    def cleanup() {
        println 'After every feature method'
    }

    def cleanupSpec() {
        println 'After the last feature method'
    }

    //Feature methods
    def 'Get message one'() {
        println 'First feature method'
        println 'unique object: ' + messageService
        println 'shared object: ' + sharedObject

        expect: 'Should return the correct message'
        messageService.getMessage() == MESSAGE
    }

    def 'Get message two'() {
        println 'Second feature method'
        println 'unique object: ' + messageService
        println 'shared object: ' + sharedObject

        expect: 'Should return the correct message'
        messageService.getMessage() == MESSAGE
    }

    def 'A feature method'() {
        //setup block
        //when and then blocks
        //expect block
        //cleanup block
        //where block
    }

    //Helper methods
}
