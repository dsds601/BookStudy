package RealJavaSoftware;

import java.io.IOException;

public class MainApplication {
    private static final String RESOURCE = "src/main/resources/";
    private static final String FILE_NAME = "bank-data-simple.csv";
    public static void main(String[] args) throws IOException {
        final BankTransactionAnalyzerSimple bankStatementAnalyzer = new BankTransactionAnalyzerSimple();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();
        bankStatementAnalyzer.analyze(RESOURCE+FILE_NAME,bankStatementParser);
    }
}
