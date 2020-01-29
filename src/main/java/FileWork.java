import java.io.*;
import java.util.Scanner;


public class FileWork {
    private Scanner str = new Scanner(System.in);
    private String name = "src/main/resources/I_Create_File.txt";
    private File file = new File(name);


    public void createFile() {
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File created!");
                } else {
                    System.out.println("File isn't created!");
                }
            }else{
                System.out.println("File was created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void inputFile() throws IOException {
        if(file.exists()){
        int n = 5;
        String[] mas = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("mas[" + i + "]: ");
            mas[i] = str.nextLine();
            mas[i]=mas[i].trim()+" ";
        }
        if (file.length() != 0) {
            String m;
            System.out.println("File is contains data, delete them? (y/n): ");
            m = str.nextLine();
            if (m.equals("y")) {
                System.out.println();
                FileWriter file = new FileWriter(name);
                for (int i = 0; i < n; i++) {
                    file.write(mas[i]);
                }
                file.close();
            } else if (m.equals("n")) {
                System.out.println();
                FileWriter file = new FileWriter(name, true);
                for (int i = 0; i < n; i++) {
                    file.write(mas[i]);
                }
                file.close();
            }
        } else {
            System.out.println();
            FileWriter file = new FileWriter(name);
            for (int i = 0; i < n; i++) {
                file.write(mas[i]);
            }
            file.close();
        }
    }else {
            System.out.println("File didn't create");
        }
    }



    public void outputFile() {
        String line;
        try {
            BufferedReader fl = new BufferedReader(new FileReader(name));
                while ((line = fl.readLine()) != null) {
                    System.out.print(line);
                    System.out.println();
                }
                fl.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }


    public void deleteData(){
        try {
            FileWriter fileWriter = new FileWriter(name);
            BufferedWriter out1 = new BufferedWriter(fileWriter);
            out1.write("");
            out1.close();
        } catch (Exception e)
        {System.err.println("Error in file cleaning: " + e.getMessage());}
    }

    public void deleteFile() {
        new File(name).delete();
        System.out.println("File was deleted");
    }


}

