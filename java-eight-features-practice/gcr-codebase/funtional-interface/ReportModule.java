interface DataExporter {

    void exportToCSV();
    void exportToPDF();

    // New feature added later
    default void exportToJSON() {
        System.out.println("Exporting data to JSON (default implementation)");
    }
}
class CsvExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Exporting data to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("CSV Exporter does not support PDF");
    }
}
class PdfExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("PDF Exporter does not support CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting data to PDF");
    }
}
class AdvancedExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Exporting data to CSV (advanced)");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting data to PDF (advanced)");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Exporting data to JSON (custom implementation)");
    }
}
public class ReportModule {

    public static void main(String[] args) {

        DataExporter csv = new CsvExporter();
        DataExporter pdf = new PdfExporter();
        DataExporter advanced = new AdvancedExporter();

        csv.exportToJSON();        // default
        pdf.exportToJSON();        // default
        advanced.exportToJSON();   // overridden
    }
}
