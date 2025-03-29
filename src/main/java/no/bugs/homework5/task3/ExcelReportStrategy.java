package no.bugs.homework5.task3;

public class ExcelReportStrategy implements ReportStrategy{
    @Override
    public void fetchReport() {
        System.out.println("Fetching data for Excel...");
    }

    @Override
    public void formatReport() {
        System.out.println("Formatting data for Excel...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating Excel report...");
    }
}
