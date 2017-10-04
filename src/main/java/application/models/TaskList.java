package application.models;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<Task> taskList = new ArrayList<>();

    public TaskList(){
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public List<Task> getTaskList(){
        return taskList;
    }
}
