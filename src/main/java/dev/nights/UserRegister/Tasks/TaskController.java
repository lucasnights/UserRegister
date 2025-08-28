package dev.nights.UserRegister.Tasks;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tasks")
public class TaskController {

    //Register a new task
    @PostMapping("/createTask")
    public String createTask(){
        return "Task created";
    }
    //Show registered tasks
    @GetMapping("/showTasks")
    public String showTasks(){
        return "Tasks:";
    }
    //Update task by ID
    @PutMapping("/updateTask")
    public String updateTask(){
        return "Task updated";
    }
    //Delete task by ID
    @DeleteMapping("/deleteTask")
    public String deleteTask(){
        return "Task deleted.";
    }
}
