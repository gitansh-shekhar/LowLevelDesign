package StrategyPattern.TextEditorApp;

public class MarkdownSave implements ISaveFormate{
    public void save(String text){
        System.out.println("Saved to Markdown text.");
        System.out.println("Your Saved Document is : "+text);
    }
}
