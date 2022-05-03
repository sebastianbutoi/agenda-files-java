import java.io.*;
import java.util.*;

public class Contact {
    private String surname;
    private String name;
    private String telephone;
    private String email;
    private String gender;

    public Contact() {}

    public Contact read() {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        try {
            System.out.print("Insert the surname: (* to exit); ");
            surname = keyboard.readLine();
            if (surname.equals("*")) {
                return null;
            }
            System.out.print("Insert the name: ");
            name = keyboard.readLine();
            System.out.print("Insert the phone number: ");
            telephone = keyboard.readLine();
            System.out.print("Insert the email: ");
            email = keyboard.readLine();
            System.out.print("Insert the gender: ");
            gender = keyboard.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void edit() {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        print();
        try {
            System.out.println("Which field do you want to change? ");
            System.out.println("1) Surname");
            System.out.println("2) Name");
            System.out.println("3) Phone number");
            System.out.println("4) Email");
            System.out.println("5) Gender");
            String inputString = keyboard.readLine();
            for (int i = 0; i < inputString.length(); i++) {
                switch (inputString.charAt(i)) {
                    case '1':
                        System.out.print("Change the surname (" + surname + "):");
                        surname = keyboard.readLine();
                        break;
                    case '2':
                        System.out.print("Change the name (" + name + "):");
                        name = keyboard.readLine();
                        break;
                    case '3':
                        System.out.print("Change the phone number (" + telephone + "):");
                        telephone = keyboard.readLine();
                        break;
                    case '4':
                        System.out.print("Change the email (" + email + "):");
                        email = keyboard.readLine();
                        break;
                    case '5':
                        System.out.print("Change the gender (" + gender + "):");
                        gender = keyboard.readLine();
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(surname + "\t" + name + "\tTel. " + telephone + "\tEmail. " + email + "\tGender. " + gender);
    }

    boolean includes(String s) {
        int p1 = surname.indexOf(s);
        int p2 = name.indexOf(s);
        int p3 = email.indexOf(s);
        return (p1 != -1 || p2 != -1 || p3 != -1);
    }

    boolean validData() {
        return !((surname == null || surname.length() == 0) && (name == null || name.length() == 0) && (email == null || email.length() == 0));
    }

    String toRecord() {
        return surname + ";" + name + ";" + email + "\n";
    }

    public Contact(String line) {
        StringTokenizer st = new StringTokenizer(line, ";");
        if (st.hasMoreTokens()) {
            surname = st.nextToken();
        }
        if (st.hasMoreTokens()) {
            name = st.nextToken();
        }
        if (st.hasMoreTokens()) {
            telephone = st.nextToken();
        }
        if (st.hasMoreTokens()) {
            email = st.nextToken();
        }
        if (st.hasMoreTokens()) {
            gender = st.nextToken();
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
