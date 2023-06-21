package HomeBox;

public class BoxConstructor {
    public int lenght;
    public int wight;
    public int height;
    public int volume;

    public BoxConstructor(int l,int w, int h){

        this.lenght = l;
        this.wight = w;
        this.height = h;
        this.volume = l * w * h;

        System.out.println("volume = " + volume);





    }

}


