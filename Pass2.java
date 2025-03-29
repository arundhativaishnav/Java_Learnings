import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Pass2 {
    public static void main(String[] args) {
        System.out.println("Onkar Lonsane\nRoll No 28");

        try (
                BufferedReader intermediateReader = new BufferedReader(new FileReader("intermediate.txt"));
                BufferedReader symtabReader = new BufferedReader(new FileReader("symtab.txt"));
                BufferedReader littabReader = new BufferedReader(new FileReader("littab.txt"));
                FileWriter outputWriter = new FileWriter("Pass2.txt")
        ) {
            HashMap<Integer, String> symSymbol = new HashMap<>();
            HashMap<Integer, String> litSymbol = new HashMap<>();
            HashMap<Integer, String> litAddr = new HashMap<>();
            String line;

            // Read symbol table
            int symtabPointer = 1;
            while ((line = symtabReader.readLine()) != null) {
                String[] words = line.split("\t\t\t");
                symSymbol.put(symtabPointer++, words[1]);
            }

            // Read literal table
            int littabPointer = 1;
            while ((line = littabReader.readLine()) != null) {
                String[] words = line.split("\t\t");
                litSymbol.put(littabPointer, words[0]);
                litAddr.put(littabPointer++, words[1]);
            }

            // Process intermediate code
            while ((line = intermediateReader.readLine()) != null) {
                String opcode = line.substring(1, 6);
                switch (opcode.toUpperCase()) {
                    case "IS,00":
                        outputWriter.write("+ 00 0 000\n");
                        break;
                    case "IS":
                        processInstruction(line, outputWriter, symSymbol, litAddr);
                        break;
                    case "DL,01":
                        String data = line.substring(10, line.length() - 1);
                        String formattedData = String.format("+ 00 0 %03d\n", Integer.parseInt(data));
                        outputWriter.write(formattedData);
                        break;
                    default:
                        outputWriter.write("\n");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processInstruction(String line, FileWriter outputWriter,
                                           HashMap<Integer, String> symSymbol,
                                           HashMap<Integer, String> litAddr) throws IOException {
        outputWriter.write("+ " + line.substring(4, 6) + " ");
        int offset;
        if (line.charAt(9) == ')') {
            outputWriter.write(line.charAt(8) + " ");
            offset = 3;
        } else {
            outputWriter.write("0 ");
            offset = 0;
        }

        int index = Integer.parseInt(line.substring(10 + offset, line.length() - 1));
        if (line.charAt(8 + offset) == 'S') {
            outputWriter.write(symSymbol.get(index) + "\n");
        } else {
            outputWriter.write(litAddr.get(index) + "\n");
        }
    }
}