package _03_02;

public class GradingSystem {

  public boolean isAPass(int percentage) {
    boolean veredict;
    // Return true if the percentage is higher than or equal to 60.
    // Otherwise return false.
    if (percentage >= 60) {
      veredict = true;
    } else {
      veredict = false;
    }
    
    return veredict;
  }

  public char getGrade(int percentage) {
    char grade;
    // If the percentage is 90 or above, return 'A'.
    // If it's 80-89, return 'B'.
    // If it's 70-79, return 'C'.
    // If it's 60-69, return 'D'.
    // If it's less than 60, return 'F'.
    
    //With else if
    if (percentage >= 90) {
      grade = 'A';
    } else if ( 80 <= percentage && percentage <= 89) {
      grade = 'B';
    } else if ( 70 <= percentage && percentage <= 79 ) {
      grade = 'C';
    } else if ( 60 <= percentage && percentage <= 69) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    return grade;
  }

  public String retakeMessage(int percentage, boolean allowedToRetake) {
    String sentence;
    // If percentage is less than 60 and allowedToRetake is true, return a String
    // that says "The student has been entered for a retake."
    // If percentage is less than 60 and allowedToRetake is false, return a String
    // that says "The student is not allowed to retake this exam."
    // If percentage is 60 or higher, return a String that says "A retake is not
    // required."

    if (percentage < 60 && allowedToRetake == true) {
      sentence = "The student has been entered for a retake.";
    } else if (percentage < 60 && allowedToRetake == false)
      sentence = "The student is not allowed to retake this exam.";
    else {
      sentence = "A retake is not required.";
    }
    
    return sentence;
  }

}
