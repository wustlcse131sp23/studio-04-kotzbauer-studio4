package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int[] color = new int[3];
		for (int i =0; i<3; i++) {
			color[i] = in.nextInt();
		}
		boolean fill = in.nextBoolean();
		double[] dimensions = new double[4];
		for (int i =0; i<4; i++) {
			dimensions[i] = in.nextDouble();
		}
		StdDraw.setPenColor(color[0], color[1], color[2]);
		if (shape.equals("rectangle")) {
			if (fill == true) {
				StdDraw.filledRectangle(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);
			}
			else {
				StdDraw.rectangle(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);
			}
		}
		if (shape.equals("ellipse")) {
			if (fill == true) {
				StdDraw.filledEllipse(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);
			}
			else {
				StdDraw.ellipse(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);
			}
		}
	}	
}
