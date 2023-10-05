/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MIT
 */
public class file {
    
   login value = new login();
   String name = value.name;
    public static void main(String[] args) throws IOException {
        
        try (FileWriter write = new FileWriter("file.txt",true)) {
            write.write("anyti");
        }
        File read = new File("file.txt");
        Scanner scanner = new Scanner(read);
        while(scanner.hasNext()){
            String name = scanner.next();
            System.out.println(name);
        }
        scanner.close();
}
}
