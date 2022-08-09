package ToParse;
import codes.*;

public class MyListener extends JthonBaseListener {

    @Override
    public void exitProgram(JthonParser.ProgramContext ctx) {
        for(int i =0 ; i<ctx.getChildCount(); i++)
        System.out.println(" " + ctx.getChild(i).getText());
    }
}
