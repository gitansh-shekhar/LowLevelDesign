package StrategyPattern.TextEditorApp;

public class TextEditor {
    private String  text;
    private ISaveFormate saveFormate;
    public TextEditor(String text , ISaveFormate saveFormate){
        this.saveFormate = saveFormate;
        this.text = text;
    }

    public void setSaveFormate(ISaveFormate saveFormate) {
        this.saveFormate = saveFormate;
    }

    public void save(){
        this.text = text;
        saveFormate.save(this.text);
    }
}
