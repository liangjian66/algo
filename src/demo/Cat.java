package demo;

public class Cat {
   private int age;
   public String name;
   public String[] moneys;
   /*
   *()  形参
   * */
   public void run(String name){
       this.name= name;
       System.out.println(name+":跑起来");
    }

    public Cat(int age,String name){
       this.name = name;
    }
}
