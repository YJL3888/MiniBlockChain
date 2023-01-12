import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Block> blockChainList=new ArrayList<>();

        Block genesis =new Block("Jason BlockChain", 0);

        blockChainList.add(genesis);


        Block blockX = new Block("Hello",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);



        Block blockY = new Block("This is",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);


        Block blockZ = new Block("My BlockChain",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);


        blockChainList.forEach(System.out::println);


    }
}








