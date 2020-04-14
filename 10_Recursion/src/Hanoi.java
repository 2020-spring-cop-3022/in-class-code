import java.util.ArrayList;
import java.util.Stack;

class Hanoi
{
	private int numberOfMoves = 0;
	private int diskCount;
	private ArrayList<Stack<Integer>> towers;
	private static final int numberOfDisksToTest = 15;

	public Hanoi (int diskCount)
	{
		this.diskCount = diskCount;
		this.towers = new ArrayList<Stack<Integer>>();

		for (int i= 0; i < 3; ++i)
		{
			this.towers.add(new Stack<Integer>());
		}

		for (int i = diskCount; i > 0; --i)
		{
			this.towers.get(0).push(new Integer(i));
		}
	}

	public int getMoveCount ()
	{
		return this.numberOfMoves;
	}

	public String move (int numberOfDisksToMove, int from, int to, int via)
	{
		if (numberOfDisksToMove < 1)
		{
			return "";
		}
		else if (numberOfDisksToMove == 1)
		{
			Integer movedDisk = this.towers.get(from).pop();
			this.towers.get(to).push(movedDisk);
			++this.numberOfMoves;
			return "Moving "+movedDisk+" from "+(char)(from + 'A')+" to "+(char)(to + 'A')+"\n";
		}
		else
		{
			return this.move(numberOfDisksToMove - 1, from, via, to)
				+ this.move(1, from, to, via)
				+ this.move(numberOfDisksToMove - 1, via, to, from);
		}
	}

	public static void main (String[] args)
	{
		System.out.println("");
		System.out.println("Moving "+numberOfDisksToTest+" disks.");
		Hanoi h = new Hanoi(numberOfDisksToTest);
		System.out.println(h.move(numberOfDisksToTest, 0, 1, 2));
		System.out.println("Total moves: "+h.getMoveCount());

		System.out.println("====================\n");
		System.out.println("Moving 0 disks.");
		Hanoi h2 = new Hanoi(0);
		System.out.println(h2.move(0, 0, 1, 2));
		System.out.println("Total moves: "+h2.getMoveCount());
	}
}