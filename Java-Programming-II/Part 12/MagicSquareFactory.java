
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int row = 0;
        int col = (int) size/2;
        
        int count = 1;
        int new_row, new_col;
        
        while (count <= size*size){
            square.placeValue(col, row, count);
            count += 1;
            
            new_row = row-1;
            if (new_row < 0){
                new_row = size-2-new_row;
            }
            
            new_col = col+1;
            if (new_col >= size){
                new_col = new_col-size;
            }
            
            if (square.readValue(new_col, new_row) != 0){
                new_row = row+1;
                new_col = col;
                if (new_row >= size){
                    new_row = new_row-size;
                }
            }
            
            row = new_row;
            col = new_col;
        }
        return square;
    }

}
