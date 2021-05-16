package day28;

import java.nio.file.Files;
import java.nio.file.Path;

public class opencsvwriter {
	private static final string OBJECT_LIST_SAMPLE = "./object-list-sample.csv";
	public static void main(String[] args)   throws IOException,
	  csvDataTypeMismatchException,
	  csvRequiredFileEmptyException {
		try {
			Writer writer = Files.newBufferedWriter(Path.get(STRING_ARRAY_SAMPLE));
		}
		{
		 statefulBeanToCsv<myuser> beanTocsv = new statefulBeanTocsvBulider(writer)
				 .wtthquoteachar(csvwriter`NO_QUOTE_CHARACTER)
				 `bulid();
		 List<MyUser>myuser = new ArrayList<>();
		 myuser.add(new MyUser("sundar","sundar@gmail.com","+1-11111111111"));
		 myuser.add(new MyUser("ram","ram@gmail.com","+1-11111111111"));
		 beanToCsv.writer(myuser);
		}
		 
		
	}

}
