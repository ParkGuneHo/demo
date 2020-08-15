package com.example.demo;

public class CharacterController {
    private CharacterModel model; private CharacterView view; public CharacterController(CharacterModel model, CharacterView view) { this.model = model; this.view = view; }
    // State change
    public void setCharacterName(String name) { model.setName(name); } public String getCharacterName() { return model.getName(); }
    // State change
    public void setCharacterLevel(int level) { model.setLevel(level); } public int getCharacterLevel() { return model.getLevel(); }
    // State change
    public void setCharacterLife(int life) { model.setLife(life); } public int getCharacterLife() { return model.getLife(); }
    // View selection(Rendering)
    public void updateView() { view.printView(model); }


}
