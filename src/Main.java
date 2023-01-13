import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Block> blockChainList=new ArrayList<>();

        Block genesis =new Block("Jason BlockChain", 0);
        blockChainList.add(genesis);


        Block block1 = new Block("This is the First Transaction", genesis.getHash());
        blockChainList.add(block1);



        Block block2 = new Block("This is the Second Transaction",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(block2);


        Block block3 = new Block("This is the Third Transaction",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(block3);


        blockChainList.forEach(System.out::println);

    }
}








