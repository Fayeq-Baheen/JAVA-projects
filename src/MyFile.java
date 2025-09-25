import java.io.*;
public class MyFile {
    public static void main(String args[]){

        File file = new File("Text.txt");

        if(file.exists()){
            System.out.println("The file exists!");
            System.out.println(file.getAbsolutePath());
            file.delete();
        }else{
            System.out.println("The file doesn't exists!");
        }

//        Writing data into a file
        try{
            FileWriter writer = new FileWriter("Text.txt");
            writer.write("Hello\n");
            writer.append("How are you guys?\n");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

//        Reading data from a file
        try {
            FileReader reader = new FileReader("Text.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}