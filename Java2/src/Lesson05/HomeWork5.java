package Lesson05;

import java.io.*;

public class HomeWork5 {

    public static void main(String[] args) throws Exception {

        saveFile();
        readFile();

    }

    public static class AppData {
        private String[] header;
        private int[][] data;
    }

   public static void saveFile() throws Exception {
       AppData inAppData = new AppData();
       String[] header = {"Value1", "Value2", "Value3"};
       int[][] data = {
               {10, 20, 30},
               {11, 21, 31},
               {12, 22, 32}
       };
       try (BufferedWriter writer = new BufferedWriter(new FileWriter("./file.csv"))) {
    for (int i = 0; i < header.length; i++) {
               writer.write(header[i] + ";");
               }
         for (int a = 0; a < data.length; a++) {
                  writer.append("\n");
                  for (int b = 0; b < data[a].length; b++) {
                      writer.append(data[a][b] + " ; ");
                      }
                   }
           }
       catch (IOException e) {
           e.printStackTrace();
       }

   }
  public static  void readFile() throws Exception {

      try (BufferedReader reader = new BufferedReader(new FileReader("./file.csv"))) {
          String str;
          while ((str = reader.readLine()) != null) {
              System.out.println(str);

          }
      }
      catch(FileNotFoundException e){
              e.printStackTrace();
          }
          catch(IOException e){
              e.printStackTrace();
          }
      }
 }



