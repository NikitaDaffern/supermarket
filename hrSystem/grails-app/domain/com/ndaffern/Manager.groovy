package com.ndaffern

class Manager {

String fullName

String userName

String password

TeamLeader teamleader

String managerEmail

String office

String department

String toString(){

return fullName
}

static hasMany=[employees:Employee]

    static constraints = {

fullName blank:false, nullable:false

userName blank:false, nullable:false, unique:true

password blank:false, nullable:false

managerEmail blank:false, nullable:false, email:true, unique:true

office blank:false, nullable:false

department blank:false, nullable:false
    }
}
