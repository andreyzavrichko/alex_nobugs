package no.bugs.homework5.task3;

import static no.bugs.homework5.task3.FormatReport.EXCEL;
import static no.bugs.homework5.task3.FormatReport.PDF;

public class ReportGenerator {
    public static void generate(FormatReport type) {
        ReportStrategy strategy;
        switch (type) {
            case PDF:
                strategy = new PdfReportStrategy();
                break;
            case EXCEL:
                strategy = new ExcelReportStrategy();
                break;

            default:
                System.out.println("Неизвестный тип");
                return;

        }
        strategy.fetchReport();
        strategy.formatReport();
        strategy.generateReport();

    }

    public static void main(String[] args) {
        generate(PDF);
        generate(EXCEL);
    }
}
