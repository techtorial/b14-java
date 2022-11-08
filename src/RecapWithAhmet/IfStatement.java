package RecapWithAhmet;

public class IfStatement {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-Many technical interview questions are related with the Conditions

             AND                                    OR
        TRUE && TRUE --> TRUE                    TRUE || TRUE --> TRUE
        TRUE && FALSE --> FALSE                  TRUE || FALSE --> TRUE
        FALSE && FALSE --> FALSE                 FALSE || FALSE --> FALSE

     */
    public static void main(String[] args) {

        int rabbitPopulation=20;
        int catpigElephantPopulation=19;
        int birdspopulation=3;

        boolean comparison=rabbitPopulation<birdspopulation;

        if(rabbitPopulation<catpigElephantPopulation||rabbitPopulation>birdspopulation){
            System.out.println("We have more rabbits");
        }else{
            System.out.println("We have more Birds");
        }
        if(comparison){
            System.out.println("Hello");
        }
    }

}
