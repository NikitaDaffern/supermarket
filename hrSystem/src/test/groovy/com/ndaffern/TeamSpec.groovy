package com.ndaffern

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
        
    when: "A Team has teamName, numberOfEmployees and sectionName"

    def team1=new Team(teamName: 'Team Loading', numberOfEmployees: '15', sectionName: 'Home Entertainment')

    then: "the toString method will merge them."

    team1.toString()=='Team Loading, 15, Home Entertainment'    

    }
}
