import java.util.Collections;
import java.util.LinkedList;

public class Polynomial {

    public  LinkedList<Term> terms = new LinkedList<>();

    public void addTerm(int coefficient, int exponent){
        terms.add( new Term(coefficient,exponent));

    }


    @Override
    public String toString() {

        String s = "";
        for(Term item : terms){


            if( item.coefficient > 0 && ! s.isEmpty()){
                s += " + " ;
            }

            s += item.toString();

        }
        return s;

    }

}
