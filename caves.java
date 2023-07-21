import java.util.*;
class caves
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] heights = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                heights[i][j] = scanner.nextInt();
            }
        }
        int sumOfRiskLevels = 0;
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                int height = heights[i][j];
                boolean isLowPoint = true;
                for (int k = -1; k <= 1; k++) 
				{
                    for (int l = -1; l <= 1; l++) 
					{
                        if (k == 0 && l == 0) continue;
                        int neighborRow = i + k;
                        int neighborCol = j + l;
                        if (neighborRow >= 0 && neighborRow < rows && neighborCol >= 0 && neighborCol < cols) 
						{
                            if (heights[neighborRow][neighborCol] < height) 
							{
                                isLowPoint = false;
                                break;
                            }
                        }
                    }
                    if (!isLowPoint) break;
                }
                if (isLowPoint) 
				{
                    sumOfRiskLevels += height + 1;
                }
            }
        }
        System.out.println(sumOfRiskLevels);
    }
}
