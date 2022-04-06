package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main2 {

	public static void main(String[] args) {
		Weather w1=new Weather();
		w1.setCity("Beograd");
		w1.setCountry("Srbija");
		w1.setRegion("Centralna Srbija");
		w1.setDay(false);
		w1.setTemperature(19);
		w1.setWeatherDescription("Vedro sa periodičnim naoblačenjem");
		w1.setWindSpeed(13);
		
		Weather w2=new Weather();
		w2.setCity("Niš");
		w2.setCountry("Srbija");
		w2.setRegion("Južna Srbija");
		w2.setDay(false);
		w2.setTemperature(18);
		w2.setWeatherDescription("Vedro");
		w2.setWindSpeed(6);
		
		Weather w3=new Weather();
		w3.setCity("Subotica");
		w3.setCountry("Srbija");
		w3.setRegion("Severna Srbija");
		w3.setDay(false);
		w3.setTemperature(17);
		w3.setWeatherDescription("Delimično oblačno");
		w3.setWindSpeed(11);
		
		Weather[] weathers= {w1,w2,w3};
		
		try(FileWriter writer=new FileWriter("niz_objekata.json")) {
			
			Gson gson=new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(weathers, writer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
