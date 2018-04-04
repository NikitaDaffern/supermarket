package com.ndaffern

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ManagerSpec extends Specification implements DomainUnitTest<Manager> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {

     when: "A Manager has fullName, userName and department"

     def john=new Manager(fullName: 'John Smithson', userName: 'jsmithson', department: 'Electronics')

     then: "the toString method will merge them. "

     john.toString()=='John Smithson, jsmithson, Electronics'
        
    }
}
