package homework.hw1.lesson3;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber plus(ComplexNumber another) {
        double newReal = this.real + another.real;
        double newImagi = this.imaginary + another.imaginary;
        this.real = newReal;
        this.imaginary = newImagi;
        return this;
    }

    public ComplexNumber multi(ComplexNumber another) {
        double newReal = this.real * another.real - (this.imaginary * another.imaginary);
        double newImagi = this.real * another.imaginary + (this.imaginary * another.real);
        this.real = newReal;
        this.imaginary = newImagi;
        return this;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.2f+%.2fi", this.real, this.imaginary);
        }
        return String.format("%.2f-%.2fi", this.real, Math.abs(this.imaginary));
    }

    public ComplexNumber pluss(ComplexNumber[] list) {
        ComplexNumber result = this;
        for (ComplexNumber element : list) {
            this.plus(element);
        }
        return this;
    }

    public ComplexNumber multis(ComplexNumber[] list) {
        ComplexNumber result = this;
        for (ComplexNumber element : list) {
            this.multi(element);
        }
        return this;
    }

    public static void main(String[] args) {
        ComplexNumber test1 = new ComplexNumber(1, 2);
        ComplexNumber test2 = new ComplexNumber(3, 4);
        ComplexNumber test3 = new ComplexNumber(5, 6);
        ComplexNumber[] list = {test2, test3};
        test1.multis(list);
        System.out.println(test1);
    }
}
