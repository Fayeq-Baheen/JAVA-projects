public class Location {
    
    public int row, column;
    public double maxValue;

    public Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    public static Location locateLargest(double[][] a){
        int row = 0, column = 0;
        double maxValue = a[0][0];
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a[i].length; j++){
                if(maxValue < a[i][j]){
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row, column, maxValue);
    }








}
