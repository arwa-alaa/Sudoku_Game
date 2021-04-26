package sudoku;



public class Hint_Easy extends S_Hint {
    
    int row;
    int column;
     
    @Override
     void findhint( SudokuModel o)
    {
        o.Copy();  
        o.Check();
        row=o.ro;
        column=o.co;    
    }
     
     @Override
   public int getRow()
   {
       return row;
   }
   
    @Override
   public int getColumn()
   {
       return column;
   }
  
}