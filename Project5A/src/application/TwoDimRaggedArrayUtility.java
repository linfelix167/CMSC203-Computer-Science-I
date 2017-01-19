package application;
import java.io.*;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	/**
	 * Reads from a file
	 * @param file the file to read from
	 * @return a ragged
	 */
    public static double[][] readFile(File file) {
        
    		double[][] arr = null;
    		
        try {
            Scanner in = new Scanner(file);
            int rows = 0;
            while(in.hasNextLine()){
                ++rows;
                in.nextLine();
            }
            in.close();
            in = new Scanner(file);
            String line;
            arr = new double[rows][];
            for(int i = 0; i < arr.length; i++){
                line = in.nextLine();
                String[] nums = line.split(" ");
                arr[i] = new double[nums.length];
                for(int j = 0; j < arr[i].length; j++){
                    arr[i][j] = Double.valueOf(nums[j]);
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    /**
     * Writes the ragged array of doubles into the file.
     * @param arr two dimensional ragged array of doubles
     * @param file the file to write to
     */
    public static void writeToFile(double[][] arr, File file){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    bw.write(arr[i][j] + " ");
                }
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the total of all the elements of the two dimensional array
     * @param arr the two dimensional array getting total of
     * @return the sum of all the elements in the two dimensional array
     */
    public static double getTotal(double[][] arr){
        double total = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
        }
        return total;
    }
    
    /**
     * Returns the average of the elements in the two dimensional array
     * @param data the two dimensional array getting the average of
     * @return the average of the elements in the two dimensional array 
     */
    public static double getAverage(double[][] arr){
		
    		double total = 0;
		int count = 0;
		
		for(int i =0; i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				total += arr[i][j];
				count++;
			}
		}
		
		
		return (total/count);
	}

    /**
     * Returns the total of the selected row in the two dimensional array index 0 refers to the first row
     * @param arr the two dimensional array
     * @param row the row index to take the total of (0 refers to the first row)
     * @return the total of the row
     */
    public static double getRowTotal(double[][] arr, int row) {
        
    		double total = 0;
    		
        for(int i = 0; i < arr[row].length; i++){
            total += arr[row][i];
        }
        return total;
    }
    

    /**
     * Returns the total of the selected column in the two dimensional array index 0 refers to the first column.
     * If a row in the two dimensional array doesn't have this column index, 
     * it is not an error, it doesn't participate in this method.
     * @param arr  the two dimensional array
     * @param col the column index to take the total of (0 refers to the first column)
     * @return the total of the column
     */
    public static double getColumnTotal(double[][] arr, int col) {
        
    		double total = 0;
    		
        for(int i = 0; i < arr.length; i++){
            if(col < arr[i].length)
                total += arr[i][col];
        }
        return total;
    }

    /**
     * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
     * @param data the two dimensional array
     * @param row the row index to find the largest element of (0 refers to the first row)
     * @return the largest element of the row
     */
    public static double getHighestInRow(double[][] arr, int row){
		
    		double max = 0;
    		
		for(int i =0; i < arr[row].length;i++){
			
			if(max < arr[row][i])
				max = arr[row][i];
		}
		return max;
	}
    
    /**
     * Returns the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
     * @param data the two dimensional array
     * @param row the row index to find the smallest element of (0 refers to the first row)
     * @return the smallest element of the row
     */
    public static double getLowestInRow(double[][] arr, int row){
    	
    		double min = Double.MAX_VALUE;
    		
		for(int i =0; i < arr[row].length;i++){
			
			if(min > arr[row][i])
				min = arr[row][i];
		}
		return min;
	}
    

    /**
     * Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column. 
     * @param data the two dimensional array
     * @param col  the column index to find the largest element of (0 refers to the first column)
     * @return the largest element of the column
     */
    public static double getHighestInColumn(double[][] arr, int col) {
    	
    		double max = 0; 
        for(int i = 0; i < arr.length; i++){
        	
        	if(arr[i].length>col){
        		if(arr[i][col] > max){
        			max = arr[i][col];
        		}
        	}
        }
        return max;
    }
    
    /**
     * Returns the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
     * @param data  the two dimensional array
     * @param col  the column index to find the smallest element of (0 refers to the first column)
     * @return the smallest element of the column
     */
    public static double getLowestInColumn(double[][] arr, int col){
    	
    		double min = Double.MAX_VALUE; 
    	
        for(int i = 0; i < arr.length; i++){
        	
        	if(arr[i].length>col){
        		if(arr[i][col] < min){
        			min = arr[i][col];
        		}
        	}
        }
        return min;
	}
    
    /**
     * Returns the largest element in the two dimensional array
     * @param data the two dimensional array
     * @return the largest element in the two dimensional array
     */
    public static double getHighestInArray(double[][] arr){
		
    		double max = arr[0][0];
    		
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j<arr[i].length;j++){
				if(arr[i][j] > max)
					max = arr[i][j];
			}
		}
		return max;
	}
	
    /**
     * Returns the smallest element in the two dimensional array
     * @param data  the two dimensional array
     * @return the smallest element in the two dimensional array
     */
	public static double getLowestInArray(double[][] arr){
		
		double min = arr[0][0];
		
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j<arr[i].length;j++){
				if(arr[i][j] < min)
					min = arr[i][j];
			}
		}
		return min;
	}


}
