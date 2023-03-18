//Спроєктуйте три класи, один з яких абстрактний, інші - його нащадки.

public class Main
{
    public static void main(String[] args) 
    {   
    	Teacher sam = new Teacher("Павел Александрович Савинков", "Доцент", "5 лет", "Кандидат наук");
        sam.display();
        Driver bob = new Driver("Владимир Сергеевич Соловьев", "Бакалавр", "5 лет", "B, A1");
        bob.display();
    }
}
abstract class Person 
{
    private String name;
    public String getName() 
    { return name; }
    
    public Person(String name)
    {
        this.name=name;
    }
  
    public abstract void display();
}
 
class Teacher extends Person
{
    private String bank1;
    private String bank2;
    private String bank3;
     
    public Teacher(String name, String title, String experience, String sciencedegree) 
    {
        super(name);
        this.bank1 = title;
        this.bank2 = experience;
        this.bank3 = sciencedegree;
    }
     
    public void display()
    {      
        System.out.printf("Имя учителя: %s \nУченое звание: %s \nРабочий стаж: %s \nНаучная степень: %s\n\n", super.getName(), bank1, bank2, bank3);
    }
}
 
class Driver extends Person
{
    private String bank1;
    private String bank2;
    private String bank3;
     
    public Driver(String name, String title, String experience, String drivercategories) 
    {
        super(name);
        this.bank1 = title; 
        this.bank2 = experience;
        this.bank3 = drivercategories;
    }
     
    public void display()
    {
        System.out.printf("Имя водителя: %s \nУченое звание: %s \nРабочий стаж: %s \nКатегории водителя: %s \n", super.getName(), bank1, bank2, bank3);
    }
}