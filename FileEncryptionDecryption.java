package cognifyz_level_2;

import java.io.*;

public class FileEncryptionDecryption {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Choose operation (1 for encryption, 2 for decryption): ");
            int choice = Integer.parseInt(br.readLine());

            System.out.print("Enter the input file name or path: ");
            String inputFileName = br.readLine();

            System.out.print("Enter the output file name: ");
            String outputFileName = br.readLine();

            switch (choice) {
                case 1:
                    encryptFile(inputFileName, outputFileName);
                    System.out.println("Encryption complete. Output saved to " + outputFileName);
                    break;
                case 2:
                    decryptFile(inputFileName, outputFileName);
                    System.out.println("Decryption complete. Output saved to " + outputFileName);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 for encryption or 2 for decryption.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void encryptFile(String inputFileName, String outputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                // Simple encryption: shift each character by 1
                char encryptedChar = (char) (ch + 1);
                writer.write(encryptedChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void decryptFile(String inputFileName, String outputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                // Simple decryption: shift each character back by 1
                char decryptedChar = (char) (ch - 1);
                writer.write(decryptedChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
