package WEEK1_EXERCISE.ReportGeneratorSystem;
public class Main {
    public static void main(String[] args) {
        AdminReport adminReport= new AdminReport();
        adminReport.downloadExcelSheet();
        adminReport.downloadPDF();
        GuestReport guestReport = new GuestReport();
        guestReport.downloadPDF();
    }
}
