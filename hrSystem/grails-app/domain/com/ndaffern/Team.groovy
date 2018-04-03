package com.ndaffern

class Team {

String teamName

int numberOfEmployees

String sectionName

String description

static hasMany=[employees:Employee, shifts:Shift, tasks:Task, teamleaders:TeamLeader]

static belongsTo=[TeamLeader]

    static constraints = {

teamName blank:false, nullable:false

numberOfEmployees blank:false, nullable:false, min:0, max:100

sectionName blank:false, nullable:false

description blank:false, nullable:false, maxSize:5000, widget:'textarea'

    }
}
