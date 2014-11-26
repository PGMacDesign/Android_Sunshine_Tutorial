package com.example.androidtutorialsunshine;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//Passing in a string form of the JSON returned by the api call
public class WeatherDataParser {

	public static double getMaxTemperatureForDay(String weatherJSONString, int dayInfo) throws JSONException{
		
		JSONObject weather = new JSONObject (weatherJSONString);
		JSONArray days = weather.getJSONArray("list");
		//JSONObject dayInfo = days.getJSONObject(dayIndex);
		//JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
		
		//return temperatureInfo.getDouble("max");
		
		return 2.0;
	}
	
}
