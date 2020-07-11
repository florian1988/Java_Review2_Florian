public class Exercise extends Exercise1{


    // Create a Java class Exercise containing following parameters
    String Exercise_name;
    String Description;
    int Duration;
    String Position;

    public Exercise(String Exercise_name, String Description, int Duration, String Position){
        this.Exercise_name = Exercise_name;
        this.Description = Description;
        this.Duration = Duration;
        this.Position = Position;
    }

    // Create a print method (using formatting) that prints those objects in a form
    public void doit(){
        System.out.format("%040d%n",0);
        System.out.printf("%s", Exercise_name);
        System.out.printf("%30s%n", "Duration: " + Duration + "sec");
        System.out.printf("%040d%n",0);
        System.out.println();
        System.out.printf("%40s%n","Description: " + Description);

    }


    //Exercises on that are the floor
    public void floor(){
        if(Position == "floor"){
            System.out.format("%040d%n",0);
            System.out.printf("%s", Exercise_name);
            System.out.printf("%30s%n", "Duration: " + Duration +"sec");
            System.out.printf("%040d%n",0);
            System.out.println();
            System.out.printf("%40s%n","Description: " + Description);
        }
    }


    //Exercises that are on the floor and take more than a minute
    public void floorAndTime(){
        if(Position == "floor" && Duration > 60){
            System.out.format("%040d%n",0);
            System.out.printf("%s", Exercise_name);
            System.out.printf("%30s%n", "Duration: " + Duration + "sec");
            System.out.printf("%040d%n",0);
            System.out.println();
            System.out.printf("%40s%n","Description: " + Description);
        }
    }




}
