package sakai.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReaderNumber {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {

            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String message;
            while ((message = br.readLine()) != null) {

                System.out.println(message);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
