package app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@NotNull
	@Column
	private Long id;
	
	@NotNull
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String type;
	
	@Column
	private LocalDateTime due_date;
	
	@Column
	private String location;
	
	@NotNull
	@Column
	private Long student_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getDue_date() {
		return due_date;
	}

	public void setDue_date(LocalDateTime due_date) {
		this.due_date = due_date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", description=" + description + ", type=" + type
				+ ", due_date=" + due_date + ", location=" + location + ", student_id=" + student_id + "]";
	}
	
}
