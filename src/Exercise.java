public class Exercise {


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

    private void start(){
        System.out.println();
        System.out.format( "%20s%n", " Start");
    }

    // Create a print method (using formatting) that prints those objects in a form
    public void doit(){
        start();
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
            start();
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
            start();
            System.out.format("%040d%n",0);
            System.out.printf("%s", Exercise_name);
            System.out.printf("%30s%n", "Duration: " + Duration + "sec");
            System.out.printf("%040d%n",0);
            System.out.println();
            System.out.printf("%40s%n","Description: " + Description);
        }
    }




}
