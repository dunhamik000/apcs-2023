package unit11.b;

// let's explore inheritance!
public class Bear {
    //composition
    private Zoo whereItLives;
    private String name;

    public Bear(){
        this.name = "Mr. Bear";
    }

    public Bear(String myName){
        this.name = myName;
    }

    public static void main(String[] args){
        Panda meilan = new Panda("Mei Lan");
        Bear myBear = new Bear();
        Panda mrPandaBear = new Panda();
    }
}

// https://wwf.panda.org/wwf_news/?163461/Is-the-giant-panda-a-bear
class Panda extends Bear{
    private String myPandaName;

    public Panda(){

    }

    public Panda(String pandaName){
        super(pandaName);
        this.myPandaName = pandaName;
    }
}

// https://en.wikipedia.org/wiki/List_of_giant_pandas
class Zoo {
    //composition
    private Panda inhabitant;
}

// Zookeeper, Visitor, etc.

// Inheritance 
// extends: is a
//   - Private still restricted through inheritance
// composition: has a
// if no constructor, Java automaticly makes one with no parameters
// always have to call a constructor