package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(255,20,255);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.25);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5, 0.5, 0.45, 0.25);
		StdDraw.setPenColor(155,155,155);
		StdDraw.filledRectangle(0.75, 0.5, 0.05, 0.25);
		StdDraw.setPenColor(155,155,155);
		StdDraw.filledRectangle(0.25, 0.5, 0.05, 0.25);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledEllipse(0.5, 0.5, 0.3, 0.15);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.075);
		StdDraw.setPenColor(255,0,0);
		double[] x = { 0.43, 0.57, 0.5};
		double[] y = { 0.43, 0.43, 0.57};
		StdDraw.filledPolygon(x,y);

	}
}