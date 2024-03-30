
import java.util.ArrayList;
import java.util.Scanner;

class BloodPressure{
    private int id,yob,systolic,diastolic;
    private String name;
    
    public BloodPressure(int ID,String Name,int Yob,int Systolic,int Diastolic){
   
        this.id = ID;
        this.yob = Yob;
        this.diastolic = Diastolic;
        this.systolic = Systolic;
        this.name = Name;
    }
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public int getyob(){
        return yob;
    }
    
    public int getsystolic(){
        return systolic;
    }
    
    public int getDiastolic(){
        return diastolic;
    }
    
    public void setId(int i){
        id = i;
    }
    
    public void setName(String N){
        name = N;
    }
    
    public void setyob(int Y){
        yob = Y;
    }
    
    public void setsystolic(int S){
        systolic = S;
    }
    
    public void setDiastolic(int D){
        diastolic = D;
    }
    public int calculate(){
        int age = 2024-yob;
        return age;
    } 
       
    public void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Year of Birth : "+yob);
        System.out.println("Systolic : "+systolic);
        System.out.println("Diastolic : "+diastolic);
        System.out.println("Age : "+calculate());
        System.out.println( );
        
        //BLOOD PRESSURE CATEGORY
        System.out.println("Blood Pressure Category\n--------------------------");
        
        if(systolic <= 120  && diastolic <= 80){
            System.out.println("Blood Pressure Is Normal");
        }
        
        else if(systolic > 120 && systolic <= 129 && diastolic <=80){
            System.out.println("Blood Pressure Is Elevated");
        }
        
        else if(systolic >= 130 && systolic <= 139){
            if(diastolic > 80 && diastolic <= 89){
                System.out.println("Blood Pressure Is Hypertension Stage 1");   
            }
            
            else if(diastolic >= 90 && diastolic < 120){
                System.out.println("Blood Pressure Is Hypertension Stage 2");
            }
            
        }
        
        else if((systolic >=140 && systolic < 180) || (diastolic >= 90 && diastolic < 120)){
            System.out.println("Blood Pressure Is Hypertension Stage 2"); 
        }
        
        else if(systolic >= 180 || diastolic > 120 ){
            System.out.println("Blood Pressure Is Hypertensive crisis");
        }
        System.out.println( );
        
        //LIMITED AGE BLOOD PRESSURE RANGE
        System.out.println("This Blood pressure Should Be Maintain In Your Age\n-----------------------------------------------------");
        
        
        if(calculate() > 0 && calculate() < 1){
            System.out.println("MIN : 75/50     NORMAL : 90/60   MAX : 100/75 " );
        }
        
        if(calculate() >= 1 && calculate() <= 5){
            System.out.println("MIN : 80/55     NORMAL : 95/65   MAX : 110/79 " );
        }
        
        if(calculate() >= 6 && calculate() <= 13){
            System.out.println("MIN : 90/60     NORMAL : 105/70   MAX : 115/80 " );
        }
        
        if(calculate() >= 14 && calculate() <= 19){
            System.out.println("MIN : 105/73     NORMAL : 117/77   MAX : 120/81 "   );
        }
        
        if(calculate() >= 20 && calculate() <= 24){
            System.out.println("MIN : 108/75     NORMAL : 120/79   MAX : 132/83 "   );
        }
        
        if(calculate() >= 25 && calculate() <= 29){
            System.out.println("MIN : 109/76     NORMAL : 121/80   MAX : 133/84 "   );
        }
        
        if(calculate() >= 30 && calculate() <= 34){
            System.out.println("MIN : 110/77     NORMAL : 122/81   MAX : 134/85 "   );
        }
        
        if(calculate() >= 35 && calculate() <= 39){
            System.out.println("MIN : 111/78     NORMAL : 123/82   MAX : 135/86 "   );
        }
        
        if(calculate() >= 40 && calculate() <= 44){
            System.out.println("MIN : 112/79     NORMAL : 125/83   MAX : 137/87 "   );
        }
        
