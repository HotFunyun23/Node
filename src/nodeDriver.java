import java.util.Scanner;
public class nodeDriver {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //instances
        Node indiscriminateGenderChild = new Node("indisriminateGenderChildster");
        Node legalGuardianOrEmancipatedIndividual = new Node("legalGuardianOrEmancipatedIndividualster");

        //checks setters/makers
        indiscriminateGenderChild.setParent(legalGuardianOrEmancipatedIndividual);
        legalGuardianOrEmancipatedIndividual.setChild(indiscriminateGenderChild);
        indiscriminateGenderChild.makeChild(legalGuardianOrEmancipatedIndividual);
        indiscriminateGenderChild.makeParent(legalGuardianOrEmancipatedIndividual);
        //checks getters
        System.out.println("if this prints indisriminateGenderChildster then it works: ");
        System.out.println(indiscriminateGenderChild.getData());
        System.out.println("if this prints legalGuardianOrEmancipatedIndividualster then it works: ");
        System.out.println(indiscriminateGenderChild.getData());
        System.out.println("if this prints true then getter legalGuardianOrEmancipatedIndividual works: ");
        System.out.println(legalGuardianOrEmancipatedIndividual.equals(indiscriminateGenderChild.getParent()));
        System.out.println("if this prints true than getter indiscriminateGenderChild: ");
        System.out.println(indiscriminateGenderChild.equals(legalGuardianOrEmancipatedIndividual.getChild()));





    }
}
