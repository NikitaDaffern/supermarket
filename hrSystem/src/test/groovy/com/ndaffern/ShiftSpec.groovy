package com.ndaffern

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
 
     when: "A Shift has shiftName, timeOfDay and dayOfWeek"
    
     def shift1=new Shift(shiftName: 'Shift 1', timeOfDay: 'Afternoon', dayOfWeek: 'Tuesday')

     then: "the toString method will merge them."
    
     shift1.toString()=='Shift 1, Afternoon, Tuesday'      

    }
}
