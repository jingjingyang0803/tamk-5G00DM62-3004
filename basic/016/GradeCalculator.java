import java.text.DecimalFormat;

/**
 * @author 		Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0211 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class GradeCalculator {

	/**
	 * Calculates and prints the weighted average grade.
	 *
	 * Exercise: 1.6
	 *     1.6 Calculate grade
	 *
	 *         A course consists of 3 separate parts which each has a
	 *         different ECTS points (= FI: "opintopiste"). Calculate final
	 *         grade based on weighted average mean[1]. Use many different
	 *         kinds of variables in the program. The Final grade can have
	 *         any number of decimals in the output.
	 *
	 *                         ECTS   Grade
	 *         -----------------------------
	 *         Exam            2      2
	 *         Design          1      4
	 *         Implementation  3      4
	 *         -----------------------------
	 *         Totals          6      N.NNN (Final Grade)
	 *
	 *         [1] https://en.wikipedia.org/wiki/Weighted_arithmetic_mean
	 *
	 * @param  args  Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		double examEcts = 2, examGrade = 2;
		double designEcts = 1, designGrade = 4;
		double implEcts = 3, implGrade = 4;

		double finalGrade = calculateWeightedAverageGrade(examEcts, examGrade,
				designEcts, designGrade, implEcts, implGrade);

		System.out.println("Final Grade = " + finalGrade);
	}

	/**
	 * Calculates the weighted average grade.
	 *
	 * The calculation is based on individual grades and their corresponding
	 * ECTS credits.
	 *
	 * @param examEcts     The ECTS credits for the exam.
	 * @param examGrade    The grade obtained in the exam.
	 * @param designEcts   The ECTS credits for the design assessment.
	 * @param designGrade  The grade obtained in the design assessment.
	 * @param implEcts     The ECTS credits for the implementation assessment.
	 * @param implGrade    The grade obtained in the implementation assessment.
	 * @return averageGrade The weighted average final grade.
	 */
	public static double calculateWeightedAverageGrade(double examEcts,
													   double examGrade, double designEcts, double designGrade,
													   double implEcts, double implGrade) {
		double averageGrade = (examEcts * examGrade +  designEcts * designGrade
				+ implEcts * implGrade) / (examEcts + designEcts + implEcts);
		return averageGrade;
	}
}

// End of file
