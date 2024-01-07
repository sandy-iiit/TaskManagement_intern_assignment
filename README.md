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


