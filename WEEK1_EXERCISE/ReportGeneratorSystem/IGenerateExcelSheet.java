package WEEK1_EXERCISE.ReportGeneratorSystem;

public interface IGenerateExcelSheet {
    default void downloadExcelSheet(){
        System.out.println("Excel Sheet Downloaded");
    }
}
