<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket HR system | Home Page</title>

    <asset:stylesheet src="home.css"/>
</head>
<body>

    

    <div id="content" role="main">
        
        <section class="row colset-2-its">
            <h1>Supermarket HR System</h1>

    
        </section>
 
     <div class="row">
     <div class="first">
     
       <h3>Employees</h3>

    <p>Add/register new employees into the HR system. Display a list of current employees within the company.</p>

       <button type="button" class="btn btn-success">

          <g:link controller="employee" action="create">Add Employee</g:link>
       
       </button>


    </div>

   
     <div class="second">
     
       <h3>Managers</h3>

    <p>Add/register new managers into the HR system. Display a list of current managers within the company.</p>

       <button type="button" class="btn btn-success">

          <g:link controller="manager" action="create">Add Manager</g:link>
       
       </button>


    </div>

     
       <div class="first">
     
       <h3>Shifts</h3>

    <p>Add/register new shifts into the HR system. Display a list of current shifts within the company.</p>

       <button type="button" class="btn btn-success">

          <g:link controller="shift" action="create">Add Shift</g:link>
       
       </button>


    </div>

    
     <div class="second">
     
       <h3>Tasks</h3>

    <p>Add/register new tasks into the HR system. Display a list of current tasks within the company.</p>

       <button type="button" class="btn btn-success">

          <g:link controller="task" action="create">Add Task</g:link>
       
       </button>


    </div>

    
     <div class="first">
     
       <h3>Teams</h3>

    <p>Add/register new teams into the HR system. Display a list of current teams within the company.</p>

       <button type="button" class="btn btn-success">

          <g:link controller="team" action="create">Add Team</g:link>
       
       </button>


    </div>

    
     <div class="second">
     
       <h3>Team Leaders</h3>

    <p>Add/register new team leaders into the HR system. Display a list of current team leaders within the company.</p>

       <button type="button" class="btn btn-success">

          <g:link controller="teamLeader" action="create">Add Team Leader</g:link>
       
       </button>
     </div>

    </div>
    </div>

</body>
</html>
