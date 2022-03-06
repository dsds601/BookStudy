package RealJavaSoftware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCE = "src/main/resources/";
    private static final String FILE_NAME = "bank-data-simple.csv";
    private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();

    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {
        final Path path = Paths.get(RESOURCE + FILE_NAME);
        final List<String> lines = Files.readAllLines(path);
        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
        collectSummary(bankStatementProcessor);

    }

    private static void collectSummary(final BankStatementProcessor bankStatementProcessor) {


        System.out.println("The total for all transaction is "+bankStatementProcessor.calculateTotalAmount());

        System.out.println("The total for transaction in January "+bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));

        System.out.println("The total for transaction in February is "+bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));

        System.out.println("The total salary received is  "+bankStatementProcessor.calculateTotalForCategory("Salary"));

    }


}
