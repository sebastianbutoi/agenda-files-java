import java.io.*;

public class Edit {
    SearchField read;
    FileWriter f2 = null;
    PrintWriter fOUT = null;
    String filename = "agenda.txt.bak";
    String s;
    Contact c;

    public Edit() {}

    public void run() throws IOException {
        f2 = new FileWriter(filename);
        fOUT = new PrintWriter(f2);
        read = new SearchField();
        read.open();
        s = read.askField();
        c = new Contact();
        c = read.read();

        while (c != null) {
            if (c.includes(s)) {
                c.edit();
                fOUT.println(c.getSurname()+";"+c.getName()+';'+c.getTelephone()+";"+c.getEmail()+";"+c.getGender());
                fOUT.flush();
            } else {
                fOUT.println(c.getSurname()+";"+c.getName()+';'+c.getTelephone()+";"+c.getEmail()+";"+c.getGender());
                fOUT.flush();
            }
            c = read.read();
        }
        fOUT.close();
        ReverseCopy rc = new ReverseCopy();
        rc.copy();
    }
}
