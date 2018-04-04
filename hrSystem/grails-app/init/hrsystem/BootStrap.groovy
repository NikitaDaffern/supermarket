package com.ndaffern

class BootStrap {

    def init = { servletContext ->

     /*def employee1=new Employee(
     fullName: 'Mark Dunham',
     dateOfBirth: '06/02/1985',
     residence: 'Sheffield',
     hourlyRate: '8.00',
     employeeID: 'MD2837',
     dateEmployed: '23/09/2017',
     taxCode: 'TX256',
     contract: 'Full-time').save()
     
     def employee2=new Employee(
     fullName: 'Simon Dawes',
     dateOfBirth: '12/04/1995',
     residence: 'Barnsley',
     hourlyRate: '7.50',
     employeeID: 'SD3527',
     dateEmployed: '13/01/2018',
     taxCode: 'TX217',
     contract: 'Full-time').save()
    
     def team1=new Team(
     teamName: 'Team Loading',
     numberOfEmployees: '15',
     sectionName: 'Home Entertainment',
     description: 'lorem ipsum',
     employee: employee2).save()

     def team2=new Team(
     teamName: 'Team Stock Check',
     numberOfEmployees: '20',
     sectionName: 'Bakery',
     description: 'lorem ipsum',
     employee: employee1).save()

     def teamleader1=new TeamLeader(
     fullName: 'Jane Doe',
     department: 'Electronics',
     employeeID: 'JD1827',
     team: team1,
     sectionName: 'Home Entertainment',
     officePhone: '02316728',
     leaderEmail: 'JDoe@email.com',
     userName: 'jdoe',
     password: 'Secret1982',
     employee: employee1).save()

     def teamleader2=new TeamLeader(
     fullName: 'Matthew Wilson',
     department: 'Grocery',
     employeeID: 'MW3426',
     team: team2,
     sectionName: 'Bakery',
     officePhone: '02456317',
     leaderEmail: 'MWilson@email.com',
     userName: 'mwilson',
     password: 'Secret2387',
     employee: employee2).save()

     def manager1=new Manager(
     fullName: 'John Smithson',
     userName: 'jsmithson',
     password: 'Secret1425',
     teamleader: teamleader1,
     managerEmail: 'JSmithson@email.com',
     office: 'A2-574',
     department: 'Electronics').save()

     def manager2=new Manager(
     fullName: 'Carol Jones',
     userName: 'cjones',
     password: 'Secret2971',
     teamleader: teamleader2,
     managerEmail: 'CJones@email.com',
     office: 'B4-291',
     department: 'Grocery').save()

    
     def task1=new Task(
     taskName: 'Replenishing',
     numberOfPeople: '5',
     sectionName: 'Bakery',
     department: 'Grocery',
     timeRequired: '2 hours',
     description: 'lorem ipsum',
     taskCompleted: 'no',
     employee: employee1).save()

     def task2=new Task(
     taskName: 'Unloading Stock',
     numberOfPeople: '3',
     sectionName: 'Home Entertainment',
     department: 'Electronics',
     timeRequired: '1 hour',
     description: 'lorem ipsum',
     taskCompleted: 'yes',
     employee: employee2).save()

     def shift1=new Shift(
     shiftName: 'Shift 1',
     timeOfDay: 'Morning',
     dayOfWeek: 'Tuesday',
     numberOfHours: '6',
     startingTime: '12.00am',
     employee: employee2).save()

     def shift2=new Shift(
     shiftName: 'Shift 2',
     timeOfDay: 'Afternoon',
     dayOfWeek: 'Monday',
     numberOfHours: '8',
     startingTime: '12.00pm',
     employee: employee1).save()

     


task1.addToShifts(shift1)
task2.addToShifts(shift1)

team1.addToShifts(shift1)
team2.addToShifts(shift2)

task2.addToShifts(shift2)

task1.addToTeams(team1)
task2.addToTeams(team2)

shift1.addToTeams(team2)
shift2.addToTeams(team1)

team1.addToTasks(task1)
team2.addToTasks(task2)

shift2.addToTasks(task1)
shift1.addToTasks(task2)*/




    }
    def destroy = {
    }
}
