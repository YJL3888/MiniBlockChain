import java.util.Arrays;

public class Block {

    @Override
    public String toString() {
        return "Block{" +
                "previousHash=" + previousHash +
                ", data='" + data + '\'' +
                ", hash=" + hash +
                '}';
    }

    private int previousHash;
    private String data;
    private int hash;

    public Block(String data,int previousHash){

        this.data=data;
        this.previousHash=previousHash;


        // The Hash is created from the data of current block but also previous block.

        this.hash = Arrays.hashCode(new int[]{data.hashCode(), previousHash});

    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }
}
