/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
public class Main {

	/**
	 * Serves as the entry point of the application.
	 *
	 * @param args Command line arguments passed to the application.
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println();

		PatternDrawer drawer = new PatternDrawer();
		drawer.drawHeart(4,'*');
	}
}