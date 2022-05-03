import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        WriteAgenda writeAgenda = new WriteAgenda();
        ReadAgenda readAgenda = new ReadAgenda();
        SearchField searchField = new SearchField();
        AddData addData = new AddData();
        Edit edit = new Edit();
        int choice;
        do {
            System.out.println(" 1 : CREATE FILE ");
            System.out.println(" 2 : READ ");
            System.out.println(" 3 : SEARCH ");
            System.out.println(" 4 : INSERT NEW CONTACT ");
            System.out.println(" 5 : EDIT DATA");
            System.out.println(" 6 : EXIT ");
            System.out.println(" INSERT YOUR CHOICE");
            choice = Integer.parseInt(keyboard.readLine());
            switch (choice) {
                case 1: writeAgenda.write();
                        break;
                case 2: readAgenda.readToken();
                    break;
                case 3: searchField.run();
                    break;
                case 4: addData.add();
                    break;
                case 5: edit.run();
                    break;
                default: System.exit(1);
            }
        } while (choice != 6);
    }
}
