package Quiz1.java;

import java.util.Scanner;

public class Quiz1 {
	private static Scanner input;

	private int name;
	private int AB;
	private int H;
	private int dbl;
	private int triple;
	private int HR;
	private int R;
	private int BB;
	private int HBP;
	private int SF;

	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.print("Enter player name");
		int name = input.nextInt();
		System.out.print("Enter AtBats");
		int AB = input.nextInt();
		System.out.print("Enter Hits");
		int H = input.nextInt();
		System.out.print("Enter Doubles");
		int dbl = input.nextInt();
		System.out.print("Enter Triples");
		int triple = input.nextInt();
		System.out.print("Enter HomeRuns");
		int HR = input.nextInt();
		System.out.print("Enter Runs");
		int R = input.nextInt();
		System.out.print("Enter Walks");
		int BB = input.nextInt();
		System.out.print("Enter HitByPitch");
		int HBP = input.nextInt();
		System.out.print("Enter SacFlies");
		int SF = input.nextInt();
	}
	private static int BattingAverage(int H, int dbl, int triple, int HR, int AB)
	{
		int BA = (H + dbl + (2*triple) + (3*HR)) / AB;
		return BA;
	}
	
	private static int Singles(int H, int HR, int triple, int dbl)
	{
		int singles = H - (HR + triple + dbl);
		return singles;
	}

	private static int Slugging(int singles, int HR, int triple, int dbl, int AB)
	{
		int SLG = (singles + (2*dbl) + (3*triple) + (4*HR)) / AB;
		return SLG;
	}
	private static int TotalBases(int singles, int HR, int triple, int dbl)
	{
		int TB = singles + (2*dbl) + (3*triple) + (4*HR);
		return TB;
	}
	private static int OnBasePercentage(int H, int BB, int HBP, int SF, int AB)
	{
		int OBP = (H + BB + HBP) / (AB + BB + HBP + SF);
		return OBP;
	}
	private static int OnBaseSlugging(int OBP, int SLG)
	{
		int OBS = OBP + SLG;
		return OBS;
	}
}





