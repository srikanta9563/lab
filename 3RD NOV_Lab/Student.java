//Develop simple Java program using Wrapper Classes
import java.util.Scanner;
public class Student {
    //this method will calculate fees exempted
    public void calculateFeesStructure(Long studentId,Character studentGrade,Double monthlyFees,Boolean isScholarshipEligible) {
            if (studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) { //checking if the grade is A
                Double fees = (monthlyFees -monthlyFees *10/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("10% of fees is exempted, the calculated fees is : "+fees);
            }
            else if (studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) { //cheecking if the grade is b
                Double fees = (monthlyFees -monthlyFees *8/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("8% of fees is exempted, the calculated fees is : "+fees);
            }
            else if (studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) { //checking if the grade is c
                Double fees = (monthlyFees -monthlyFees *6/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("6% of fees is exempted, the calculated fees is : "+fees);
            }
            else if (studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) { //checking if the grade is d
                Double fees = (monthlyFees -monthlyFees *4/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("4% of fees is exempted, the calculated fees is : "+fees);
            }
            else {
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("Not Eligible for Exemption");
            }}
        //this method will compare marks
        public void	compareMarks(Long Maths,Double English) {

            if (Maths > English) {
                System.out.println("Maths mark is higher than English");
            } else if (Maths < English) {
                System.out.println("English mark is higher than Maths");
            } else {
                System.out.println("Both Are Equal");
            }
        }
        //to validate fees method
       public void validateFees(Double Fees) { //method to validate whether fees is infinite or not
            if(Fees.isInfinite()) {//logic
               System.out.println("Fees is infinite");
            }
           else {
               System.out.println("Fees is not infinite");
           }
           System.out.println(Fees.byteValue()); //printing byte value of fees
        }

        //main method
        public static void main(String[] args) {
            Scanner x=new Scanner(System.in);

            Student a=new Student(); //object of student class
            //calling 1st method with given inputs
            a.calculateFeesStructure((long)254, 'C', (double)600.0, true );
            a.calculateFeesStructure((long)115, 'B', (double)909.50, true );
            a.calculateFeesStructure((long)980, 'G', (double)1810, false );

            System.out.println("COMPARING MARKS");
            System.out.println("ENTER MARKS OF MATH:");
            double english =x.nextDouble();
            //double fees=x.nextDouble();
            System.out.println("ENTER MARKS OF ENGLISH:");
            long maths =x.nextLong();
            a.compareMarks(maths, english);
            System.out.println("ENTER VALIDATING FEES :");
            double fees=x.nextDouble();
            a.validateFees(fees);


        }

    }

