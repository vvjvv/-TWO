package pack2;
public class Student extends People {
 public String courses = "��û��ѡ��";
 public Student(String name,String sex,int number) {
  super();
  this.name=name;
  this.sex=sex;
  this.number=number;
 }
 void setCourse(String keming) {
  this.courses=keming;
 }
}