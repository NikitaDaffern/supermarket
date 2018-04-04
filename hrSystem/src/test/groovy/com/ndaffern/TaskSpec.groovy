package com.ndaffern

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TaskSpec extends Specification implements DomainUnitTest<Task> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
  
     when: "A Task has taskName, numberOfPeople and sectionName"

     def task1=new Task(taskName: 'Replenishing', numberOfPeople: '5', sectionName: 'Bakery')

     then: "the toString method will merge them."

     task1.toString()=='Replenishing, 5, Bakery'       
 
    }
}
