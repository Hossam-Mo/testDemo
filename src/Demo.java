public class Demo {

    private int x,y;


    public Demo(int x, int y){
        this.x=x;
        this.y=y;

    }



    public int biggerNum(){

        return x >y ? x : y;
    }

    public  int smallestNum(){

        return x<y? x : y;
    }

    public  boolean isEqual(){
        return  x == y;
    }


}
