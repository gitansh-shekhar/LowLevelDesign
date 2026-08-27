package WEEK1_EXERCISE.ReportGeneratorSystem;

public interface IGeneratePDF {
    default void downloadPDF(){
        System.out.println("PDF Downloaded");
    }
}
