package lab4;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class FileDownloader implements Runnable {
    private final String url;
    private final String outputFileName;
    public FileDownloader(String url, String outputFileName) {
        this.url = url;
        this.outputFileName = outputFileName;
    }

    @Override
    public void run() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(outputFileName)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Download completed: " + outputFileName);
        } catch (IOException e) {
            System.err.println("Error downloading file: " + url);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] urls = {
                "https://res.cloudinary.com/rxavio/image/upload/v1719332051/PHP_and_MySQL.doc_ibpqkz.pdf",   // Replace with a valid URL
        };
        String[] outputFiles = {
                "file1.bin",
        };
        for (int i = 0; i < urls.length; i++) {
            Thread thread = new Thread(new FileDownloader(urls[i], outputFiles[i]));
            thread.start();
        }
    }
}