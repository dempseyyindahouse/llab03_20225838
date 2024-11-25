package garbage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "C:\\Windows\\System32\\notepad.exe";
        List<Byte> byteList = new ArrayList<>();
        long startTime, endTime;
        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                byteList.add((byte) byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        startTime = System.currentTimeMillis();
        byte[] inputBytes = new byte[byteList.size()];
        for (int i = 0; i < byteList.size(); i++) {
            inputBytes[i] = byteList.get(i);
        }
        String outputString = new String(inputBytes);
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) );
        System.out.println(outputString.length());
    }
}