        if(calculate() >= 45 && calculate() <= 49){
            System.out.println("MIN : 115/80     NORMAL : 127/84   MAX : 139/88 "   );
        }
        
        if(calculate() >= 50 && calculate() <= 54){
            System.out.println("MIN : 116/81     NORMAL : 129/85   MAX : 142/89 "   );
        }
        
        if(calculate() >= 55 && calculate() <= 59){
            System.out.println("MIN : 118/82     NORMAL : 131/86   MAX : 144/90 "   );
        }
        
        if(calculate() >= 60 && calculate() <= 64){
            System.out.println("MIN : 121/83     NORMAL : 134/87   MAX : 147/91 "   );
        }
        
        
    }    
        
    
} 
/**
 *
 * @author Rasan
 */
public class Tester {
    private static BloodPressure record(){
        Scanner R = new Scanner(System.in);
        System.out.print("Enter Your ID: ");
        int id = R.nextInt();
        System.out.print("Enter Your Name: ");
        String name = R.next();
        System.out.print("Enter Your Year of Birth: ");
        int yob = R.nextInt();
        System.out.print("Enter The Systolic : ");
        int systolic = R.nextInt();
        System.out.print("Enter The Diastolic : ");
        int diastolic = R.nextInt();
        return new BloodPressure(id,name,yob,systolic, diastolic);

    }
    private static int getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        return scanner.nextInt();
    }

    private static BloodPressure getbpBYId(ArrayList<BloodPressure> bloodpressureRecords, int id) {
        for (BloodPressure bloodpressure : bloodpressureRecords) {
            if (bloodpressure.getId() == id) {
                return bloodpressure;
            }
        }
        return null;
    }
   
    
    public static void displayMenu(){
        System.out.println(" Blood pressure monitor\n-----------------------------");
       
        System.out.println("1. Create a record."); 
        System.out.println("2. Show blood pressure data for all users.");
        System.out.println("3. Show blood pressure data for a selected user.");  
        System.out.println("4. Delete all");
        System.out.println("5. Exit application.");
        
        System.out.print("Enter Your Choise : ");
    }
    
    public static void index(){
        System.out.println("To Show All Records\n--------------------------");
        
    }
    public static void view(int Id){
        System.out.println("To Show One Record For The Given Id.\n--------------------------------------------------");
        
    } 
    
    public static void create(){
        System.out.println("Create A New Record\n-------------------------------"); 
        
    }
    
    public static void delete(){
        System.out.println("All Blood Pressure Deleted Successfully\n--------------------------------------------------");
        
    }
    public static void exit(){
        System.out.println("Thank You For Using The Blood Pressure Monitor\n--------------------------------------------------");
        System.exit(0);
    } 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <BloodPressure> bloodpressure = new ArrayList<>(); 
        int choise;
        Scanner in = new Scanner(System.in);
        do{
            displayMenu();
            choise = in.nextInt();
            switch(choise){
                case 1:
                    create();
                    for(int j=0 ; j < 5 ; j++){
                        bloodpressure.add(record());
                        System.out.println("----------------------------");
                    }
                    break;
                    
                case 2:
                    index();
                    for(BloodPressure BP : bloodpressure){
                        BP.display();                       
                        System.out.println("---------------------------");
                    }
                    
                    break;
                
                case 3:
                    int id = getId();
                    view(id);
                    BloodPressure bloodpressureToDisplay = getbpBYId(bloodpressure, id);
                    if (bloodpressureToDisplay != null) {
                        bloodpressureToDisplay.display(); 
                        System.out.println("----------------------------");
                    }
                    
                    else {
                        System.out.println("No bloodpressure record found for the given ID.");
                    }
                    
                    break;
                    
                case 4:
                    delete();
                    bloodpressure.clear();
                    break;
                    
                case 5:
                    exit();
                    break;
                    
                default:
                    System.out.println("Invalid Choise");
                 
            }
                    
        }
        while(true);
        
        
    }
    
    
}
