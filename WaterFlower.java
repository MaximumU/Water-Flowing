public class WaterFlower {
    public static boolean canFlowOff(int[][] map, int row, int col) {
        if (row < 1|| row > 8|| col < 1|| col > 8)
            return true;
        else if (map[row + 1][col] > map[row][col]&&map[row][col + 1] > map[row][col]&&map[row][col] > map[row - 1][col]&&map[row][col] > map[row][col - 1])
            return false;
        else 
            return (canFlowOff(map, row + 1, col)||canFlowOff(map, row, col + 1)||canFlowOff(map, row - 1, col)||canFlowOff(map, row, col - 1));
    }
    public static void main (String[] args) {
        int[][] map1 = {
			{100, 99, 200, 200, 200, 200, 200, 200, 200, 200}, 
			{200, 98, 200, 200, 200, 200, 200, 200, 200, 200},
			{200, 97, 96, 200, 200, 200, 200, 200, 200, 200},
			{200, 200, 95, 200, 200, 200, 85, 84, 83, 200},
			{200, 200, 94, 93, 92, 200, 86, 200, 82, 200},
			{200, 150, 200, 200, 91, 200, 87, 200, 81, 200},
			{200, 200, 200, 200, 90, 89, 88, 200, 80, 200},
			{200, 150, 100, 200, 200, 200, 200, 200, 79, 200},
			{200, 200, 200, 200, 200, 200, 200, 200, 78, 77},
			{200, 98, 200, 200, 200, 200, 200, 200, 200, 76}		
	    }; 
        if(canFlowOff(map1, 4, 5))
            System.out.println("Water can flow");
        else
            System.out.println("Water can't flow");
