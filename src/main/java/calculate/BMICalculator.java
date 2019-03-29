package calculate;

public class BMICalculator implements Calculator{

    private int weight;
    private int height;

    public BMICalculator(int height, int weight){
        this.weight = weight;
        this.height = height;
    }

    public double calculate() {
        double h = height/100.0;
        return (double) weight/(h*h);
    }

    public String interpret() {
        double bmi = calculate();
        if (bmi<18.5) {
            return "niedowaga";
        }else if (bmi<=24.9){
            return "waga prawidłowa";
        }else if (bmi<=29.9) {
            return "nadwaga";
        }else {
            return "otyłość";
        }
    }
}
