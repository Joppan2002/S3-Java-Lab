class employeer
{
    void display()
    {
        System.out.println("Display function in employee");
    }

   void calcSalary()
    {
        System.out.println("Salary of employee is 10000");
    }
}
    class engineer extends employeer
    {
        void calcSalary()
        {
            super.calcSalary();
            super.display();
            System.out.println("Salary of the Engineer is 20000");
        }
    }
public class employee
{
    public static void main(String args[])
    {
        engineer ob=new engineer();
        ob.calcSalary();
    }
}