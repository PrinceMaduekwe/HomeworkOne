public class Term {

    public int coefficient;
    public int exponent;
    public int constant;





    public Term (){
        coefficient = 1;
        exponent = 1;
    }

    public Term (int coefficient, int exponent){
        this.coefficient = coefficient;
        this.exponent = exponent;

    }


    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }



    @Override
    public String toString() {
        return  coefficient + "x^" + exponent;
    }


}

