package pojo;

import java.io.ObjectStreamClass;

public class product {
String pname; 
int pid;
int pprice;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getId() {
	return pid;
}
public void setId(int pid) {
	this.pid = pid;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
@Override
public String toString() {
	return "product [pid=" + pid + ", pprice=" + pprice + "]";
}
public static void main(String[] args) {
	product product1 = new product();
	product1.setId(10);
	product1.setPname("tom");
	product1.setPprice(12000);
	System.out.println(product1);
	System.out.println(product1.getId());
	System.out.println(product1.getPname());
	System.out.println(product1.getPprice());
}

}