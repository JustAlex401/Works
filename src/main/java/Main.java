import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello, my dear fried");
        int decision;
        System.out.println("Choose: ");
        System.out.println("1- Create file");
        System.out.println("2- Input data to file");
        System.out.println("3- Output data from file");
        System.out.println("4- delete data from file");
        System.out.println("5- Delete file");
        System.out.println("6- Exit");
        System.out.println("Input your decision: ");
        decision = scanner.nextInt();
        FileWork fileWork=new FileWork();
        while(decision!=6)
        {
            switch (decision) {
                case 1:
                    fileWork.createFile();
                    break;
                case 2:
                    fileWork.inputFile();
                    break;
                case 3:
                    fileWork.outputFile();
                    break;
                case 4:
                    fileWork.deleteData();
                    break;
                case 5:
                    fileWork.deleteFile();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("You choose nothing!");
            }
            System.out.println("Choose!");
            decision = scanner.nextInt();
        }
    }
}

