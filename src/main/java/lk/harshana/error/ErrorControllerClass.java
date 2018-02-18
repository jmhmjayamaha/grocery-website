package lk.harshana.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorControllerClass implements ErrorController  {

	@Value("${error.requstnotfound}")
	private String PATH;
	
	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@RequestMapping(value="/error" , method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public HashMap<String, String> getErrorMessage() {
		Map<String, String> json = new HashMap<>();
		json.put("description", getErrorPath());		
		json.put("status", "error");
					
		return (HashMap<String, String>) json;
	}
}
