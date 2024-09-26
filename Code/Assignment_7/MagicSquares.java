import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
    public static boolean testMagic(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int magicSum = -1;
        String line;
        int[] sumColumn = new int[100];
        int columns = 0;
        int sumDiagonal = 0;
        int sumInverseDiagonal = 0;
        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split("\t");
            int sumLine = 0;
            for (int i = 0; i < numbers.length; i++) {
                int number = Integer.parseInt(numbers[i]);
                sumLine += number;
                sumColumn[i] += number;
                if (columns == i) {
                    sumDiagonal += number;
                }
                if (columns + i + 1 == numbers.length) {
                    sumInverseDiagonal += number;
                }
            }
            if (magicSum == -1) {
                magicSum = sumLine;
            } else if (magicSum != sumLine) {
                reader.close();
                return false;
            }
            reader.readLine();
            columns++;
        }
        reader.close();
        for (int i = 0; i < columns; i++) {
            if (sumColumn[i] != magicSum) {
                return false;
            }
        }
        if (sumDiagonal != magicSum || sumInverseDiagonal != magicSum) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        String[] fileNames = {"Mercury.txt", "Luna.txt"};
        for (String fileName: fileNames) {
            System.out.println(fileName + " is magic square? " + testMagic(fileName));
        }
    }
}
