package no.bugs.homework5.task3;

public class PdfReportStrategy implements ReportStrategy{
    @Override
    public void fetchReport() {
        System.out.println("Fetching data for PDF...");
    }

    @Override
    public void formatReport() {
        System.out.println("Formatting data for PDF...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating PDF report...");
    }
}
