package StrategyPattern.TextEditorApp;

public class EncryptionSave implements ISaveFormate{
      public void save(String text){
          StringBuilder sb = new StringBuilder(text.toUpperCase());
          sb.reverse();
          System.out.println("Your Text is saved in Encrypted Formate.");
          System.out.println("Your Encrypted Text is : "+sb.toString());


      }
}
