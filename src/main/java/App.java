import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String [] args){
        List<String> tempTxList = new ArrayList<String>();
        tempTxList.add("Stevn => Khalil (+10)");
        tempTxList.add("eric => Shivam (+100)");
        tempTxList.add("khalil => eric(+33)");
        tempTxList.add("Jake => Wanye(+200)");
        tempTxList.add("Fin => Drake(+56)");
        tempTxList.add("Travis => Kanye(+1)");

        MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
        merkleTrees.merkle_tree();
        System.out.println("This will be place in data column of our blocks");
        System.out.println("root: " + merkleTrees.getRoot());
    }

    }

