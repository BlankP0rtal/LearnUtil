//Http requester

package com.profile.user.control;

import com.profile.user.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import com.google.gson.*;
import java.lang.reflect.*;
import java.util.List;
import com.google.gson.reflect.*;
import com.google.gson.stream.JsonReader;

public class UserController{
	public void hitGetRequest(){
		try{
			CloseableHttpClient httpClient = HttpClients.createDefault();
			//HttpGet request = new HttpGet("http://localhost:8080/ServletUtil?name=test404&paswrd=c0n.0p3n();");
			HttpGet otherReq = new HttpGet("https://jsonplaceholder.typicode.com/users");
			CloseableHttpResponse response = httpClient.execute(otherReq);
			
			System.out.println(response.getEntity().getContentType());

			InputStream inp = response.getEntity().getContent();
			
			JsonReader reader = new JsonReader(new InputStreamReader(inp, "UTF-8"));
			
			/*Console view[type=string]
				BufferedReader bufRead = new BufferedReader(new InputStreamReader(inp));
				String buffer=bufRead.readLine();
				while(buffer != null){
					System.out.println(buffer);
					buffer=bufRead.readLine();
				}
			*/
		}catch(IOException ioExcep){
			System.out.println(ioExcep.toString());
		}
	}
}