package StrategyPattern.TextEditorApp;

public class TextEditorApp {
    public static void main(String[] args) {
        String text = "Hi my name is Gitansh Shekhar." +
                "I want to become a best Software Engineer in the world." +
                "For this I am working day ans night.";
        TextEditor editor = new TextEditor(text , new PlainTextSave());
        editor.save();
        editor.setSaveFormate( new MarkdownSave());
        editor.save();
        editor.setSaveFormate(new EncryptionSave());
        editor.save();
    }
}
