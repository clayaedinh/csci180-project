package app.rest.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.StudentComponent;
import app.entity.Student;

@Component
@Path("/students")
public class StudentController {
	@Autowired
	StudentComponent studentComponent;
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> listStudents (){
		return studentComponent.listStudents();
	}
	
	@GET
	@Path("/findById")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById (@QueryParam("id") Long id){
		return studentComponent.findById(id);
	}
	
	@GET
	@Path("/findByName")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> findByName (@QueryParam("name") String nameQuery){
		return studentComponent.findByName(nameQuery);
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Student addStudent(@QueryParam("name") String name, @QueryParam("email") String email) {
		return studentComponent.saveStudent(name, email);
	}
	
	@GET
	@Path("/delete")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteStudent(@QueryParam("id") Long id) {
		return studentComponent.deleteStudent(id);
	}	
}
