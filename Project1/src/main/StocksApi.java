package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class StocksApi 
{

	 private static HttpURLConnection connection;  
	 StocksApi()
	 {
		 
	 }
	 
	 StocksApi(String symbol) throws IOException
	 {
		 
		 URL url = new URL ("https://api.polygon.io/v1/meta/symbols/"+symbol+"/company?apiKey=8x61LM0r9vGtMBGutpr_2ZWedQfjtU2f"); 			// this is the url connection with the api key to hit the api and get its contents
			connection = (HttpURLConnection) url.openConnection(); 					// this will hit the connection but not establish it 
			
			connection.setRequestMethod("GET"); 	//connection is etablished here with GET
			connection.setConnectTimeout(5000); 	// interval of times to wait for connection (wait time for connection to the server) 
			connection.setReadTimeout(5000);		// wait time for data to be avaliable for reading 
	
	 }
	 
	 
	 
	 
	 public static void main(String args[]) throws IOException, JSONException
	 {
	
	 }
	 
	 public String[] getStockAPI() throws IOException, JSONException
	 {
		 int status = connection.getResponseCode(); 					// sets the status to the connection 
		 BufferedReader reader; 										// declares reader as type BufferedReader
	   	 String line; 												// declares line as a string 
		 StringBuffer responseContent = new StringBuffer(); 			// this sets responseContent to string buffered which will make everything to a string in the below code
			
			
			
			
			if(status>299) 																						// checks to make sure the request was accepted then takes the contents and inputs it in a string context
			{
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream())); 				// if request fails while trying to read the input stream then we implememt getErrorStream
				while((line = reader.readLine())!=null)															// this will go line by line until there it no more content left 
				{
					responseContent.append(line); 																// this will get the full response of the requested information 
				}
				reader.close(); 							// this will disconnect the connection or close it 
			}
			else
			{
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream())); 				//when input stream works 
				while((line = reader.readLine())!=null)															// this will go line by line until there it no more content left 
				{
					responseContent.append(line); 																// this will get the full response of the requested information 
				}
				reader.close(); 							// this will disconnect the connection or close it 
			}
		 
		 
			JSONObject object = new JSONObject (responseContent.toString()); 		// creates new JSONobject and sets it equal to the contents of the documentation 
			
	     	String CEO = (String) object.get("ceo"); 
			String country = (String) object.get("country"); 
			String desp = (String) object.get("description"); 
			String exchange = (String) object.get("exchange"); 
			String HQcountry = (String) object.get("hq_country"); 
			String HQstate = (String) object.get("hq_state"); 
			String industry = (String) object.get("industry"); 
			//String marketCap = (String) object.get("marketcap"); 
			int num = object.getInt("marketcap");
			String market = Integer.toString(num); 
			String name = (String) object.get("name"); 
			String sector = (String) object.get("sector"); 
			
			String[] array = {CEO, market,desp, exchange, HQcountry, HQstate, industry,name,sector }; 
			
			
			return array; 
			
		 
	 }

	
	 

}
