package mycaptain1;
import java.lang.*;
import java.util.*;
class Employee
{
    String name;
    int yoj,sal;
    String add;
    Scanner sc= new Scanner(System.in);
    void getall()
    {
        name=sc.next();
        yoj=sc.nextInt();
        sal=sc.nextInt();
        add=sc.next();
    }
    void putall()
    {
        System.out.println(name+"\t"+yoj+"\t"+sal+"\t"+add);
    }
}
public class Mycaptain1 
{
    public static void main(String args[]){
    Employee e[]=new Employee[3];
    int i;
    Scanner sc= new Scanner(System.in);
    for(i=0;i<3;i++)
    {
        e[i]=new Employee();
    }
    for(i=0;i<3;i++)
    {
        e[i]=new Employee();
        System.out.println("Enter the name,year of join,sallary and the address of the employee "+(i+1));
        e[i].name=sc.next();
        e[i].yoj=sc.nextInt();
        e[i].sal=sc.nextInt();
        e[i].add=sc.next();
    }
    System.out.println("Name\tYOJ\tsallry\tAddress");
    for(i=0;i<3;i++)
    {
        System.out.println(e[i].name+"\t"+e[i].yoj+"\t"+e[i].sal+"\t"+e[i].add);
    }
    }
}
