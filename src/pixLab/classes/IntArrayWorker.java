package pixLab.classes;
public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] matrix)
  {
    this.matrix = matrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  public int getLargest()
  {
	  int largest = Integer.MIN_VALUE;

	// Both of these methods work. The first is a "for" loop, the second is a "for each" loop.
	  for(int row = 0; row < matrix.length; row++)
	  {
		  for(int col = 0; col < matrix[0].length; col++)
		  {
			  if(matrix[row][col] > largest)
			  {
				  largest = matrix[row][col];
			  }
		  }
	  }
	  
	  for (int[] row : matrix)
	  {
		  for (int value : row)
		  {
			  if (value > largest)
			  {
				  largest = value;
			  }
		  }
	  }
	  
	  return largest;
  }

  public int getCount(int searchValue)
  {
	  int countTotal = 0;
	  
	// Both of these methods work. The first is a "for" loop, the second is a "for each" loop.
	  for(int row = 0; row < matrix.length; row++)
	  {
		  for(int col = 0; col < matrix[0].length; col++)
		  {
			  if(matrix[row][col] == searchValue)
			  {
				  countTotal++;
			  }
		  }
	  }
	  
	  countTotal = 0;
			  
	  for(int [] row : matrix)
	  {
		  for(int spot : row)
		  {
			  if(spot == searchValue)
			  {
				  countTotal++;
			  }
		  }
	  }
	  
	  return countTotal;
  }
  
  public int getColTotal(int ColValue)
  {
	  int totalCol = 0;
	  
	  for(int [] row : matrix)
	  {
		  totalCol += row[ColValue];
	  }
	  
	  for(int row = 0; row < matrix.length; row++)
	  {
		  totalCol += matrix[row][ColValue];
	  }
	  
	  return totalCol;
  }
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
        {
        	 matrix[row][col] = 1;
        }
         
        else if (row == col)
        {
          matrix[row][col] = 2;
        }
        else
        {
        	 matrix[row][col] = 3;
        }
      }
    }
  }
  
}