import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("июня 5, 2018 12:10:56", formatter1);
        System.out.println(localDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate localDate = LocalDate.parse("июня 5, 2018", formatter2);
        System.out.println(localDate);

        Interface form = new Interface();
        form.setVisible(true);


    }








//            FileWriter nFile = new FileWriter("file1.txt");
//
//            nFile.write("Хокку родом из глубин России \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
//
//            nFile.close();
//        FileReader fr= new FileReader("file2.txt");
//        Scanner scan = new Scanner(fr);
//
//
//        int i = 1;
//
//        while (scan.hasNextLine()) {
//            System.out.println(i + " : " + scan.nextLine());
//            i++;
//        }
//
//        fr.close();
//        }
}
