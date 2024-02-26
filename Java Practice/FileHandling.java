/* 
In Java, a File is an abstract data type.
A named location used to store related information is known as a File.

Before understanding the File operations, it is required that we should have knowledge of Stream and File methods. 
If you have knowledge about both of them, you can skip it.

Stream
A series of data is referred to as a stream. In Java, 
Stream is classified into two types, i.e., Byte Stream and Character Stream.

Byte stream
1.Output stream class(reads)
2.Input Stream class(writes)

Character stream
1.Reader
2.writer

File class methods
S.No.	Method	Return Type	Description
1.	canRead()	Boolean	The canRead() method is used to check whether we can read the data of the file or not.
2.	createNewFile()	Boolean	The createNewFile() method is used to create a new empty file.
3.	canWrite()	Boolean	The canWrite() method is used to check whether we can write the data into the file or not.
4.	exists()	Boolean	The exists() method is used to check whether the specified file is present or not.
5.	delete()	Boolean	The delete() method is used to delete a file.
6.	getName()	String	The getName() method is used to find the file name.
7.	getAbsolutePath()	String	The getAbsolutePath() method is used to get the absolute pathname of the file.
8.	length()	Long	The length() method is used to get the size of the file in bytes.
9.	list()	String[]	The list() method is used to get an array of the files available in the directory.
10.	mkdir()	Boolean	The mkdir() method is used for creating a new directory.


File Operations
Create a File
Get File Information
Write to a File
Read from a File
Delete a File
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args)  throws IOException,FileNotFoundException{
// CrateNewFile()
        // try{

        // File o=new File("D:\\New folder (2)/hello.txt");

        // if(o.createNewFile()){
        //     System.out.println("File " + o.getName() + " is created successfully.");  
        // }
        // else{
        //     System.out.println("File is already exist in the directory.");  
        // }

        // }
        // catch(IOException e){
        //     System.out.println(e);
        //     e.printStackTrace();
        // }


//Getting file information
        // File o=new File("D:\\New folder (2)/hello.txt");
        // if(o.exists()){
        //     System.out.println("Can we read file:"+o.getName());
        //     System.out.println("Can we read file:"+o.canRead());
        //     System.out.println("Can we write file:"+o.canWrite());
        //     System.out.println("File path is::"+o.getAbsolutePath());
        //     System.out.println("file Length:"+o.length());
        // }
        // else{
        //     System.out.println("File not exists");
        // }


//Writing Data into file
    //    try{

    //     FileWriter o=new FileWriter("D:\\New folder (2)/hello.txt");
    //     o.write("welcome, I am from hello.text file");
    //     o.close();   
    //     System.out.println("Content is successfully wrote to the file.");  

    //     }
    //     catch(IOException e){
    //         System.out.println(e);
    //         e.printStackTrace();
    //     }


//Reading File data
        // File o=new File("D:\\New folder (2)/hello.txt");
        // Scanner sc=new Scanner(o);
        // while(sc.hasNextLine()){
        // String Data=sc.nextLine();
        // System.out.println(Data);
        // }

    


//delete
        //     if (o.delete()) {   
        //     System.out.println(o.getName()+ " file is deleted successfully.");  
        //     } 
        //     else {  
        //    System.out.println("Unexpected error found in deletion of the file.");  
        //       }   



//list() of files
            File directoryPath = new File("D:\\JAVA PRACTICE");
            String[] contents = directoryPath.list();
            System.out.println("List of files and directories in the specified directory:");
            int i=1;
            for (String content : contents) {
            System.out.println(i+"."+content);
            i++;
            }



//mkdir() making new folder
        //  File directoryPath = new File("D:\\sri.");
        //  boolean iscreated = directoryPath.mkdir();
        //  if (iscreated) {
        //     System.out.println("Directory created successfully");
        // } else {
        //     System.out.println("Directory creation failed");
        // }


    }
    
}
