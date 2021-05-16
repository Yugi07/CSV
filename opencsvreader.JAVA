package day28;

import java.nio.file.Files;

public class opencsvreader {
	private static final string SAMPLE_CSV_FILE_PATH ="./users.csv";
	

	public static void main(String[] args) throws IOException {
		try {
			Reader reader = Files.newBufferedReader(path.get(SAMPLE_CSV_FILE_PATH)))
         CSVReader csvReader = new CSUReader(reader);
         
		}
		{
			string[]  nextRecord;
			while ((nextRecord = csvReader.reader()) ! = null) {
				system.out.println("Name : "+ nextRecord(0));
				system.out.println("email : "+ nextRecord(1));
				system.out.println("phone : "+ nextRecord(2));
				system.out.println("country : "+ nextRecord(3));
				System.out.println("==============================");
			}
		}
		// TODO Auto-generated method stub

	}

}
   list <string[]> record = csvReader.readALL();
   for (STRING[] record : records) {
	   System.out.println("name : " + record(0));
	   System.out.println("email : " + record(1));
	   System.out.println("phone : " + record(2));
	   System.out.println("country : " + record(3));
	   System.out.println("==============================");
   }
	   
   }
