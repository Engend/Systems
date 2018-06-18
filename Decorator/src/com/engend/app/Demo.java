package com.engend.app;

public class Demo {

	public static void main(String[] args) {
		
		
		
		
		String salaryRecords = "test";
        DataSourceDecorator coded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("C:\\Users\\Engend\\Desktop\\file1r.txt")));
        coded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("C:\\Users\\Engend\\Desktop\\file1r.txt");
        
        FileDataSource encoded = new FileDataSource("C:\\Users\\Engend\\Desktop\\file3r.txt");
        encoded.writeData(salaryRecords);
        DataSource plain2 = new FileDataSource("C:\\Users\\Engend\\Desktop\\file3r.txt");
        
        
        
        
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(coded.readData());
        
        System.out.println("=================");
        System.out.println("=================");
        
        
       
        
        
        
        
        
        
        
        
        
    }
}
