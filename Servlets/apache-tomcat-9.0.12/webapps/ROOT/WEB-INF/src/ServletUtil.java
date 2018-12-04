package com.server.servletUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.server.domain.*;
import com.server.reqrespstatus.*;
import org.json.*;
import com.google.gson.*;
import com.google.gson.reflect.*;//TypeToken<T>
import com.server.pojoutil.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

public class ServletUtil extends HttpServlet{
	protected User user = new User();
	//Next version to append with maven dependecy.
	public JSONObject serialize(User userObject) throws JSONException{
		JSONObject jsonObject = new JSONObject(),temp = null;
		JSONArray jsonAr = new JSONArray(),tempAr = null;
		jsonObject.put("id",23);
		jsonObject.put("name","dairy milk");
		jsonObject.put("price",10.50);

		jsonAr.put(jsonObject);

		temp = new JSONObject();
		temp.put("id","9");
		temp.put("name","cadbury");
		
		jsonObject = new JSONObject();
		jsonObject.put("Products",jsonAr);
		jsonObject.put("Manufacture",temp);
		

		temp = new JSONObject();
		temp.put("data",jsonObject);

		jsonObject = temp;

		return jsonObject;
	}

	//Serialize using GSON Libarary.
	public JSONObject gsonSerializer(Product product) throws JSONException{
		Gson gson = new Gson();
		List<Product> products = new ArrayList<>();
		product.setPid(1233);
		product.setName("Tropicana Orange Tetra");
		product.setCode("667");
		product.setPrice(20.0);
		product.setAvailableStock(50);
		product.setTax(1.2);
		product.setOfferAvailStat(true);
		products.add(product);
		return new JSONObject(gson.toJson(product));
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException{
		resp.setContentType("application/json");
		String name = req.getParameter("name");
		String pass = req.getParameter("paswrd");
		System.out.println("\n\treq's -> "+req.getSession().getId()+"\t"+name+"\t"+pass);
		/*user.setUserName("admin");
		user.setPassword("admin");*/
		user.setUserName("test404");
		user.setPassword("c0n.0p3n();");

		PrintWriter print = resp.getWriter();
		Status status = user.authenticate(name,pass);
		if(status.equals(Status.FORBIDDEN))
			resp.sendError(403);
			
		else if(status.equals(Status.OK))
			try{
				print.println(gsonSerializer(new Product()));

				/* old_ver hardcode
					
					"{\"id\":23412,\"name\":\"blank\"}");
				*/

			}catch(JSONException exp){
				System.out.println("exp caught");
			}

		else
			print.println("{\"error\":{\"type\":\"NOT FOUND\",\"msg\":\"something...;P\"}}");
		
	/**Versions
		/* getHeaderNames
			var elems = req.getHeaderNames();
			System.out.println("\tThis Req's headers");
			String buffer="";
			while(buffer != null){
				buffer=elems.nextElement();
				System.out.println(buffer);
			}
		*/

		/* resp-Ver-1.0
			
				resp.sendRedirect("success.html");
		*/

		/* req_resp-ver-1.0

				resp.sendRedirect("error.html");
		*/

		/* ver-2.0
				resp.setContentType("text/html");
				PrintWriter page = resp.getWriter();
				print.println("<script> alert('incorrect');window.location='http://localhost:8080/Servlets/index.html'; </script>");
				//print.print("<script> document.getElementsByName('result')[0].innerText=\"Incorrect Password\"</script>");
		*/
	
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException{
		this.doGet(req,resp);
	}
}