package entities;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;

public class FinalGrade {

    public double a;
    public double b;
    public double c;

    public double finalGrade() {
        return a + b + c;
    }

    public double missingPoints() {
        return 60 - finalGrade();
    }

    @Override
    public String toString() {
        return "FINAL GRADE = "
                + String.format("%.2f%n", finalGrade());
    }
}
