package com.ndaffern

class Task {

String taskName

Int numberOfPeople

String sectionName

String department

String timeRequired

String description

Boolean taskCompleted

    static constraints = {

taskName blank:false, nullable:false

numberofPeople blank:false, nullable:false

sectionName blank:false, nullable:false

department blank:false, nullable:false

timeRequired blank:false, nullable:false

description blank:false, nullable:false, maxSize:5000, widget:'textarea'

taskCompleted blank:false, nullable:false

    }
}
