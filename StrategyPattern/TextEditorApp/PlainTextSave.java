package StrategyPattern.TextEditorApp;

public class PlainTextSave implements ISaveFormate{
    public void save(String text){
        System.out.println("Saved to plain text.");
        System.out.println("Your Saved Document is : "+text);
    }
}
