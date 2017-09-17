package com.onua.blockchain

import spock.lang.Specification

class ApplicationSpec extends Specification{

    def "Test application"(){

        given: "Some arbitrary message"
        def message = 'Hello world'

        when: "the message is invoked"
        message

        then:
        noExceptionThrown()
    }

    def "Test application 2"(){

        given: "Some arbitrary message"
        def message = 'Hello world'

        when: "the message is invoked"
        message

        then:
        noExceptionThrown()
    }


    def throwException(){
        throw new RuntimeException('Something bad')
    }
}
