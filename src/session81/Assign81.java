/**
 * Assign81.java 1.1 02-Sep-2017
 */
//package declaration
package session81;

//importing below package to access the File , FileInputStream & FileOutputStream classes

import java.io.*;
/**
 * This program will implement the logic of file copying from one file to another file.
 * 
 * version 1.1
 * 
 * Compiled on 02-Sep-2017
 * 
 * @author chhaya
 *
 */


public class Assign81 {
	
	public static void main(String[] args){
		
//Source File directory		
		
		String srcfile = "F:\\SourceFile.txt"  ;
		
//Destination file directory
		
		String destfile = "F:\\DestinationFile.txt";
		
//calling method to initiate file copy operation		
		
		fileCopyOperation(srcfile , destfile);
	}
	
//static method declaration passing source file and destination file name as arguments
	
	public static void fileCopyOperation(String srcfile , String destfile){
		
//Declaration of FileInputStream Class Instance
		
        FileInputStream  input  = null ;
        
//Declaration of FileOutputStream Class Instance        
		
		FileOutputStream output = null ;
		
		try {
			
//Creation & Initialization of File Class instances  for both source file and destination file			
			
		     File f1 = new File(srcfile);
		
		     File f2 = new File(destfile);
		     
		     
//Initialization of FileInputStream instance
		     
		     input = new FileInputStream(f1);
		     
//Initialization of FileOutputStream instance		     
		
		     output = new FileOutputStream(f2);
		     
//Declaration of byte array		     
		
		     byte[] buffer = new byte[1024];
		     
//Variable to store the record length of input file		     
		
             int recordLength;
        
             while((recordLength = input.read(buffer)) > 0){
            	 
//writing in destination file with the output instance of FileOutputStream            	 
        	
                   output.write(buffer, 0, recordLength);
                   
                   }
            
//Closing the input and output resource post successful completion of copying operation
             
                  input.close();
        
                  output.close();
        
                  System.out.println("File got copied successfully");
        
		     }
//Handling the FileNotFoundException
		
		catch(FileNotFoundException fe){
			
			      System.out.println("FileNotFoundException is thrown"); 
			      
		}
		
//Handling the IOException		
		catch(IOException io){
			
			     System.out.println("IOException is thrown"); 
			     
		}
		
		
	}
}