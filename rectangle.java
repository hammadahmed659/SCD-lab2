import java.util.Scanner;

public class Rectangle {
    // Attributes with default values
    private double length = 1.0;
    private double width = 1.0;

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length with validation
    public void setLength(double length) {
        if (isValidDimension(length)) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0.0 and less than 20.0.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width with validation
    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0.0 and less than 20.0.");
        }
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Helper method to validate dimensions
    private boolean isValidDimension(double value) {
        return value > 0.0 && value < 20.0;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        // Input length
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        // Input width
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        // Display area and perimeter
        System.out.printf("Rectangle Length: %.2f\n", rectangle.getLength());
        System.out.printf("Rectangle Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());

        scanner.close();
    }
}
