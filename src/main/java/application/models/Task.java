package application.models;

public class Task {

    private final String name;

    private int tomatoes;

    public Task(String name){
        this.name = name;
    }

    public void addTomato(){
        tomatoes++;
    }
}
