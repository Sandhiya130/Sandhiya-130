package com.marticus.hyperloopbook;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column
   private String From;
   @Column
   private String To;
   @Column
   DateTimeFormatter dateFormat =DateTimeFormatter.ofPattern("M/d/yyyy");
private CharSequence userInput;
   LocalDate Date=LocalDate.parse(userInput, dateFormat);
  @Column
  private String PreferenceCouch;
  @Column
  private int TrainNo;
  
  @Column
	private String Name;
	@Column
	private int Age;
	@Column
	private String Gender;
	

	@Column
	private String State;
	@Column
	private String Proof;
  public String getFrom() {
	return From;
}
public void setFrom(String from) {
	From = from;
}
public String getTo() {
	return To;
}
public void setTo(String to) {
	To = to;
}
public DateTimeFormatter getDateFormat() {
	return dateFormat;
}
public void setDateFormat(DateTimeFormatter dateFormat) {
	this.dateFormat = dateFormat;
}
public CharSequence getUserInput() {
	return userInput;
}
public void setUserInput(CharSequence userInput) {
	this.userInput = userInput;
}
public LocalDate getDate() {
	return Date;
}
public void setDate(LocalDate date) {
	Date = date;
}
public String getPreferenceCouch() {
	return PreferenceCouch;
}
public void setPreferenceCouch(String preferenceCouch) {
	PreferenceCouch = preferenceCouch;
}
public int getTrainNo() {
	return TrainNo;
}
public void setTrainNo(int trainNo) {
	TrainNo = trainNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getProof() {
	return Proof;
}
public void setProof(String proof) {
	Proof = proof;
}

  
   
   

}
