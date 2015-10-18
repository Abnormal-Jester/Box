public class PlayBox extends Box {
    
    // field
    // size of the box
    public boolean open;

    // constructor
    public PlayBox (boolean openStart, int lengthStart, int widthStart, int heightStart){
        super(lengthStart, widthStart, heightStart);
        open = openStart;
    }

    // method
    public void openBox () {
        open = true;
        System.out.println(open);
    }

    public void messWithBox () {
        open = !open;
        System.out.println(open);
    }
    
    public static void main (String []args){
        System.out.println("Start");
        
        PlayBox  s = new PlayBox(true, 1, 1, 1);
        s.messWithBox ();
        
        PlayBox  w = new PlayBox(true, 1, 1, 1);
        w.messWithBox ();
        
        s.messWithBox ();
    }
}