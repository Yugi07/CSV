package js;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.Util.Array;
import.util.list;




public class jasontest {
	private static final string SAMPLE_CSV_FILE_PATH = "./src/main/resources/users.csv";
	private static final string SAMPLE_JSON_FILE_PATH = "./src/main/resources/users.json";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader reader = Files.newBufferedReader(path.get(SAMPLE_CSV_FILE_PATH));
			CscToBeanBulider<csvuser> csvToBeanBulider= newCsvToBeanBulider<>(reader);
			csvToBeanBulider.withType(CavUser.class);
			csvToBeabBulider.withIgnoreLeadingWhitespace(true);
			csvToBean<csvuser>csvToBean = csvToBranBulider.bulid();
			List<csvuser> csvuser = csvToBean.parse();
			Gson gson = new Gson();
			string json = gson .tojson(csvUsers);
			Filewriter writer = new FileWriter (SAMPLE_JSON_FILE_PATH);
			Writer.Writer(JSON);
			WRITER.CLOSE();
			bufferreader br = new BufferReader(new FileReader(Sample_JSON_FILE_PATH));
			CsvUser[]usrobj = json.fromjson(br.csvUser[].class);
			List<CSVUser>csvuserlist= Array.asList(usrobj);
		}
		catch (IOException e) {
			e.printStackTrace();
		
		
		}

	}

}
