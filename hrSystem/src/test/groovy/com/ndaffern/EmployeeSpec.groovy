package com.ndaffern

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void totalhourlyRate () {
        
when: "An Employee has fullName and hourlyRate"

 def employee1=new Employee(fullName: 'Mark Dunham', hourlyRate:8.00)

then: "The calculateDailyWages method will total hourlyRate "

employee1.calculateDailyWages()==64
    }
}
