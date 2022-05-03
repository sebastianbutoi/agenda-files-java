import java.io.*;
import java.util.StringTokenizer;

public class ReadAgenda {

    public ReadAgenda() {}

    public void readToken() {
        FileReader f = null;
        BufferedReader fIN = null;

        try {
            f = new FileReader("agenda.txt");
            fIN = new BufferedReader(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Contact c = new Contact();
        String s;
        StringTokenizer st;

        try {
            s = fIN.readLine();
            while(s != null) {
                st = new StringTokenizer(s, ";");
                c.setSurname(st.nextToken());
                c.setName(st.nextToken());
                c.setTelephone(st.nextToken());
                c.setEmail(st.nextToken());
                c.setGender(st.nextToken());
                c.print();
                s = fIN.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
