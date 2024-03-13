package ttt;

public class Math {

    int factorial(int i){
        int f = 1;
        for (int x = 1 ; x <= i ; x ++){
            f = f * x;
        }
        return f;
    }
    double sin(double x){
        double sin = 0;
        int count = 0;
        for ( int i = 1 ; i < 10 ; i = i + 2){
            double bit = x/factorial(i);
            if (count % 2 == 0){
                sin = sin + bit;

            } else if (count % 2 != 0) {
                sin = sin - bit;

            }
            count ++;
        }
        return sin;
    }
}
