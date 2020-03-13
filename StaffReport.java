import java.util.Scanner;

   public class StaffReport{
   
   
      public static void main (String [] args){
      
      Scanner sc = new Scanner(System.in);
      
            
      System.out.print("Enter Staff Name:");
      String name=sc.nextLine();
      
      System.out.print("Enter Staff ID:");
      String id=sc.nextLine();
      
      System.out.print("Enter Staff Income Type:");
      String incomeType=sc.nextLine();
      
      System.out.print("Enter Income Amount:RM");
      double amount=sc.nextDouble();
      
      System.out.print("Enter Income Tax:");
      double tax=sc.nextDouble();
      
      //Call Income Class
      Income income = new Income(incomeType,amount,tax);
      
      //Call Staff Class
      Staff info = new Staff(name,id,income);
      
      //Display Output
      info.displayStaffInfo();
      System.out.println();
      info.displayIncomeInfo();
      }//end main
      
           }//end staff report class
      
      class Staff{
         String name;
         String id;
         Income Income;
         
         Staff(String name,String id,Income Income){
            this.name=name;
            this.id=id;
            this.Income=Income;
          }
          
          String getName(){
            return name;
            }
            
            String getId(){
               return id;
               }
               
               double calculateNetIncome(){
                  return Income.getAmount() - Income.getTotalTax();
                  }
                  
       void displayStaffInfo(){
               System.out.println("Staff Info");
               System.out.println("-------------------");
               System.out.println("Name\t\t\t\t\t\t\t:" +name);
               System.out.println("ID\t\t\t\t\t\t\t\t:" +id);
            }//end display staff info
              
       void displayIncomeInfo(){
               System.out.println("Income Info");
               System.out.println("-------------------");
               System.out.println("Income Type\t\t\t\t\t:" +Income.getIncomeType());
               System.out.println("Amount of Income\t\t\t:RM" +Income.getAmount());
               System.out.println("Tax\t\t\t\t\t\t\t:" +Income.getTax() + "%");
               System.out.println("Total net income\t\t\t:RM" +calculateNetIncome());
               System.out.println("Total tax paid\t\t\t\t:RM" +Income.getTotalTax());
               }//end display income info 
         


            
}
      
      class Income{
         String incomeType="";
         double amount;
         double tax;
         double totalTax;
         
         Income(String incomeType,double amount, double tax){
            this.incomeType = incomeType;
            this.amount = amount;
            this.tax = tax;
            }
         
         String getIncomeType(){
            return incomeType;
         }
         
         double getAmount(){
            return amount;
         }
         
         double getTax(){
            return tax;
         }
         
         double getTotalTax(){
            totalTax=(tax/100)*amount;
            return totalTax;
            }
            }//end class income
            
                       
                       
 
         
      
      
      