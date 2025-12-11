import java.io.File;

import cder.flags.Autograder;

public class Autograde 
{
    public static void main(String[] args) throws Exception
    {
        Autograder ag = new Autograder();

        File flagFunctionsFile = new File("bin/Lab03FlagMaker.class");
        
        ag.testFlags(flagFunctionsFile);
    }
    
}
