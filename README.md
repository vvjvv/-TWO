## 实验二  

##计192王静薇2019310201  
##实验目的  
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
2.掌握面向对象的类设计方法（属性、方法）；  
3.掌握类的继承用法，通过构造方法实例化对象；  
4.学会使用super()，用于实例化子类；  
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  

##实验内容  
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
对象示例：	人员（编号、姓名、性别……）  
教师（编号、姓名、性别、所授课程、……）  
学生（编号、姓名、性别、所选课程、……）  
课程（编号、课程名称、上课地点、时间、授课教师、……）  

##实验过程  
1.首先建立一个父类Chooseclass，以及四个子类People.Teacher.Student。  
2.编写选课系统代码。  

##核心方法  
1，方法1  
···  
public static String toString(Student stu) {  
return " 学生姓名: "+stu.name+" 学号: "+stu.number+" 性别: "+stu.sex+" 已选课程: "+stu.courses;  
}  
public static String toChoose(Teacher tea) {  
return " 老师编号: "+tea.number+" 老师姓名: "+tea.name+" 性别: "+tea.sex+" 课程: "+tea.lessonname+" 上课时间:"+tea.lessontime+" 上课地点: "+tea.lessonplace;  
}  
···  
2，方法2  
···  
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
···  

##实验结果  
请输入姓名以及学号  
学生姓名: 王静薇 学号: 2019310201 性别: 女 已选课程: 还没有选课  
老师编号: 1 老师姓名: 李老师 性别: 男 课程: 线性代数 上课时间:9:40 上课地点: 教102  
老师编号: 2 老师姓名: 张老师 性别: 女 课程: 离散数学 上课时间:13:30 上课地点: 教300  
老师编号: 3 老师姓名: 宋老师 性别: 男 课程: 大学物理 上课时间:16：05 上课地点: 教207  
请根据提示开始选课  
学生姓名: 王静薇 学号: 2019310201 性别: 女 已选课程: 线性代数  

##实验感想  
在做这次实验的时候，我遇到了很多问题。出现问题后，我积极的向同学们请教，在他们的耐心讲解下，最终完成了此次实验。通过这次实验，我学会了，并且学会了如何在github平台上写实验报告。令我受益匪浅。
