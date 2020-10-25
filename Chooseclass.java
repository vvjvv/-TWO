package pack2;
public class Chooseclass {
 public static String toString(Student stu) {
  return " 学生姓名: "+stu.name+" 学号: "+stu.number+" 性别: "+stu.sex+" 已选课程: "+stu.courses;
 }
 public static String toChoose(Teacher tea) {
  return " 老师编号: "+tea.number+" 老师姓名: "+tea.name+" 性别: "+tea.sex+" 课程: "+tea.lessonname+" 上课时间:"+tea.lessontime+" 上课地点: "+tea.lessonplace;
 }
 public static void main(String args[]) {
     System.out.println("请输入姓名以及学号");
     Student stu = new Student("王静薇","女",2019310201);
     Teacher tea1 = new Teacher(001,"李老师","男");
     tea1.setCourse1("线性代数");
     tea1.setCourse2("9:40");
     tea1.setCourse3("教102");
     Teacher tea2 = new Teacher(002,"张老师","女");
     tea2.setCourse1("离散数学");
     tea2.setCourse2("13:30");
     tea2.setCourse3("教300");
     Teacher tea3 = new Teacher(003,"宋老师","男");
     tea3.setCourse1("大学物理");
     tea3.setCourse2("16：05");
     tea3.setCourse3("教207");
     System.out.println(toString(stu));
     stu.setCourse("线性代数");
     System.out.println(toChoose(tea1));
     System.out.println(toChoose(tea2));
     System.out.println(toChoose(tea3));
     System.out.println(" 请根据提示开始选课");
     System.out.println(toString(stu));}
}