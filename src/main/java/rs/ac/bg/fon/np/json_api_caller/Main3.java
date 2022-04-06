package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main3 {

	public static void main(String[] args) {
		try(FileReader reader=new FileReader("niz_objekata.json")) {
			
			Gson gson=new Gson();
			
			Type type=new TypeToken<LinkedList<Weather>>() {}.getType();
			
			LinkedList<Weather> weathers=gson.fromJson(reader, type);
			
			for(Weather w : weathers) {
				System.out.println(w+"\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
