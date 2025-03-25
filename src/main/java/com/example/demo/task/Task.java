package com.example.demo.task;

public class Task {
    private Long id;
    private String name;
    private String status;

    public Task(Long id, String name, String status){
        this.id = id;
        this.name = name;
        this.status = status;
    }
    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
