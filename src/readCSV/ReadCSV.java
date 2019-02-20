package readCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		
		//Read data from CSV file
		
		
		List<String[]> data = new ArrayList<String[]>();
		String filename = "F:\\Java files\\accounts.csv";
		String dataRow;
		
		
		try {
			//open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//read the data as long as it's not empty
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);				
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			System.out.print(" [ ");
			for (String field : account) {
				System.out.print(field + " ");
			}
			System.out.println((" ]"));
		}
		
		
		
	}

}
