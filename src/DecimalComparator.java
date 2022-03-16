public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numA,double numB){
        numA*=1000;
        numB*=1000;
        int a= (int)numA;
        int b= (int)numB;
        if(a==b) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.5675,3.5658));
    }
}
