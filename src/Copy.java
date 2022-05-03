import java.io.*;

public class Copy {

    public void copy() {
        final String FILE_NAME = "agenda.txt";
        FileReader f1 = null;
        BufferedReader fIN = null;
        FileWriter f2 = null;
        PrintWriter fOUT = null;

        try {
            f1 = new FileReader(FILE_NAME);
            fIN = new BufferedReader(f1);
            f2 = new FileWriter(FILE_NAME+".bak");
            fOUT = new PrintWriter(f2);
        } catch (IOException e) {
            System.out.println("Cannot open the file.");
            System.exit(1);
        }

        String s;
        try {
            s = fIN.readLine();
            while(s != null) {
                fOUT.println(s);
                fOUT.flush();
                s = fIN.readLine();
            }
        } catch (IOException e) {
            System.out.println("Cannot read the file.");
            System.exit(1);
        }

        try {
            f1.close();
            f2.close();
        } catch (IOException e) {
            System.out.println("Cannot close the file.");
            System.exit(1);
        }
    }
}
