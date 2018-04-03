package com.ndaffern

class Shift {

String shiftName

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

String toString(){

return shiftName
}

static hasMany=[employees:Employee, teams:Team, tasks:Task]

static belongsTo=[Employee]

    static constraints = {

timeOfDay blank:false, nullable:false

dayOfWeek blank:false, nullable:false

numberOfHours blank:false, nullable:false

startingTime blank:false, nullable:false
    }
}
