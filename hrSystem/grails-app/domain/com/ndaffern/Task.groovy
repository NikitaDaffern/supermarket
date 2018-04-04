package com.ndaffern

class Task {

String taskName

int numberOfPeople

String sectionName

String department

String timeRequired

String description

String taskCompleted

String toString(){

return "$taskName,$numberOfPeople,$sectionName"
}

static hasMany=[employees:Employee, teams:Team, shifts:Shift]

static belongsTo=[Shift]

    static constraints = {

taskName blank:false, nullable:false

numberOfPeople blank:false, nullable:false, min:0, max:50

sectionName blank:false, nullable:false

department blank:false, nullable:false

timeRequired blank:false, nullable:false

description blank:false, nullable:false, maxSize:5000, widget:'textarea'

taskCompleted blank:false, nullable:false

    }
}
