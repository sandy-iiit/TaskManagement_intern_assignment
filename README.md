This repository has 2 folders one is taskmanagement2 which consists of springboot backend.
To run this server install the required dependencies.
To run only the api in postman go to the authorizations and use basic auth and give following details:
Username: User1
Password: password1

The end points of the api can only be accessed only after  authentication and this has been done in the securityconfig.

The api end points:

/tasks - To list out all the tasks.
/tasks/{taskid} - To display a single task.
For adding a task:
POST /tasks - give the task as {
                                name:{taskname},
                                description:{task description},
                                completed : {boolean}
                                }
                              
PUT /tasks/{taskid} - To update a single task.
DELETE /tasks/{taskid} - To delete a single task.

However if you wanna use frontend then the authentication part is hardcoded and is placed into the config of axios.

So you can direclty access the Task list and apply CRUD operations on it.
The below are the screen shots :
<img width="831" alt="Screenshot 2024-01-07 at 12 47 01 PM" src="https://github.com/sandy-iiit/TaskManagement_intern_assignment/assets/95034962/57f78ece-06b3-4992-8159-87ab99dd0c3b">

When you click the Mark Complete the task gets completed and turns green.


<img width="831" alt="Screenshot 2024-01-07 at 12 47 26 PM" src="https://github.com/sandy-iiit/TaskManagement_intern_assignment/assets/95034962/f1cacb57-d217-448b-b180-5f5ed2e2527a">

Updating Tasks:
<img width="831" alt="Screenshot 2024-01-07 at 12 48 54 PM" src="https://github.com/sandy-iiit/TaskManagement_intern_assignment/assets/95034962/499a5fff-fc2f-47b8-91e7-ef6038550614">

Creating Tasks:
<img width="831" alt="Screenshot 2024-01-07 at 12 51 05 PM" src="https://github.com/sandy-iiit/TaskManagement_intern_assignment/assets/95034962/9889a872-7473-4b82-afbb-ddf77365c254">

Deleting the task- By clicking the Delete Task you can delete a task.
<img width="831" alt="Screenshot 2024-01-07 at 12 53 22 PM" src="https://github.com/sandy-iiit/TaskManagement_intern_assignment/assets/95034962/d436f711-2c80-4cc0-b8bc-df565d32cf66">
