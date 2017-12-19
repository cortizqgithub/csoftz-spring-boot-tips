package com.csoftz.test.spring.spock

import spock.lang.Specification

@Category(UnitTest.class)
class FileSpec extends Specification {

    def 'Create a new file'() {

        setup:
        def file = new File("/tmp/foo.txt")

        when: 'A new file is created'
        file.createNewFile()

        then: 'Should create a new file'
        file.exists()
        file.isFile()
        !file.isDirectory()

        cleanup:
        file?.delete()
    }
}