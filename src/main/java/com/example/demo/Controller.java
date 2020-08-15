package com.example.demo;

public class Controller {
    private View view;
    private Score model;

    public Controller(Score model, View view){
        this.model = model;
        this.view = view;
    }

    public void setUserScore(Integer score){
        model.setScore(score);
    }

    public Integer getUserScore(){
        return model.getScore();
    }
    

    public void updateView(){
        view.printStudentDetails(model.getScore());
    }
}
