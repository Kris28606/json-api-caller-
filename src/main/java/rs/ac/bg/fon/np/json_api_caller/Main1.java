package rs.ac.bg.fon.np.json_api_caller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main1 {

	private static final String BASE_URL="http://api.weatherstack.com";
	private static final String API_KEY="";
	private static final String QUERY="Smederevska Palanka";
	
	public static void main(String[] args) {
		
		try {
			
			URL url=new URL(BASE_URL+"/current?access_key="+API_KEY+"&query="+QUERY+"&format=1");
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			Gson gson=new Gson();
			JsonObject result=gson.fromJson(reader, JsonObject.class);
			
			Weather w=new Weather();
			w.setCity(result.get("location").getAsJsonObject().get("name").getAsString());
			w.setCountry(result.get("location").getAsJsonObject().get("country").getAsString());
			w.setDay(result.get("current").getAsJsonObject().get("is_day").getAsBoolean());
			w.setRegion(result.get("location").getAsJsonObject().get("region").getAsString());
			w.setTemperature(result.get("current").getAsJsonObject().get("temperature").getAsInt());
			w.setWeatherDescription(result.get("current").getAsJsonObject().get("weather_descriptions").getAsJsonArray().get(0).getAsString());
			w.setWindSpeed(result.get("current").getAsJsonObject().get("wind_speed").getAsInt());
			
			System.out.println(w);
			
			reader.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
