
// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import sas.antlr.FreeSASBaseListener;
import sas.antlr.FreeSASLexer;
//import sas.antlr.FreeSASListener;
import sas.antlr.FreeSASParser;

public class Test {
    public static void main(String[] args) throws Exception {
        //String input = "SAS code/sas-grammar-samples/test_proc_sql.sas";
        //String input = "SAS code/sas-grammar-samples/test_proc_means.sas";
        String input = "SAS code/sas-grammar-samples/test_proc_import.sas";

        //String input = "SAS code/sas-grammar-samples/test01.sas";
        //String input = "SAS code/00_SAS/Programas_CH/2019/02-Apartado_C_2019.sas";
        CharStream codePointCharStream = CharStreams.fromFileName(input);

        FreeSASLexer lexer = new FreeSASLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FreeSASParser parser = new FreeSASParser(tokens);

        //FreeSASParser.Datastmt_cmdContext tree = parser.datastmt_cmd();
        FreeSASParser.Sas_stmt_listContext tree = parser.sas_stmt_list();

        FreeSASBaseListener listener = new FreeSASBaseListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree); // initiate walk of tree with listener in use of default walker
        System.out.println(".");
    }
}