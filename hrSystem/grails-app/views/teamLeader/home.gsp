<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket HR system | Home Page</title>

    <asset:stylesheet src="home.css"/>
</head>
<body>

    

    <div id="content" role="main">
    
    

   <div class="row">
     <div class="first">
     
       <h3>Employees</h3>

    <p>Add/register new employees into the HR system. Display a list of current employees within the company.</p>

       <button type="button" class="btn btn-success">

          <g:link controller="employee" action="create">Add Employee</g:link>
       
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


    </div>
   </div>
   
</body>
</html>
