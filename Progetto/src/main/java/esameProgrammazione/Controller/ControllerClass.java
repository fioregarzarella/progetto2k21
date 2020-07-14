package esameProgrammazione.Controller;

import java.util.ArrayList;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.parser.ParseException;

import esameProgrammazione.Database.DataBase;
import esameProgrammazione.Model.ApiParams;
import esameProgrammazione.Model.Post;
import esameProgrammazione.Model.postParams;
import esameProgrammazione.Service.ImplPostService;

@RestController
public class ControllerClass {
	//@Autowired
	ImplPostService implPostService;
	
	
	@GetMapping("/about")
     public String about() {
		return "about";
		}
	/*
		@GetMapping("/GetPosts")
	public ResponseEntity<Object> getPosts(){
		ImplPostService = new ImplPostService(null,null);
		return new ResponseEntity<>(ImplPostService.getPosts(), HttpStatus.OK);
	}
	
	 */
	@GetMapping("/GetPosts")
	public  ArrayList<Post> getps() throws IOException {
		ApiParams type= new ApiParams();
		postParams params= new postParams();
		ImplPostService implPostService = new ImplPostService(type,params);
		return implPostService.getPosts();
	}
	
	@RequestMapping(value = "/Getpost2", method = RequestMethod.GET)
	public ResponseEntity<Object>  getps2() throws IOException{
		
		ApiParams type= new ApiParams();
		postParams params= new postParams();
		ImplPostService implPostService = new ImplPostService(type,params);
		return new ResponseEntity<>(implPostService.getPosts(), HttpStatus.CREATED);

	
	}  }
		
	
	
