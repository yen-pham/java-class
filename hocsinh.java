
public class hocsinh {
   private String name ;
   private int age ;
   public hocsinh (String name ,int age)
   {
	   this.name=name;
	   this.age=age;
   }
   public hocsinh ()
   {
 
   }
   public String getName()
   {
	   return this.name;
   }
   public int getAge()
   {
	   return this.age;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public void setAge(int age)
   {
	   this.age=age;
   }
   @Override
   public String toString()
   {
	   return "ten ="+ getName() +" tuoi = "+getAge();
   }
}
