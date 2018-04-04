package com.ndaffern

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamLeaderSpec extends Specification implements DomainUnitTest<TeamLeader> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
        
    when: "A TeamLeader has fullName, employeeID and department"

    def teamleader1=new TeamLeader(fullName: 'Jane Doe', employeeID: 'JD1827', department: 'Electronics')

    then: "the toString method will merge them."

    teamleader1.toString()=='Jane Doe, JD1827, Electronics'    

    }
}
