package com.ndaffern

class TeamLeader {

String fullName

String department

String employeeID

Team team

String sectionName

int officePhone

String leaderEmail

String userName

String password

static hasMany=[employees:Employee, managers:Manager]

static belongsTo=[Manager]

    static constraints = {

fullName blank:false, nullable:false

department blank:false, nullable:false

employeeID blank:false, nullable:false, unique:true

sectionName blank:false, nullable:false

officePhone blank:false, nullable:false

leaderEmail blank:false, nullable:false, email:true

userName blank:false, nullable:false, unique:true

password blank:false, nullable:false

    }
}
