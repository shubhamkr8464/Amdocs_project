package com.amdocs_entity;

public class Customer {
   int id;
   String first_name;
   String second_name;
   String phone_no;
   String age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getSecond_name() {
	return second_name;
}
public void setSecond_name(String second_name) {
	this.second_name = second_name;
}
public String getPhone_no() {
	return phone_no;
}
public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", first_name=" + first_name + ", second_name=" + second_name + ", phone_no="
			+ phone_no + ", age=" + age + "]";
}
   

}
