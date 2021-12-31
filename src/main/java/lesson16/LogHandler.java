package lesson16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class LogHandler extends Handler {
    private final String fileName;

    public LogHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void publish(LogRecord record) {


        Date date = new Date(record.getMillis());
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String dateFormatted = formatter.format(date);

        StringBuilder sb = new StringBuilder();
        sb.append(dateFormatted)
                .append(" - ")
                .append(record.getLevel().getName())
                .append(" - thread ID ")
                .append(record.getThreadID())
                .append(" - ")
                .append(record.getMessage());

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
            String newLine = System.getProperty("line.separator");
            writer.write(sb.toString());
            writer.write(newLine);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
