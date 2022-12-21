/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author dubey
 */
public class Parent {

	private int parentId;
	private String parentName;
	private String parentAddress;
	private String parentPhoneNo;
	private int student_id;

	public Parent() {
		super();

	}

	public Parent(String parentName, String parentAddress, String parentPhoneNo) {
		super();
		this.parentName = parentName;
		this.parentAddress = parentAddress;
		this.parentPhoneNo = parentPhoneNo;
	}

	public Parent(int parentId, String parentName, String parentAddress, String parentPhoneNo) {
		super();
		this.parentId = parentId;
		this.parentName = parentName;
		this.parentAddress = parentAddress;
		this.parentPhoneNo = parentPhoneNo;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}

	public String getParentPhoneNo() {
		return parentPhoneNo;
	}

	public void setParentPhoneNo(String parentPhoneNo) {
		this.parentPhoneNo = parentPhoneNo;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String generateRegisterQuery() {
		return "INSERT INTO parent (p_name, address, phone) VALUES(?,?,?)";
	}
        
        public String updateParentTable(){
                return "UPDATE parent SET " +
                         " p_name = " +"'" +this.parentName+"'" +
                        ", address = " +"'"+ this.parentAddress +"'" +
                        ", phone = " +"'"+ this.parentPhoneNo +  "'" +
                        " WHERE parent_id =" +"'"+ this.parentId +"'" + ";";
        }
        
}
