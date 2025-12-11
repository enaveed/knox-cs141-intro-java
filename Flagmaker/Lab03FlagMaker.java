import cder.flags.Flag;
import cder.flags.IDrawGrid;
import javafx.scene.paint.Color;

public class Lab03FlagMaker 
{
    //TODO: generate this file programmatically
    @Flag("Poland")
    public static void drawPolandFlag(IDrawGrid grid)
    {
        grid.clearGrid();
        for (int r = grid.getNumRows()/2; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
    }
    
    @Flag("Indonesia")
    public static void drawIndonesiaFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Indonesia flag");
        //TODO: implement this method
        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows()/2; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }

    }

    @Flag("Ukraine")
    public static void drawUkraine(IDrawGrid grid)
    {
        System.out.println("Drawing Ukraine flag");
        //TODO: implement this method
        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows()/2; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
       
        for (int r = grid.getNumRows()/2; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }



    }
    

    @Flag("Armenia")
    public static void drawArmeniaFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Armenia flag");
        //TODO: implement this method
        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows()/3; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
       
        for (int r = grid.getNumRows()/3; r < 2 * grid.getNumRows()/3; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }

        for (int r = 2 * grid.getNumRows()/3; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.ORANGE);
            }
        }


       
    }
    
    @Flag("Romania")
    public static void drawRomaniaFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Romania flag");
        //TODO: implement this method

        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols()/3; c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
       
        for (int r = 0; r < grid.getNumRows(); r++)
        {
            for (int c = grid.getNumCols()/3; c < 2*grid.getNumCols()/3; c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }

        for (int r = 0; r < grid.getNumRows(); r++)
        {
            for (int c = 2 * grid.getNumCols()/3; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }

    }

    @Flag("Mauritius")
    public static void drawMauritiusFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Mauritius flag");
        //TODO: implement this method

        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows()/4; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
       
        for (int r = grid.getNumRows()/4; r < 2 * grid.getNumRows()/4; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }

        for (int r = 2 * grid.getNumRows()/4; r < 3 * grid.getNumRows()/4; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }

        for (int r = 3 * grid.getNumRows()/4; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
        }

    }
    
    @Flag("Colombia")
    public static void drawColombiaFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Colombia flag");
        //TODO: implement this method

        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows()/2; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
       
        for (int r = grid.getNumRows()/2; r < 3 * grid.getNumRows()/4; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }

        for (int r = 3 * grid.getNumRows()/4; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }

    }
    
    @Flag("Panama")
    public static void drawPanamaFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Panama flag");
        //TODO: implement this method

        grid.clearGrid();
        for (int r = grid.getNumRows()/2; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols()/2; c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
       
        for (int r = 0; r < grid.getNumRows()/2; r++)
        {
            for (int c = grid.getNumCols()/2; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }

    }

    @Flag("LGBTQ")
    public static void drawLGBTQFlag(IDrawGrid grid)
    {
        System.out.println("Drawing LGBTQ flag");
        //TODO: implement this method

        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows()/6; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
       
        for (int r = grid.getNumRows()/6; r < 1 * grid.getNumRows()/3; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.ORANGE);
            }
        }

        for (int r = 1 * grid.getNumRows()/3; r < 1 * grid.getNumRows()/2; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }

        for (int r = 1 * grid.getNumRows()/2; r < 2 * grid.getNumRows()/3; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
        }

        for (int r = 2 * grid.getNumRows()/3; r < 5 * grid.getNumRows()/6; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }

        for (int r = 5 * grid.getNumRows()/6; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.PURPLE);
            }
        }


    }

    @Flag("Bisexual")
    public static void drawBisexualFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Bisexual flag");
        //TODO: implement this method

        grid.clearGrid();
        for (int r = 0; r < 2 * grid.getNumRows()/5; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.PINK);
            }
        }
       
        for (int r = 2 * grid.getNumRows()/5; r < 3 * grid.getNumRows()/5; r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.PURPLE);
            }
        }

        for (int r = 3 * grid.getNumRows()/5; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }


    }
    
    @Flag("CentralAfricanRepublic")
    public static void drawCentralAfricanRepublicFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Central African Republic flag");
        //TODO: implement this method

        grid.clearGrid();
        for (int r = 0; r < grid.getNumRows()/4; r++)
        {
            for (int c = 0; c < 7 * grid.getNumCols()/16; c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
       
        for (int r = grid.getNumRows()/2; r < 3 * grid.getNumRows()/4; r++)
        {
            for (int c = 0; c < 7 * grid.getNumCols()/16; c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
        }

        for (int r = 3 * grid.getNumRows()/4; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < 7 * grid.getNumCols()/16; c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }

        for (int r = 0; r < grid.getNumRows(); r++)
        {
            for (int c = 7 * grid.getNumCols()/16; c < 9 * grid.getNumCols()/16; c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }

        for (int r = 0; r < grid.getNumRows()/4; r++)
        {
            for (int c = 9 * grid.getNumCols()/16; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
       
        for (int r = grid.getNumRows()/2; r < 3 * grid.getNumRows()/4; r++)
        {
            for (int c = 9 * grid.getNumCols()/16; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
        }

        for (int r = 3 * grid.getNumRows()/4; r < grid.getNumRows(); r++)
        {
            for (int c = 9 * grid.getNumCols()/16; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        

        



    }
    
    @Flag("Japan")
    public static void drawJapanFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Japan flag");
        //TODO: implement this method

        for (int r = grid.getNumRows()/3; r < 2 * grid.getNumRows()/3; r++)
        {
            for (int c = grid.getNumCols()/3; c < 2 * grid.getNumCols()/3; c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }


    }
    
    @Flag("Djibouti")
    public static void drawDjiboutiFlag(IDrawGrid grid)
    {
        System.out.println("Drawing Djibouti flag");
        //TODO: implement this method
        int numrows = 0;
        int cols = 2;
        for (int r = 0; r <  grid.getNumRows()/2; r++)
        {
            
            for (int c =cols ; c <  grid.getNumCols(); c++)
            {
                
                grid.setColor(r, c, Color.BLUE);
            }  
            cols = cols + 2;
             
             
        }

        for (int r = grid.getNumRows()-1; r >=  grid.getNumRows()/2; r--)
        {
            
            for (int c = 2 +(numrows * 2); c <  grid.getNumCols(); c++)
            {


                 grid.setColor(r, c, Color.GREEN);
            } 
            numrows = numrows + 1; 
             
        }
       
      


        

    }
    
    @Flag("Kuwait")
    public static void drawKuwaitFlag(IDrawGrid grid)
    {
        
        
        System.out.println("Drawing Kuwait flag");
        //TODO: implement this method
        int col = 1;
        int row = 1;
        for(int r = 0; r < grid.getNumRows(); r++)
        {
            for(int c = 0; c < (1* grid.getNumCols()/5) + 1;c++)
            {
                grid.setColor(r, c, Color.BLACK);
            }
        }
        for(int r = 0; r< grid.getNumRows()/3; r++)
        {
            for(int c = col; c< grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
            col = col + 1;
        }
        for(int r = grid.getNumRows()-1; r>= 2* grid.getNumRows()/3; r--)
        {
            for(int c = row; c< grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
            row= row +1;
            
        }
    
            




    }
    
    @Flag("Macedonia")
    public static void drawMacedoniaFlag(IDrawGrid grid)
    {
        
        System.out.println("Drawing Macedonia flag");
        //TODO: implement this method
        grid.clearGrid();

        int width = grid.getNumCols(); // Get the width of the flag
        int height = grid.getNumRows(); // Get the height of the flag

        
        for (int rows = 0; rows < height; rows++) {
            for (int cols = 0; cols < width; cols++) {
                grid.setColor(rows, cols, Color.RED);
            }
        }
        
        int squareHeight = 4;
        int squareWidth = 8;
        int squareStartRow = (height - squareHeight) / 2;
        int squareStartCol = (width - squareWidth) / 2;

        for (int rows = squareStartRow; rows < squareStartRow + squareHeight; rows++) {
            for (int cols = squareStartCol; cols < squareStartCol + squareWidth; cols++) {
                grid.setColor(rows, cols, Color.YELLOW);
            }
        }
        
        for (int cols = 0; cols < width; cols++) {
            grid.setColor(height / 2, cols, Color.YELLOW);
            grid.setColor(height / 2 - 1, cols, Color.YELLOW);
        }

     
        for (int rows = 0; rows < height; rows++) {
            grid.setColor(rows, width / 2, Color.YELLOW);
            grid.setColor(rows, width / 2 - 1, Color.YELLOW);
        }

        
        for (int rows = 0; rows < height; rows++) {
            for (int cols = rows * 2; cols < rows * 2 + 2; cols++) { 
                if (cols < width) {
                    grid.setColor(rows, cols, Color.YELLOW);
                }
            }
        }

        
        for (int rows = 0; rows < height; rows++) {
            for (int cols = width - rows * 2 - 1; cols > width - rows * 2 - 3; cols--) { 
                if (cols >= 0) {
                    grid.setColor(rows, cols, Color.YELLOW);
                }
            }
        }
    }

        

    @Flag("Eritrea")
    public static void drawEritreaFlag(IDrawGrid grid)
    {
        int col = 4;
        int row = 4;
        System.out.println("Drawing Eritrea flag");
        //TODO: implement this method
        for( int r = 0; r< grid.getNumRows();r++)
        {
            for(int c = 0; c< grid.getNumCols() ; c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        for(int r = 0; r< (grid.getNumRows()/2)-1 ;r++)
        {
            for(int c = col; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
            col = col +4;
        }
        for(int r = grid.getNumRows()-1; r>(grid.getNumRows()/2);r--)
        {
            for(int c = row; c< grid.getNumCols();c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
            row = row +4;

        }


    }
        
}
