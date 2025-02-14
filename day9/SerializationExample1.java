package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private String ename;
	private int eid;
	private long esalary;

	public Employee(String ename, int eid, long esalary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.esalary = esalary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public long getEsalary() {
		return esalary;
	}

	public void setEsalary(long esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + "]";
	}

}

public class SerializationExample1 {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Employee emp = new Employee("Ranjith", 96, 1000000);
		// Serialization.
		FileOutputStream fout = new FileOutputStream("D:\\ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(emp);
		fout.close();
		objout.close();
		System.out.print("Object Saved!!");
		// DeSerialization
		FileInputStream fin = new FileInputStream("D:\\ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp1 = (Employee) objin.readObject();
		System.out.println(emp1);
		fin.close();
		objin.close();
	}
}
