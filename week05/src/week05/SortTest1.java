package week05;
import java.io.*;
import java.util.*;

public class SortTest1{
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("input1.txt");
			BufferedReader br = new BufferedReader(fr);
			double[] list = new double[100];
			int cnt=0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				double value = Double.parseDouble(line);
				list[cnt++]=value;
			}
			fr.close();
			double[] value = new double[cnt];
			System.arraycopy(list, 0, value, 0, cnt);
			Arrays.sort(value);
			
			FileWriter fr1 = new FileWriter("output1.txt");
			BufferedWriter br1 = new BufferedWriter(fr1);
			for (int k = 0; k < value.length; k++) {
				String bb = Double.toString(value[k]);
				br1.write((k+1) +" : " +bb);
				br1.newLine();
			}
			br1.flush();
			fr1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
