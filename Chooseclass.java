package pack2;
public class Chooseclass {
 public static String toString(Student stu) {
  return " ѧ������: "+stu.name+" ѧ��: "+stu.number+" �Ա�: "+stu.sex+" ��ѡ�γ�: "+stu.courses;
 }
 public static String toChoose(Teacher tea) {
  return " ��ʦ���: "+tea.number+" ��ʦ����: "+tea.name+" �Ա�: "+tea.sex+" �γ�: "+tea.lessonname+" �Ͽ�ʱ��:"+tea.lessontime+" �Ͽεص�: "+tea.lessonplace;
 }
 public static void main(String args[]) {
     System.out.println("�����������Լ�ѧ��");
     Student stu = new Student("����ޱ","Ů",2019310201);
     Teacher tea1 = new Teacher(001,"����ʦ","��");
     tea1.setCourse1("���Դ���");
     tea1.setCourse2("9:40");
     tea1.setCourse3("��102");
     Teacher tea2 = new Teacher(002,"����ʦ","Ů");
     tea2.setCourse1("��ɢ��ѧ");
     tea2.setCourse2("13:30");
     tea2.setCourse3("��300");
     Teacher tea3 = new Teacher(003,"����ʦ","��");
     tea3.setCourse1("��ѧ����");
     tea3.setCourse2("16��05");
     tea3.setCourse3("��207");
     System.out.println(toString(stu));
     stu.setCourse("���Դ���");
     System.out.println(toChoose(tea1));
     System.out.println(toChoose(tea2));
     System.out.println(toChoose(tea3));
     System.out.println(" �������ʾ��ʼѡ��");
     System.out.println(toString(stu));}
}