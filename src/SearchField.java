import java.io.*;

public class SearchField {
    final String FILE_NAME = "agenda.txt";
    FileReader fr;
    BufferedReader br;

    public SearchField() {}

    public void run() {
        try {
            String field = askField();
            if(field != null) {
                open();
                Contact c;
                while((c = read()) != null) {
                    if(c.includes(field)) {
                        print(c);
                    }
                }
                close();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    String askField() throws IOException {
        BufferedReader inputKeyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert the field: ");
        return inputKeyboard.readLine();
    }

    void open() throws FileNotFoundException {
        fr = new FileReader(FILE_NAME);
        br = new BufferedReader(fr);
    }

    Contact read() throws IOException {
        String line = br.readLine();
        if(line == null) {
            return null;
        } else {
            return new Contact(line);
        }
    }

    void print(Contact c) throws IOException {
        System.out.println("Surname: " + c.getSurname());
        System.out.println("Name: " + c.getName());
        System.out.println("Phone number: " + c.getTelephone());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Gender: " + c.getGender());
    }

    void close() throws IOException {
        fr.close();
    }
}
