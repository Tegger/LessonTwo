public class main {
    public static void main(String[] args){

        int iCounter = 0;
        double dPi = 3.14;
        boolean  bValid = false;
        char cInitiual = 'a';
        String sName = "Thomas";
        double anSwer = 0;
        double aNs = 0;
        aNs = 4.00 / 5.00;


        //AND &&
        //OR ||
        //NOT !

        if (bValid && 4 > 5) {


            System.out.println("Yo it's true dawg!");

        }else if (iCounter == 0){
            System.out.println("Counter is 0 dude!");

        }else{

            System.out.println("Dude it's false yo!");
        }



        switch (iCounter){
            case 1: {
            //run all code
                break;
            }
            case 2:{
                //run code
                break;
            }
            default:{
                //run if nothing above matches
                break;
            }
        }


        switch(sName){
            case "Dave": {
                break;
            }

            case "Thomas": {
                break;
            }
            case "Andrew": {
                break;
            }

        }


        System.out.println("Answer is " + aNs + "Y'all!");


        int icount = 0;

        while(!bValid){
            //only runs when the parameters are met
            if (icount == 3){
                bValid = true;
            }
            icount++;
            System.out.println(icount);
        }



//        do{
//            //runs once no matter what
//            icount++;
//        }while(icount < 5);


        for (int i = 0; i < 5; i++){
            System.out.println(i);

        }




    }


}
