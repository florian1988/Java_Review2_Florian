public class Exercise_main {


        //Using the text above, create 6 objects.
    public static void main(String[] args) {

        Exercise ex1 = new Exercise("Push Ups","Place your hands on the floor.\n" +" Raise up onto your toes so that all of your body weight is on your hands and your feet.\n" + " Bend your elbows and lower your chest down toward the floor.\n" + " Then, push off the floor and extend them so that you return to starting position.",
                30, "floor");
        Exercise ex2 = new Exercise("Planks", "Start on the floor on your hands and knees.\n " +"Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart.\n" + " Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.",
                90, "floor");
        Exercise ex3 = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart,\n"+" hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down. \n" + " Goto a squat and exhale, then explode back up to standing, driving through heels.",
                45, "stand up");
        Exercise ex4 = new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor.\n"+" Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle. \n" + " Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs.\n" + " Return to the starting position and repeat.",
                60, "floor");
        Exercise ex5 = new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks.\n"+" Stay for 15 seconds, then repeat with your other leg.",
                90,"stand up");
        Exercise ex6 = new Exercise("Sidewards Back Stretch", " Go into standing position, put your hands on your hips \n"+" and then stretch with one hand over your head to the opposite side. Repeat with other hand.",
                60, "stand up");


        // Put your objects into an array and call your printing method in the loop.
        Exercise list[] =  new Exercise[6];

        list[0] = ex1;
        list[1] = ex2;
        list[2] = ex3;
        list[3] = ex4;
        list[4] = ex5;
        list[5] = ex6;

        for( int i = 0; i <list.length; i++){
            list[i].doit();
        }


        //Exercises on that are the floor
        for( int i = 0; i <list.length; i++){
            list[i].floor();
        }
        //Exercises that are on the floor and take more than a minute
        for( int i = 0; i <list.length; i++){
            list[i].floorAndTime();
        }





    }
}
