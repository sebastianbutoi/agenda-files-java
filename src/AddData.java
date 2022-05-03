import java.io.*;

public class AddData {

    public AddData() {}

    public void add() {
        Contact c = null;
        FileWriter f = null;
        PrintWriter fOUT = null;

        try {
            f = new FileWriter("agenda.txt", true);
            fOUT = new PrintWriter(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

        c = new Contact();
        while (c.read() != null) {
            fOUT.println(c.getSurname()+";"+c.getName()+';'+c.getTelephone()+";"+c.getEmail()+";"+c.getGender());
            fOUT.flush();
        }
        try {
            f.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
